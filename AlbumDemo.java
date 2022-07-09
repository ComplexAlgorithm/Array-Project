
public class AlbumDemo {
	public static void main(String[] args) {
		Album powerWindows = new Album();
		powerWindows.setName("Power Windows");
		powerWindows.setArtist("Rush");
		powerWindows.addSong("The Big Money",5);
		powerWindows.addSong("Grand Designs", 5);
		
		System.out.println("Name: " + powerWindows.getName());
		System.out.println("Artist: " + powerWindows.getArtist());
		System.out.println("Songs: " + powerWindows.getSongs());
		System.out.println("Running Time: " + powerWindows.getRunningTime());

	}

}
