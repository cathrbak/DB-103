
import java.sql.Date;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends ConnectionSQL{
	
	public void init() {
		
	}
	
	public void run() {
		
	}
	

	
    @Override
    public void start(Stage primaryStage) throws Exception {
    		
        Parent root_login = FXMLLoader.load(getClass().getResource("Hovedside.fxml"));
        Scene scene_login = new Scene(root_login);
        primaryStage.setScene(scene_login);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
