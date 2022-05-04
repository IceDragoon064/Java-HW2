/**
 * @author Leon Lu
 * @version 1.0 5/3/2022
 * This class is used to store the title, artist, genre of a song
 */
public class Song
{
	private String title;
	private String artist;
	private String genre;
	
	/**
	 * @param title - String for the song's title
	 * @param artist - String for the song's artist
	 * @param genre - String for the song's genre
	 * This is a constructor method to create a new Song object
	 */
	public Song(String title, String artist, String genre)
	{
		this.title = title;
		this.artist = artist;
		this.genre = genre;
	}
	
	/**
	 * Second constructor with two parameters:
	 * @param title - String for the song's title
	 * @param artist - String for the song's artist
	 */
	public Song(String title, String artist)
	{
		//Pass the method's parameters to first constructor
		this(title, artist, "unknown");
	}
	
	/**
	 * The following three methods are getter
	 * Their purpose is to return a value when called
	 */
	
	/**
	 * @return title - return Song object's title
	 */
	public String getTitle()
	{
		return this.title;
	}
	
	/**
	 * @return artist - return Song object's artist
	 */
	public String getArtist()
	{
		return this.artist;
	}
	
	/**
	 * @return genre - return Song object's genre or unknown if no genre was set
	 */
	public String getGenre()
	{
		return this.genre;
	}
	
	/**
	 * The following three methods are setter
	 * Their purpose is to set a value within the Song object
	 */
	
	/**
	 * @param title - The string that will be set as the Song object's title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * @param artist - The string that will be set as the Song object's artist
	 */
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	
	/**
	 * @param genre - The string that will be set as the Song object's genre
	 */
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	

	/**
	 * @return returnString - Return an String array containing song object's title, artist, and genre
	 */
	public String[] songString()
	{
		String[] returnString = {this.title, this.artist, this.genre};
		return returnString;
	}
	
}