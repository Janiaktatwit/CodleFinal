
package codle.v1;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CodleMain extends Application {

	public static void main(String[] args) {launch(args);}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		primaryStage.setTitle("Codle!");
		final Button btn = new Button("Generate Word");
		final Button key = new Button("");
		final GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		final Text word = new Text("");
		final Text word2 = new Text("");
		TextField entry = new TextField();
		final Button submit = new Button("Submit");
		grid.add(word, 1, 1);
		grid.add(btn, 1, 2);
		grid.add(word2, 2, 1);
		grid.add(key, 1, 3);
		grid.add(entry, 3, 2);
		grid.add(submit, 3, 3);
		RandomWord ranWord = new RandomWord();	
		grid.setOnKeyPressed(e -> {
			word2.setText(String.format("%s", e.getCode()));
		});
		String g = "coding";
		//Guess g = new Guess(new RandomWord().toString());
		
		btn.setOnMouseClicked(e -> {
			word.setText(ranWord.randomWord());
		});
		submit.setOnMouseClicked(e -> {
			if (entry.getText().equals(g)) {
				key.setText("Correct");
			}
		});
		primaryStage.setScene(new Scene(grid, 300, 250));
		primaryStage.show();
		
		
	} 

}
