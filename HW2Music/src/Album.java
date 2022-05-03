/**
 * 
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
		this.artist = favoriteTrack.getArtist();
		this.genre = favoriteTrack.getGenre();
		this.trackNumber = trackNumber;
		numAlbums++;
	}
	
	/**
	 * Second constructor using only 2 parameters. Chains to first constructors.
	 * @param title - String value for the album's title
	 * @param favoriteTrack - Song object to be added to album
	 */
	public Album(String title, Song favoriteTrack)
	{
		//Chains to Album constructor with 3 parameters
		this(title, favoriteTrack, 1);		
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public Song getFavoriteTrack()
	{
		return this.favoriteTrack;
	}
	
	public int getTrackNum()
	{
		return this.trackNumber;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setArtist(String artist)
	{
		this.artist = artist;
		this.favoriteTrack.setArtist(artist);
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
		this.favoriteTrack.setGenre(genre);
	}
	
	public void setFavoriteTrack(Song favoriteTrack)
	{
		this.favoriteTrack = favoriteTrack;
	}
	
	public void setTrackNumber(int trackNumber)
	{
		this.trackNumber = trackNumber;
	}
	
	public String toString()
	{
		String returnValue = this.title + ", " + this.artist + ", " + this.genre;
		return returnValue;
	}
	 
}