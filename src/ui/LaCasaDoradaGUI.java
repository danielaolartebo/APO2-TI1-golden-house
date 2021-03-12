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
import model.LaCasaDorada;

public class LaCasaDoradaGUI {
	private LaCasaDorada laCasaDorada;
	
	@FXML
	private BorderPane deleteAllPane;
	
	@FXML
    private BorderPane updateProductPane;
	
	@FXML
	private BorderPane updateIngredientTypeOfProductPane;
	
	@FXML
	private BorderPane createIngredientTypeOfProductPane;
	
	@FXML
    private BorderPane updateEmployeeAccountPane;
	
	@FXML
	private BorderPane createProductPane;
	
	@FXML
	private BorderPane employeeListPane;

	@FXML
    private BorderPane productListPane;

	@FXML
	private BorderPane orderListPane;
	
	@FXML
    private BorderPane disableAllPane;
	
	@FXML
	private BorderPane customerListPane;
	
	@FXML
	private BorderPane registerPane;
    
	@FXML
	private BorderPane createOrderPane;
	@FXML
	private BorderPane menuPane;
	
    @FXML
    private BorderPane mainPane;
	
    @FXML
    private BorderPane signInPane;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;

    @FXML
    private BorderPane UpdateOrderStatusPane;
    
    @FXML
    private TextField txtIDCE;

    @FXML
    private TextField txtUsernameCE;

    @FXML
    private PasswordField txtPasswordCE;
    
    // CUSTOMER TABLE VIEW 
    
    @FXML
    private TableColumn<?, ?> tcFirstNameCustomer;

    @FXML
    private TableColumn<?, ?> tcLastNameCustomer;

    @FXML
    private TableColumn<?, ?> tcIdCustomer;

    @FXML
    private TableColumn<?, ?> tcAddressCustomer;

    @FXML
    private TableColumn<?, ?> tcPhoneNumberCustomer;
    
    // ORDER LIST 
    
    @FXML
    private TableColumn<?, ?> tcNumberOrder;

    @FXML
    private TableColumn<?, ?> txStatusOrder;

    @FXML
    private TableColumn<?, ?> tcProductsOrder;

    @FXML
    private TableColumn<?, ?> tcQuantityOrder;

    @FXML
    private TableColumn<?, ?> tcEmployeeOrder;

    @FXML
    private TableColumn<?, ?> tcDateOrder;

    @FXML
    private TableColumn<?, ?> txHourOrder;

    @FXML
    private TableColumn<?, ?> tcObservationsOrder;
    
    // PRODUCT LIST
    
    @FXML
    private TableColumn<?, ?> tcNameList;

    @FXML
    private TableColumn<?, ?> tcTypeList;

    // EMPLOYEE LIST
    
    @FXML
    private TableColumn<?, ?> tcFirstNameEmployee;

    @FXML
    private TableColumn<?, ?> txLastNameEmployee;

    @FXML
    private TableColumn<?, ?> tcIdEmployee;
    
    LaCasaDoradaGUI(LaCasaDorada lcd) throws IOException{
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
     **************************************** SECOND SCREEN SIGN IN (sign-in.fxml) *******************************************************
     */
    
    @FXML
    public void optLogIn(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }

    @FXML
    public void optSignUp(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
    	fxmlLoader.setController(this);
    	Parent registerPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(registerPane);
    }
   
    /*
     ********************************** THIRD SCREEN CREATE EMPLOYEE ACCOUNT (register.fxml) ********************************************
     */
    
    @FXML
    public void sub2GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-in.fxml"));
    	fxmlLoader.setController(this);
    	Parent signInPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(signInPane);
    }
    
    @FXML
    public void optCreateAccount(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     *****************************************FOURTH SCREEN MENU (menu.fxml) ************************************************************
     */
    
    @FXML
    public void menuCreateOrder(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-order.fxml"));
    	fxmlLoader.setController(this);
    	Parent createOrderPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createOrderPane);
    }
    
    @FXML
    public void menuSingOut(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-in.fxml"));
    	fxmlLoader.setController(this);
    	Parent signInPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(signInPane);
    }
    
    @FXML
    public void menuCustomerList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("customer-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent customerListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(customerListPane);
    }

    @FXML
    public void menuEmployeeList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("employee-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent employeeListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(employeeListPane);
    }

    @FXML
    public void menuOrderList(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("order-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent orderListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(orderListPane);
    }

    @FXML
    public void menuProductList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent productListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(productListPane);
    }
    
    @FXML
    public void menuUpdateStatus(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("order-status.fxml"));
    	fxmlLoader.setController(this);
    	Parent UpdateOrderStatusPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(UpdateOrderStatusPane);
    }
    
    @FXML
    public void menuCreateIngredient(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-ingredient-typeofproduct.fxml"));
    	fxmlLoader.setController(this);
    	Parent createIngredientTypeOfProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createIngredientTypeOfProductPane);
    }

    @FXML
    public void menuCreateProduct(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-product.fxml"));
    	fxmlLoader.setController(this);
    	Parent createProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createProductPane);
    }

    @FXML
    public void menuCreateTypeOfProduct(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-ingredient-typeofproduct.fxml"));
    	fxmlLoader.setController(this);
    	Parent createIngredientTypeOfProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createIngredientTypeOfProductPane);
    }
    
    @FXML
    public void menuDeleteIngredient(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("delete-all.fxml"));
    	fxmlLoader.setController(this);
    	Parent deleteAllPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(deleteAllPane);
    }

    @FXML
    public void menuDeleteProduct(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("delete-all.fxml"));
    	fxmlLoader.setController(this);
    	Parent deleteAllPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(deleteAllPane);
    }

    @FXML
    public void menuDeleteTypeOfProduct(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("delete-all.fxml"));
    	fxmlLoader.setController(this);
    	Parent deleteAllPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(deleteAllPane);
    }
    
    @FXML
    public void menuDisableIngredient(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("disable-all.fxml"));
    	fxmlLoader.setController(this);
    	Parent disableAllPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(disableAllPane);
    }

    @FXML
    public void menuDisableProduct(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("disable-all.fxml"));
    	fxmlLoader.setController(this);
    	Parent disableAllPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(disableAllPane);
    }

    @FXML
    public void menuDisableTypeOfProduct(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("disable-all.fxml"));
    	fxmlLoader.setController(this);
    	Parent disableAllPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(disableAllPane);
    }
    
    @FXML
    public void menuUpdateProduct(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("update-product.fxml"));
    	fxmlLoader.setController(this);
    	Parent updateProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(updateProductPane);
    }
    
    @FXML
    public void menuUpdateTypeOfProduct(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("update-ingredient-typeofproduct.fxml"));
    	fxmlLoader.setController(this);
    	Parent updateIngredientTypeOfProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(updateIngredientTypeOfProductPane);
    }
    
    @FXML
    public void menuUpdateIngredient(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("update-ingredient-typeofproduct.fxml"));
    	fxmlLoader.setController(this);
    	Parent updateIngredientTypeOfProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(updateIngredientTypeOfProductPane);
    }
    
    @FXML
    public void menuUpdateEmployeeAccount(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("update-employee-account.fxml"));
    	fxmlLoader.setController(this);
    	Parent updateEmployeeAccountPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(updateEmployeeAccountPane);
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
     *********************************** SCREEN UPDATE ORDER STATUS (order-status.fxml) ************************************************
     */
    
    @FXML
    public void sub7GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    @FXML
    public void optUpdateStatus(ActionEvent event) {
    
    }
    /*
     **************************************** SCREEN CUSTOMER LIST (customer-list.fxml) *******************************************************
     */
    @FXML
    public void sub3GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************************************** SCREEN ORDER LIST (order-list.fxml) *******************************************************
     */
    
    @FXML
    public void sub4GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************************************** SCREEN PRODUCT LIST (product-list.fxml) *******************************************************
     */
    
    @FXML
    public void sub5GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************************************** SCREEN EMPLOYEE LIST (employee-list.fxml) *******************************************************
     */
    
    @FXML
    public void sub6GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN CREATE INGREDIENT OR TYPE OF PRODUCT (create-ingredient-typeofproduct.fxml) *****************************************
     */
    @FXML
    public void sub8GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN CREATE PRODUCT (create-product.fxml) *************************************************************************
     */
    @FXML
    public void sub9GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN DELETE PRODUCT OR INGREDIENT OR TYPE OF PRODUCT (delete-all.fxml) *****************************************
     */
   
    @FXML
    public void sub10GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN DISABLE PRODUCT OR INGREDIENT OR TYPE OF PRODUCT (disable-all.fxml) *****************************************
     */
   
    @FXML
    public void sub11GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN UPDATE INGREDIENT OR TYPE OF PRODUCT (update-ingredient-typeofproduct.fxml) *****************************************
     */
    
    @FXML
    public void sub12GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN UPDATE PRODUCT (update-product.fxml) *************************************************************************
     */
    
    @FXML
    public void sub13GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN UPDATE EMPLOYEE ACCOUNT (update-product.fxml) *************************************************************************
     */
    
    @FXML
    public void sub14GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }

}
