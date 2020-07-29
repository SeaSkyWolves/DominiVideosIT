package model;
import java.util.List;

public class Video {
	
	private String url;
	private String videoName;
	private List <String> tags;

	
	
	public Video(String url, String videoName, List <String> tags) {
		this.url = url;
		this.videoName = videoName;
		this.tags = tags;		
	}
	
	String getVideo(){
		return videoName;
	}
	
	String getUrl(){
		return url; 
	}
	
	List<String> getTags(){
		return tags;
	}
	
	String getVideoInfo() {
		return "Nom del vídeo: " + videoName
		+ " Url: " + url
		+ " Tags: " + tags.toString();
	}
}
