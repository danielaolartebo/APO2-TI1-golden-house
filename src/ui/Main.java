package ui;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.LaCasaDorada;


public class Main extends Application{
	private LaCasaDoradaGUI laCasaDoradaGUI;
	private LaCasaDorada laCasaDorada;
	
	public Main() throws IOException {
		laCasaDorada = new LaCasaDorada();
		laCasaDoradaGUI = new LaCasaDoradaGUI(laCasaDorada);
		
		try {
			//laCasaDorada.loadEmployeeData();
			//laCasaDorada.loadCustomerData();
			laCasaDorada.loadProductData();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Error");
			alert.setHeaderText("");
			alert.setContentText("No se pudo cargar datos del archivo");
			alert.showAndWait();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-pane.fxml"));
		fxmlLoader.setController(laCasaDoradaGUI);
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("La Casa Dorada");
		primaryStage.show();
		
		primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(650);
        primaryStage.setMaxWidth(650);        
        primaryStage.setMaxHeight(400);

       
	}
	
}