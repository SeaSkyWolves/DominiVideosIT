import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	
	private String name;
	private String surname;
	private String password;
	private Date date;
	private List <Video> videos = new ArrayList<Video>();
	
	
	User() throws Exception {
		throw new Exception("No has inserit cap dada");

	}
	
	User(String name, String surname, String password, Date date) throws Exception {
		
		if( name == "" || surname == "" || password =="") {
			throw new Exception("Has d'inserir les dades: video, url i un llistats de tags");
		}
		
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.date = date; 
	}
	
	
	void addVideo(String videoName, String url, List <String> tags){
		try {
			Video video = new Video(videoName, url, tags);
			videos.add(video);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	void viewVideosList() {
		for(Video video: videos) {
			video.getVideo();
		}
	}
	
	void getUserData() {
		System.out.printf("Hola %s %s. Et vas registrar el dia %s %n", name, surname, date.toString());
	}
	
}
