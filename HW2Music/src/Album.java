/**
 * @author Leon Lu
 * @version 1.0, 5/3/2022
 * This class stores information for the album object and utilize Song object to get or set song information
 */
public class Album
{
	private String title;
	private String artist;
	private String genre;
	private Song favoriteTrack;
	private int trackNumber;
	static int numAlbums;
	
	/**
	 * Constructor to create new Album object with the follow parameters:
	 * @param title - Set title for the album
	 * @param favoriteTrack - Set the favorite track for the album
	 * @param trackNumber - Set the track number of the song
	 * Increment numAlbum for each album object created
	 */
	public Album(String title, Song favoriteTrack, int trackNumber)
	{
		this.title = title;
		this.favoriteTrack = favoriteTrack;
		this.artist = favoriteTrack.getArtist();
		this.genre = favoriteTrack.getGenre();
		this.trackNumber = trackNumber;
		numAlbums = numAlbums + 1;
	}
	
	/**
	 * Second constructor using only 2 parameters. Chains to first constructors.
	 * Will always pass trackNumber as 1
	 * @param title - String value for the album's title
	 * @param favoriteTrack - Song object to be added to album
	 */
	public Album(String title, Song favoriteTrack)
	{
		//Chains to Album constructor with 3 parameters
		this(title, favoriteTrack, 1);		
	}
	
	
	
	/**
	 * The three get methods will return values of the instance variables
	 * @return title - Returns the album's title
	 */
	public String getTitle()
	{
		return this.title;
	}
	
	/**
	 * @return favoriteTrack - Returns the album's favorite track, including song's title, artist, and genre
	 */
	public Song getFavoriteTrack()
	{
		return this.favoriteTrack;
	}
	
	/**
	 * @return trackNumber - Return the track number 
	 */
	public int getTrackNum()
	{
		return this.trackNumber;
	}
	
	
	/**
	 * The three set methods will set the values of the instance variables
	 * @param title - Set the title of the album
	 */
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * @param artist - set the artist value of the song
	 */
	public void setArtist(String artist)
	{
		this.artist = artist;
		this.favoriteTrack.setArtist(artist);
	}
	
	/**
	 * @param genre - set the genre of the song
	 */
	public void setGenre(String genre)
	{
		this.genre = genre;
		this.favoriteTrack.setGenre(genre);
	}
	
	/**
	 * @param favoriteTrack - set a song as the favorite track in the album
	 */
	public void setFavoriteTrack(Song favoriteTrack)
	{
		this.favoriteTrack = favoriteTrack;
	}
	
	/**
	 * @param trackNumber - set a track number of the song in the album
	 */
	public void setTrackNumber(int trackNumber)
	{
		this.trackNumber = trackNumber;
	}
	
	/**
	 * @return returnValue - return a string contain title, artist, and genre
	 */
	public String[] albumString()
	{
		String[] returnValue = {this.title , this.artist , this.genre};
		return returnValue;
	}
	 
}