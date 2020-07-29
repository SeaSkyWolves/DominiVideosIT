package view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class View {
	
	public String getUserName(){
		String name = JOptionPane.showInputDialog("Escriu el teu nom");
		checkInput(name);
		return name;
	}
		
	public String getUserSurname(){
		String surname = JOptionPane.showInputDialog("Escriu el teu cognom");
		checkInput(surname);
		return surname;
	}
	
	public String getUserPassword(){
		String password = JOptionPane.showInputDialog("La teva contrasenya");
		checkInput(password);
		return password;
	}
	
	public String getVideoName() {
		String videoName = JOptionPane.showInputDialog("Quin és el títol del vídeo que vols afegir?");
		checkInput(videoName);
		return videoName;
	}
	
	public String getUrl() {
		String url = JOptionPane.showInputDialog("Enganxa l'url del vídeo");
		checkInput(url);
		return url;
	}
	
	String addTag() {
		boolean algo;
		String tag = "";
		do {
			algo = false;
			tag = JOptionPane.showInputDialog("Escriu un tag:");
			checkInput(tag);
			if (tag.split(" ").length != 1) {
				algo = true;
				System.out.println("Els tags han de ser una única paraula.");
			}
		} while (algo);
		return tag;
	}
	
	
	public List<String> addTags(){
		List<String> tags = new ArrayList<>();
		int answer;
		do {
			tags.add(addTag());
			answer = JOptionPane.showConfirmDialog(null, "Vols afegir un altre tag?", null, JOptionPane.YES_NO_OPTION);
		} while(answer != 1);
		return tags;
	}
	
	public boolean moreVideos(){
		int answer = JOptionPane.showConfirmDialog(null, "Vols afegir més vídeos?", null, JOptionPane.YES_NO_OPTION);
		return answer != 1;
	}

	public void printVideoInfo(List<String> videoInfo) {
		for (String info: videoInfo) {
		System.out.println(info);
		}
	}
	
	
	void printUserData(String name, String surname, Date date) {
		System.out.printf("Hola %s %s. Et vas registrar el dia %s %n", name, surname, date.toString());
	}
	
	void checkInput(String input) {
		if( input.isEmpty()) {
			throw new RuntimeException("Empty field. Please, fill the field correctly.");
		}
	}
	
}
