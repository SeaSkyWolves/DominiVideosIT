import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user;
		
		try {
			user = new User("usuari1", "cognom1", "1234", new Date());
			
			List<String> tags = new ArrayList<String>(Arrays.asList("music", "sing", "pop"));
			user.addVideo("singin", "someurl", tags);
			
			user.viewVideosList();
			
			user.getUserData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
