
package codle.v1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 * @author Gus Cook
 */
public class LoadCodleUI extends Application implements Initializable {
	
	/**
	 * @FXML
	 */
	@FXML
	private Pane primaryPane;
	
	@FXML Button b11; @FXML Button b12; @FXML Button b13; @FXML Button b14; 
	@FXML Button b15; @FXML Button b16; @FXML Button b21; @FXML Button b22; 
	@FXML Button b23; @FXML Button b24; @FXML Button b25; @FXML Button b26;
	@FXML Button b31; @FXML Button b32; @FXML Button b33; @FXML Button b34; 
	@FXML Button b35; @FXML Button b36; @FXML Button b41; @FXML Button b42; 
	@FXML Button b43; @FXML Button b44; @FXML Button b45; @FXML Button b46; 
	@FXML Button b51; @FXML Button b52; @FXML Button b53; @FXML Button b54; 
	@FXML Button b55; @FXML Button b56;
    
	@FXML Button[] codleArray;
	
	@FXML Button q; @FXML Button w; @FXML Button e; @FXML Button r; @FXML Button t; 
	@FXML Button y; @FXML Button u; @FXML Button i; @FXML Button o; @FXML Button p; 
	@FXML Button a; @FXML Button s; @FXML Button d; @FXML Button f; @FXML Button g; 
	@FXML Button h; @FXML Button j; @FXML Button k; @FXML Button l; @FXML Button z; 
	@FXML Button x; @FXML Button c; @FXML Button v; @FXML Button b; @FXML Button n; 
	@FXML Button m;
	
	@FXML Button[] letters;
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("CodleUI.fxml"));
		final Pane p = loader.load();
		final Scene s = new Scene(p);
		primaryStage.setScene(s);
		primaryStage.show();
	}
	 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.codleArray = new Button[30];
		this.codleArray[0]  = this.b11; this.codleArray[1]  = this.b12; this.codleArray[2]  = this.b13;
		this.codleArray[3]  = this.b14; this.codleArray[4]  = this.b15; this.codleArray[5]  = this.b16;
		this.codleArray[6]  = this.b21; this.codleArray[7]  = this.b22; this.codleArray[8]  = this.b23;
		this.codleArray[9]  = this.b24; this.codleArray[10] = this.b25; this.codleArray[11] = this.b26;
		this.codleArray[12] = this.b31; this.codleArray[13] = this.b32; this.codleArray[14] = this.b33;
		this.codleArray[15] = this.b34; this.codleArray[16] = this.b35; this.codleArray[17] = this.b36;
		this.codleArray[18] = this.b41; this.codleArray[19] = this.b42; this.codleArray[20] = this.b43;
		this.codleArray[21] = this.b44; this.codleArray[22] = this.b45; this.codleArray[23] = this.b46;
		this.codleArray[24] = this.b51; this.codleArray[25] = this.b52; this.codleArray[26] = this.b53;
		this.codleArray[27] = this.b54; this.codleArray[28] = this.b55; this.codleArray[29] = this.b56;	
		
		this.letters = new Button[26];
		this.letters[0]  = this.q; this.letters[1]  = this.w; this.letters[2]  = this.e;
		this.letters[3]  = this.r; this.letters[4]  = this.t; this.letters[5]  = this.y;
		this.letters[6]  = this.u; this.letters[7]  = this.i; this.letters[8]  = this.o;
		this.letters[9]  = this.p; this.letters[10] = this.a; this.letters[11] = this.s;
		this.letters[12] = this.d; this.letters[13] = this.f; this.letters[14] = this.g;
		this.letters[15] = this.h; this.letters[16] = this.j; this.letters[17] = this.k;
		this.letters[18] = this.l; this.letters[19] = this.z; this.letters[20] = this.x;
		this.letters[21] = this.c; this.letters[22] = this.v; this.letters[23] = this.b;
		this.letters[24] = this.n; this.letters[25] = this.m;
		
		
		Guess g = new Guess();
		this.primaryPane.setOnMouseClicked(e -> {
			this.primaryPane.requestFocus();
		});
		this.primaryPane.setOnKeyPressed(e -> {
			
			/*
			 * Does nothing if not a letter or number
			 */
			if (!e.getCode().isLetterKey() && e.getCode() != KeyCode.ENTER 
					&& e.getCode() != KeyCode.BACK_SPACE) {}
			
			/*
			 * Upon pressing the Enter key
			 */
			else if (e.getCode() == KeyCode.ENTER) {
				int n = 0;
				for (int i = 0; i < this.codleArray.length; ++i) {
					if (!this.codleArray[i].getText().equals(" ")) {
						++n;
					}
				}
				if (n % 6 == 0 && n != 0) {
					String guess = String.format("%s%s%s%s%s%s", this.codleArray[n-6].getText(), this.codleArray[n-5].getText(), 
												this.codleArray[n-4].getText(), this.codleArray[n-3].getText(), 
												this.codleArray[n-2].getText(), this.codleArray[n-1].getText());
					g.setGuess(guess);
					String[] colors = g.setColor();
					int j = 0;
					for(int i = n - 6; i < n; ++i) {
						if (colors[j].equals("green")) {
							this.codleArray[i].setStyle("-fx-background-color: #00ff00;");
						} else if (colors[j].equals("yellow")) {
							this.codleArray[i].setStyle("-fx-background-color: #ffff00;");
						} else {
							this.codleArray[i].setStyle("-fx-background-color: #777777;");
						}
						++j;
					}
					j = 0;
					
					/*
					 * 
					 */
					for(int l = n-6; l < n; ++l) {
						for(int k = 0; k < this.letters.length; ++k) {
							try {
								Color color = (Color) this.letters[k].getBackground().getFills().get(0).getFill();
								if (this.codleArray[l].getText().equals(this.letters[k].getText())) {
									if (color.equals(Color.GREEN)) {}
									else if (color.equals(Color.YELLOW) && colors[j].equals("grey")) {}
									else {
										if (colors[j].equals("green")) {
											this.letters[k].setStyle("-fx-background-color: #00ff00;");
										}
										if (colors[j].equals("yellow")) {
											this.letters[k].setStyle("-fx-background-color: #ffff00;");
										}
										if (colors[j].equals("grey")) {
											this.letters[k].setStyle("-fx-background-color: #777777;");
										}
									}
								}
							} catch(NullPointerException e1) {
							}
							
						}
						++j;
					}
					
					
					if (g.checkWin(0)) {
						try {
							final FXMLLoader loader = new FXMLLoader(getClass().getResource("WinScreen.fxml"));
							Pane p = loader.load();
							final Scene s = new Scene(p);
							final Stage win = new Stage();
							win.setScene(s);
							win.show();
						} catch (IOException e1) {
							e1.printStackTrace() ;
						}	
					}
					if (n == this.codleArray.length && !g.checkWin(0)) {
						try {
							final FXMLLoader loader = new FXMLLoader(getClass().getResource("LoseScreen.fxml"));
							Pane p = loader.load();
							final Scene s = new Scene(p);
							final Stage lose = new Stage();
							lose.setScene(s);
							lose.show();
						} catch (IOException e1) {
							e1.printStackTrace() ;
						}	
					}
					
				}
			} 
			
			/*
			 * Upon pressing the backspace key
			 */
			else if (e.getCode() == KeyCode.BACK_SPACE) {
				int n = -1;
				for (int i = 0; i < this.codleArray.length; ++i) {
					if (!this.codleArray[i].getText().equals(" ")) {
						++n;
					}
				}
				if(n > -1) {
					Color color = (Color) this.codleArray[n].getBackground().getFills().get(0).getFill();
					if (color.equals(Color.WHITE)) {
						this.codleArray[n].setText(" ");
					}
				}
			} 
			
			/*
			 * When normal keyboard input pressed
			 */
			else {
				for (int i = 0; i < this.codleArray.length; ++i) {
					Color color = Color.WHITE;
					if (i > 0) {
						color = (Color) this.codleArray[i-1].getBackground().getFills().get(0).getFill();
					}
					if (i == 0 && this.codleArray[i].getText().equals(" ")) {
						this.codleArray[i].setText(e.getCode().toString());
						break;
					} else if (this.codleArray[i].getText().equals(" ")) {
						if (i != this.codleArray.length - 1 && i % 6 == 0 
								&& this.codleArray[i+1].getText().equals(" ") && color.equals(Color.WHITE)) {
							break;
						}
						this.codleArray[i].setText(e.getCode().toString());
						break;
					}
					
				}
			}
			
		});
	}

	public static void main(String[] args) {launch(args);}
	
} // end class LoadCodleUI