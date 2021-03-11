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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.ClientAccount;
import model.LaCasaDorada;

public class LaCasaDoradaGUI {
	private LaCasaDorada laCasaDorada;
	
    @FXML
    private BorderPane createAccountPane;
    
	@FXML
	private BorderPane createOrderPane;
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
    
    
    @FXML
    private TextField txtIDCE;

    @FXML
    private TextField txtUsernameCE;

    @FXML
    private PasswordField txtPasswordCE;
    
    
    //Clients list screen
    @FXML
    private TableView<ClientAccount> clients;

    @FXML
    private TableColumn<ClientAccount, String> tcNameClient;

    @FXML
    private TableColumn<ClientAccount, String> tcLastnameClient;

    @FXML
    private TableColumn<ClientAccount, String> tcIDClient;

    @FXML
    private TableColumn<ClientAccount, String> tcPhone;

    @FXML
    private TableColumn<ClientAccount, String> tcAdress;

    @FXML
    private TableColumn<ClientAccount, String> tcObservationClient;
    
    //End 
    
    //Order list screen
    
    @FXML
    private TableView<?> orders;

    @FXML
    private TableColumn<?, ?> tcCode;

    @FXML
    private TableColumn<?, ?> tcClientOrder;

    @FXML
    private TableColumn<?, ?> tcEmployeeOrder;

    @FXML
    private TableColumn<?, ?> tcTimeOrder;

    @FXML
    private TableColumn<?, ?> tcOrderStatus;

    @FXML
    private TableColumn<?, ?> tcObservationOrder;
    
    //End
    
	
    public LaCasaDoradaGUI(LaCasaDorada lcd) throws IOException{
    	laCasaDorada = lcd;
	}
    
    /*
     * *********************************** FIRST SCREEN (main-pane.fxml) ************************************************************
     */
    
    @FXML
    public void optContinue(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-in.fxml"));
    	fxmlLoader.setController(this);
    	Parent signInPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(signInPane);
    }
    
    @FXML
    public void showAbout(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("La Casa Dorada Menu");
	    alert.setHeaderText("Credits");
	    alert.setContentText("Daniela Olarte and Danilo Erazo \nAlgorithms II");
	    alert.showAndWait();
    }
    
    /*
     ***************************************** SECOND SCREEN (menu.fxml) ************************************************************
     */
    
    @FXML
    public void subCreateOrder(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-order.fxml"));
    	fxmlLoader.setController(this);
    	Parent createOrderPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createOrderPane);
    }
    
    @FXML
    public void subSignIn(ActionEvent event) throws IOException {
    	
    }
    
    /*
     *********************************** SCREEN CREATE ORDER (create-order.fxml) ************************************************
     */
    
    @FXML
    public void subGoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     ********************************** SCREEN CREATE EMPLOYEE ACCOUNT (register.fxml) ********************************************
     */
    
    @FXML
    public void sub2GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-in.fxml"));
    	fxmlLoader.setController(this);
    	Parent signInPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(signInPane);
    }
    
    @FXML
    void optCreateAccount(ActionEvent event) {

    }
    
    /*
     **************************************** SCREEN SIGN IN (sign-in.fxml) *******************************************************
     */
    
    @FXML
    public void optLogIn(ActionEvent event) {

    }

    @FXML
    public void optSignUp(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
    	fxmlLoader.setController(this);
    	Parent createAccountPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createAccountPane);
    }
    
    @FXML
    public void sub1GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************************************** SCREEN CLIENT LIST (client-list.fxml) *******************************************************
     */
    
    @FXML
    void goBackFromList(ActionEvent event) {

    }
    
    /*
     **************************************** SCREEN ORDER LIST (order-list.fxml) *******************************************************
     */
    
    @FXML
    void goBackFromOrderList(ActionEvent event) {

    }

}
