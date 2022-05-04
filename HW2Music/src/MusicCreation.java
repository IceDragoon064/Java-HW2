import java.util.ArrayList;

/**
 * Class to create new songs and albums 
 * @author Leon Lu
 * @version 1.0 5/4/2022
 */
public class MusicCreation
{
	/**
	 * Primary method to create songs and albums and populate them into the array list
	 * @param albumArray - the initially created albumArray that will be populated 
	 * @return albumArray - return the populated albumArray to be used in MusicCollection.java
	 */
	public ArrayList<Album> createMusic(ArrayList<Album> albumArray)
	{
		//Create a song object followed by an album for each song
		Song firstSong = new Song ("Never Gonna Give You Up", "Rick Astley", "pop");	
		Album firstAlbum = new Album("Internet Fun", firstSong, 64);
		albumArray.add(firstAlbum);
		
		Song secondSong = new Song ("Aerodynamic", "Daft Punk", "techno");
		Album secondAlbum = new Album ("Best Song of All Time", secondSong);
		albumArray.add(secondAlbum);

		Song thirdSong = new Song ("Hello There", "Obi-Wan Kenobi");
		Album thirdAlbum = new Album ("Griveous Collection", thirdSong, 66);
		albumArray.add(thirdAlbum);
		
		return albumArray;
	}

}