package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;


public class TicketFX extends Application {
	
	//Fonts for different UI elements
	Font titleFont = new Font("Stencil",25);
	Font btnFont = new Font("Elephant",18);
	Font lblFont = new Font("Impact",25);
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,225);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setRoot(login(scene));
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Pane login(Scene t) {
		//Title for application
		Label title = new Label("Helpdesk Ticketing System");
		title.setFont(titleFont);
		title.setTranslateX(50);
		
		Line line = new Line();
		line.setStartX(0); 
		line.setEndX(400); 
		line.setStartY(35);
		line.setEndY(35);
		line.setSmooth(true);
		line.setStroke(Color.RED);
		line.setStrokeWidth(5);
		
		Label loginLbl = new Label("Login");
		loginLbl.setFont(lblFont);
		loginLbl.setTranslateX(165);
		loginLbl.setTranslateY(45);
		
		//Where users input username and password
		Label userNameLbl = new Label("Username:");
		userNameLbl.setTranslateX(85);
		userNameLbl.setTranslateY(85);
		userNameLbl.setFont(btnFont);
		
		TextField userNameTxtF = new TextField();
		userNameTxtF.setTranslateX(175);
		userNameTxtF.setTranslateY(87);
		
		Label passWrdLbl = new Label("Password:");
		passWrdLbl.setTranslateX(85);
		passWrdLbl.setTranslateY(115);
		passWrdLbl.setFont(btnFont);
		
		TextField passWrdTxtF = new TextField();
		passWrdTxtF.setTranslateX(175);
		passWrdTxtF.setTranslateY(117);
		
		ToggleGroup group = new ToggleGroup();

		//Radio buttons to see if app user has admin status or not
		RadioButton adminRBtn = new RadioButton("Admin");
		adminRBtn.setToggleGroup(group);
		adminRBtn.setTranslateX(120);
		adminRBtn.setTranslateY(150);
				
		RadioButton userRBtn = new RadioButton("User");
		userRBtn.setToggleGroup(group);
		userRBtn.setTranslateX(210);
		userRBtn.setTranslateY(150);
		
		//Button used to login to application
		Button loginBtn = new Button("Login");
		loginBtn.setTranslateX(170);
		loginBtn.setTranslateY(180);
		
		Pane loginPane = new Pane();
		
		BackgroundFill background_fill = new BackgroundFill(Color.LIGHTBLUE,CornerRadii.EMPTY, Insets.EMPTY); 
		Background background = new Background(background_fill);
		loginPane.setBackground(background);
		
		loginPane.getChildren().addAll(title,line,loginLbl,userNameLbl,userNameTxtF,passWrdLbl,passWrdTxtF,adminRBtn,userRBtn,loginBtn);
		return loginPane;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
