
package codle.v1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CodleMain extends Application {

	public static void main(String[] args) {launch(args);}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Codle!");
		final Button btn = new Button("Generate Word");
		final GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		final Text word = new Text("");
		grid.add(word, 1, 1);
		grid.add(btn, 1, 2);
		RandomWord ranWord = new RandomWord();
		
		
		btn.setOnMouseClicked(e -> {
			word.setText(ranWord.randomWord());
		});
		primaryStage.setScene(new Scene(grid, 300, 250));
		primaryStage.show();
		
	}

}
