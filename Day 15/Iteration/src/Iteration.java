import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Song{
	private String title;
	private String artist;
	private int durationInSeconds;
	public Song(String title, String artist, int durationInSeconds) {
		this.title = title;
		this.artist = artist;
		this.durationInSeconds = durationInSeconds;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getDurationInSeconds() {
		return durationInSeconds;
	}

	@Override
	public String toString() {
		return "Title: "+title+", Artist: "+artist+", Duration: "+durationInSeconds+ "s";
	}
}
public class Iteration {

	private static final String Iterator = null;

	public static void main(String[] args) {
		  List<Song> playlist = new ArrayList<>();

	        // Add 5–7 sample songs
	        playlist.add(new Song("Shape of You", "Ed Sheeran", 240));
	        playlist.add(new Song("Perfect", "Ed Sheeran", 263));
	        playlist.add(new Song("Photograph", "Ed Sheeran", 178)); 
	        playlist.add(new Song("Blinding Lights", "The Weeknd", 200));
	        playlist.add(new Song("Starboy", "The Weeknd", 150));     
	        playlist.add(new Song("Levitating", "Dua Lipa", 220));
	        playlist.add(new Song("Don't Start Now", "Dua Lipa", 175));

	        // Display playlist
	        // Task 1
	        for (Song song : playlist) {
	            System.out.println(song);
	        }
	        // Task 2
	        System.out.println("----------------------------------------------");
	        String chosenArtist="The Weeknd";
	        boolean found=false;
	        for (int i = 0; i < playlist.size(); i++) {
	            Song song = playlist.get(i);
	            if (song.getArtist().equalsIgnoreCase(chosenArtist)) {
	                System.out.println(song);
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No songs found by artist: " + chosenArtist);
	        }
          // Task 3
	        int sum=0;
	        System.out.println("----------------------------------------------");
	        Iterator<Song> iterator1 = playlist.iterator();
	        while(iterator1.hasNext()) {
	        	Song song1=iterator1.next();
	        sum+=song1.getDurationInSeconds();
	        }
	        
	        System.out.println("Total duration of the playlist in seconds. "
	        		+ sum);
	        
	        
	        
	        //task 4
	        System.out.println("----------------------------------------------");
	        Iterator<Song> iterator = playlist.iterator();
	        
	        while (iterator.hasNext()) {
	            Song song4 = iterator.next();
	            if (song4.getDurationInSeconds() < 180) {
	                iterator.remove(); // Safe removal during iteration
	            }
	        }

	        for (Song song : playlist) {
	            System.out.println(song);
	        }
	
	
	}
	}

