package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	
	private String name;
	private String surname;
	private String password;
	private Date date;
	private List <Video> videos = new ArrayList<Video>();
	
	
	public User(String name, String surname, String password) {
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.date = new Date(); 
	}
	
	
	public void setVideo(String videoName, String url, List <String> tags){
		Video video = new Video(videoName, url, tags);
		videos.add(video);
	}
	
	
	public List<String> getVideosList() {
		List<String> videoInfo = new ArrayList<String>();
		for(Video video: videos) {
			videoInfo.add(video.getVideoInfo());
		}
		return videoInfo;
	}
	
}
