
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
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
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
		grid.setOnKeyPressed(e -> {
			word2.setText(String.format("%s", e.getCode()));
		});
		
		final Rectangle r1 = new Rectangle(50, 50);
		final Rectangle r2 = new Rectangle(50, 50);
		final Rectangle r3 = new Rectangle(50, 50);
		final Rectangle r4 = new Rectangle(50, 50);
		final Rectangle r5 = new Rectangle(50, 50);
		final Rectangle r6 = new Rectangle(50, 50);
		Rectangle[] rectangles = {r1, r2, r3, r4, r5, r6};
		
		for (Rectangle r: rectangles) {
			r.setFill(Color.PINK);
			r.autosize();
			r.setStroke(Color.PINK);
		}
		
		grid.add(r1, 1, 0);
		grid.add(r2, 2, 0);
		grid.add(r3, 3, 0);
		grid.add(r4, 4, 0);
		grid.add(r5, 5, 0);
		grid.add(r6, 6, 0);
		
		// String g = "coding";
		Guess g = new Guess();
		
		btn.setOnMouseClicked(e -> {
			g.setGuess(entry.getText());
			word.setText(g.getWord());
		});
		submit.setOnMouseClicked(e -> {
			g.setGuess(entry.getText());
			if (g.validateLength() == false) {
				key.setText("Invalid Word Length");
			} else if (g.checkWin(0) == true) {
				key.setText("Correct");
			} else {
				String[] colors = g.setColor();
				int i = 0;
				for(Rectangle r: rectangles) {
					if (colors[i].equals("green")) {
						r.setFill(Color.GREEN);
					} else if (colors[i].equals("yellow")) {
						r.setFill(Color.YELLOW);
					} else {
						r.setFill(Color.GREY);
					}
					++i;
				}
			}
		});
		primaryStage.setScene(new Scene(grid, 350, 300));
		primaryStage.show();
		
		
	} 

}
