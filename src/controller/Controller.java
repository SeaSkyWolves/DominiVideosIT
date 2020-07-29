package controller;

import java.util.List;

import model.User;
import view.View;

public class Controller {
	
	private View view = new View();
	private User user; 
	
	
	public void setUser(){
		String name = view.getUserName();
		String surname = view.getUserSurname();
		String password = view.getUserPassword();
		user = new User(name, surname, password);
	}
	
	public void setVideos() {
		do {
			setVideo();
		} while(view.moreVideos());
	}
	
	void setVideo() {
		String videoName = view.getVideoName();
		String url = view.getUrl();
		List<String> tags = view.addTags();
		user.setVideo(videoName, url, tags);
	}
	public void printVideoList() {
		view.printVideoInfo(user.getVideosList());
	}
	

}
