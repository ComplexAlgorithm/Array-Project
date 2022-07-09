
public class Album {
	//instance variables
	private String name;
	private String artist;
	//private String songs;
	private String [] songNameArray; //reference
	private int [] songTimeArray; //reference
	private int runningTime;
	private int numberOfSongs;
	
	//default constructor
	public Album() {
		name = "";
		artist = "";
		//songs = "";
		songNameArray = new String[20];
		songTimeArray = new int[20];
		runningTime = 0;
		numberOfSongs = 0;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setArtist(String newArtist) {
		artist = newArtist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void addSong(String songName, int songTime) {
		if(songTime > 0) {
			//songs = songs + "\n" + songName;
			songNameArray[numberOfSongs] = songName;
			songTimeArray[numberOfSongs] = songTime;
			numberOfSongs++;
			runningTime = runningTime + songTime;
		}
	}
	
	public String  getSongs() {
		String songs = "";
		for(int index = 0; index < numberOfSongs; index++) {
			songs = songs + "\n" + songNameArray[index];
		}
		return songs;
	}
	
	public int getRunningTime() {
		return runningTime;
	}
	
}

