import java.util.List;

public class Video {
	
	private String url;
	private String nomVideo;
	private List <String> tags;
	
	
	Video() throws Exception {
		throw new Exception("No has inserit cap dada del video");
	}
	
	
	Video(String url, String nomVideo, List <String> tags) throws Exception {
		
		if( url == "" || nomVideo == "" || tags.isEmpty()) {
			throw new Exception("Has d'inserir les dades: video, url i un llistats de tags");
		}
		
		this.url = url;
		this.nomVideo = nomVideo;
		this.tags = tags;		
	}	
	
	void getVideo(){
		System.out.printf("El video %s té la url %s i els següents tags: %s %n", nomVideo, url, tags.toString());
	}
}
