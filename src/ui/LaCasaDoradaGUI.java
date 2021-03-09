package ui;

import java.io.IOException;

import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.LaCasaDorada;

public class LaCasaDoradaGUI {
	private LaCasaDorada laCasaDorada;
	
	@FXML
	private BorderPane menuPane;
	
    @FXML
    private BorderPane mainPane;
	
    @FXML
    private BorderPane signInPane;
	
	@FXML
	private TextField txtUsername;

	@FXML
	private TextField txtPassword;	
	
    public LaCasaDoradaGUI(LaCasaDorada lcd) throws IOException{
    	laCasaDorada = lcd;
	}
    
    @FXML
    public void optContinue(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    @FXML
    public void optLogIn(ActionEvent event) {

    }

    @FXML
    public void optSignUp(ActionEvent event) {

    }

    @FXML
    public void showAbout(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("La Casa Dorada Menu");
	    alert.setHeaderText("Credits");
	    alert.setContentText("Daniela Olarte and Danilo Erazo \nAlgorithms II");
	    alert.showAndWait();
    }
  

}
