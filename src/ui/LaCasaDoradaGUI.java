package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.LaCasaDorada;

public class LaCasaDoradaGUI {
	private LaCasaDorada laCasaDorada;
	
    public LaCasaDoradaGUI(LaCasaDorada lcd) throws IOException{
    	laCasaDorada = lcd;
	}
    
    @FXML
    public void optContinue(ActionEvent event) throws IOException{

    }

    @FXML
    public void showAbout(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("La Casa Dorada");
	    alert.setHeaderText("Creditos");
	    alert.setContentText("Daniela Olarte y Danilo Erazo \nAlgoritmos y Programación II");
	    alert.showAndWait();
    }
  

}
