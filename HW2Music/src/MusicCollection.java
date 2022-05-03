import java.util.Scanner;

public class MusicCollection
{
	static Scanner input;
	
	public static void main(String args[])
	{
		//Create a song object followed by an album for each song
		Song firstSong = new Song ("Never Gonna Give You Up", "Rick Astley", "pop");
		Album firstAlbum = new Album("Internet Fun", firstSong);
		
		Song secondSong = new Song ("Aerodynamic", "Daft Punk", "techno");
		Album secondAlbum = new Album ("Best Song of All Time", secondSong);
	}
}