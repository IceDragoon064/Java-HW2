import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Leon Lu
 * @version 1.0 5/3/2022
 * The main class that automatically generate songs and albums, and user can interact with the file
 */
public class MusicCollection
{
	static Scanner input;
	
	/**
	 * Function that allow ser to interact with a selected album
	 * @param selectedAlbum - The user selected album from the main option
	 */
	public static void AlbumOptions(Album selectedAlbum)
	{
		boolean doneAlbum = false;

		/**
		 * While loop to keep the user in the album option, unless the input is 0
		 */
		while(!doneAlbum)
		{
			// Print out options for the user
			System.out.println("Album options:");
			System.out.println("[1] Get Favorite Track");
			System.out.println("[2] Change genre");
			System.out.println("[0] Return");
			System.out.print("Selection: ");

			input = new Scanner(System.in);
		
			// Check if the input is an integer
			if(input.hasNextInt())
			{
				int selectionNum = input.nextInt();
				
				// Switch statement to call the appropriate function
				switch (selectionNum)
				{
					case 0: doneAlbum = true;
					System.out.println();
					break;
			
					case 1: printFavoriteTrack(selectedAlbum);
					break;
					
					case 2: changeAlbumGenre(selectedAlbum);
					break;
					
					// Case triggers when the user input the wrong integer
					default: System.out.println("Invalid choice. Try again.");
					break;
				}
			}
			
			// Input is not an integer. Print warning text.
			else
			{
				System.out.println("Input is not an integer. Try again.");
			}
		}
	}
	
	/**
	 * Function to print the favorite track from album option
	 * @param selectedAlbum - An album object to get information from its favorite track
	 */
	public static void printFavoriteTrack(Album selectedAlbum)
	{
		int trackNum = selectedAlbum.getTrackNum();
		String songArtist = selectedAlbum.getFavoriteTrack().getArtist();
		String songName = selectedAlbum.getFavoriteTrack().getTitle();
		String songGenre = selectedAlbum.getFavoriteTrack().getGenre();
		
		System.out.println();
		System.out.println("Track No. " + trackNum + ": " + songArtist + " - " + songName + ", Genre: " + songGenre);
		System.out.println();
	}
	
	/**
	 * Function to allow user to change album genre. The song's genre is also changed.
	 * @param selectedAlbum - An album object to allow genre change
	 */
	public static void changeAlbumGenre(Album selectedAlbum)
	{
		System.out.println();
		System.out.print("New genre: ");
		input = new Scanner(System.in);
		
		
		String newGenre = input.next();
		selectedAlbum.setGenre(newGenre);
	}
	
	
	/**
	 * Main method with a loop for the entire program
	 */
	public static void main(String[] args)
	{
		//Create an array to hold albums
		ArrayList<Album> albumArray = new ArrayList<Album>();
		MusicCreation createMusic = new MusicCreation();
		albumArray = createMusic.createMusic(albumArray);
		
		// Boolean variable for the while loop.
		Boolean isDone = false;
		
		/**
		 * While loop for music collection program
		 */
		while(!isDone)
		{
			System.out.println("Music Collection:");
			
			/**
			 * For loop to print out albums in the following format:
			 * [album number] album name
			 */
			for(int i = 0; i < albumArray.size(); i++)
			{
				System.out.println("[" +(i+1) + "] " + albumArray.get(i).getTitle());
			}
			System.out.print("Select an album (0 to quit): ");
	
			input = new Scanner(System.in);

			// Check if the input is an integer
			if(input.hasNextInt())
			{
				int inputNum = input.nextInt();
				
				// if input is 0, exit the program
				if(inputNum == 0)
				{
					isDone = true;
				}
				
				// if the input does not match the numbers listed in the collection 
				// intended to prevent out of index error
				else if(inputNum < 0 || inputNum > albumArray.size())
				{
					System.out.println();
					System.out.println("Incorrect input.");
				}
				
				// Input is valid
				// Print out the selected album's title, artist, and genre
				// Program will move into album options for the player
				else
				{
					int albumIndexNum = inputNum - 1;
					String albumTitle = albumArray.get(albumIndexNum).getTitle();
					Song selectedSong = albumArray.get(albumIndexNum).getFavoriteTrack();
					String albumArtist = selectedSong.getArtist();
					String albumGenre = selectedSong.getGenre();
					System.out.println();
					System.out.println('"' + albumTitle + '"' +" by " + albumArtist + ": " + albumGenre);	
					System.out.println();
					
					AlbumOptions(albumArray.get(albumIndexNum));
				}
			}
			
			// Input is not an integer. Print warning.
			else
			{
				System.out.println("Incorrect input. Try again.");
				System.out.println();
			}
		}
		System.exit(0);
	}
}