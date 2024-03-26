
package codle.v1;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * 
 * @author Gus Cook
 */
public class LoadCodleUI extends Application implements Initializable {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("CodleUI.fxml"));
		final Pane p = loader.load();
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}
	 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	public static void main(String[] args) {launch(args);}
} // end class LoadCodleUI