package ui;

import java.io.File;
import java.io.IOException;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.ClientAccount;
import model.EmployeeAccount;
import model.LaCasaDorada;
import model.Order;
import model.RestaurantIngredient;
import model.RestaurantProduct;
import model.RestaurantTypeOfProduct;

public class LaCasaDoradaGUI {
	
	public final static String SAVE_PATH_FILE1 = "Employee-data.csv";
	public final static String SAVE_PATH_FILE2 = "Customer-data.csv";
	public final static String SAVE_PATH_FILE3 = "Product-data.csv";
	private LaCasaDorada laCasaDorada;
	
	@FXML
	private TextField COcustomerName;

	@FXML
	private TextField COemployeeName;

	@FXML
	private TextField COobservations;

	@FXML
	private ChoiceBox<String> COaddProduct;

	@FXML
	private ChoiceBox<String> COaddQuantity;
	
	@FXML
	private ChoiceBox<String> productTypes;

	@FXML
	private ChoiceBox<String> productIngredients;
    
	@FXML
	private TextField productName;

	@FXML
	private TextField productPersonalPrice;

	@FXML
	private TextField productSharePrice;

	@FXML
	private SplitMenuButton productType;
	
	@FXML
	private RadioButton optIngredient;

	@FXML
	private RadioButton optTypeOfProduct;
	
    @FXML
    private TextField createIngredientName;

	@FXML
    private BorderPane createCustomerPane;
	
	@FXML
    private TextField txtCxFirstName;

    @FXML
    private TextField txtCxLastName;

    @FXML
    private TextField txtCxId;

    @FXML
    private TextField txtCxAddress;

    @FXML
    private TextField txtCxPhoneNumber;

    @FXML
    private TextField txtCxObservations;
    
	@FXML
	private TextField txtFirstName;

	@FXML
	private TextField txtLastName;

	@FXML
	private BorderPane deleteAllPane;
	
	@FXML
    private BorderPane updateProductPane;
	
	@FXML
	private BorderPane updateIngredientTypeOfProductPane;
	
	@FXML
	private BorderPane disableEmployeeAccountPane;
	
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
	private BorderPane deleteEmployeeAccountPane;
	
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
    
    @FXML
    private BorderPane typeOfProductListPane;
    
    // CUSTOMER TABLE VIEW 
    
    @FXML
    private TableView<ClientAccount> tbCustomerList;

    @FXML
    private TableColumn<ClientAccount, String> tcFirstNameCustomer;

    @FXML
    private TableColumn<ClientAccount, String> tcLastNameCustomer;

    @FXML
    private TableColumn<ClientAccount, String> tcIdCustomer;

    @FXML
    private TableColumn<ClientAccount, String> tcAddressCustomer;

    @FXML
    private TableColumn<ClientAccount, String> tcPhoneNumberCustomer;
    
    @FXML
    private TableColumn<ClientAccount, String> tcObservationsCustomer;
    
    // ORDER LIST 

    @FXML
    private TableView<Order> tbOrderList;

    @FXML
    private TableColumn<Order, String> tcNumberOrder;

    @FXML
    private TableColumn<Order, String> txStatusOrder;

    @FXML
    private TableColumn<Order, String> tcProductsOrder;

    @FXML
    private TableColumn<Order, String> tcQuantityOrder;

    @FXML
    private TableColumn<Order, String> tcEmployeeOrder;

    @FXML
    private TableColumn<Order, String> tcDateOrder;

    @FXML
    private TableColumn<Order, String> txHourOrder;

    @FXML
    private TableColumn<Order, String> tcObservationsOrder;

    
    // PRODUCT LIST
    
    @FXML
    private TableView<RestaurantProduct> tbProductList;

    @FXML
    private TableColumn<RestaurantProduct, String> tcNameList;

    @FXML
    private TableColumn<RestaurantProduct, String> tcTypeList;


    // EMPLOYEE LIST

    @FXML
    private TableColumn<EmployeeAccount, String> tcEmployeeFirstName;

    @FXML
    private TableColumn<EmployeeAccount, String> tcEmployeeLastName;

    @FXML
    private TableColumn<EmployeeAccount, String> tcEmployeeId;
    
    @FXML
    private TableView<EmployeeAccount> tbEmployeeList;
    
    // INGREDIENT LIST 
    
    @FXML
    private BorderPane ingredientListPane;

    @FXML
    private TableView<RestaurantIngredient> tbIngredientList;

    @FXML
    private TableColumn<RestaurantIngredient, String> tcIngredientName;
    
    
    LaCasaDoradaGUI(LaCasaDorada lcd) throws IOException{
    	laCasaDorada = lcd;
	}
    
    // TYPE OF PRODUCT LIST 

    @FXML
    private TableView<RestaurantTypeOfProduct> tbTypeOfProductList;

    @FXML
    private TableColumn<RestaurantTypeOfProduct, String> tcTypeOfProductName;
    
    /*
     * *********************************** FIRST SCREEN (main-pane.fxml) ************************************************************
     */
    
    @FXML
    public void optContinue(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-in.fxml"));
    	fxmlLoader.setController(this);
    	Parent signInPane = (Parent) fxmlLoader.load();
    	mainPane.getChildren().setAll(signInPane);
    }
    
    @FXML
    public void showAbout(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("La Casa Dorada Menu");
	    alert.setHeaderText("Credits");
	    alert.setContentText("Daniela Olarte \nAlgorithms II");
	    alert.showAndWait();
    }
    
    /*
     **************************************** SECOND SCREEN SIGN IN (sign-in.fxml) *******************************************************
     */

    @FXML
    public void optLogIn(ActionEvent event) throws IOException {
    	String userName=txtUsername.getText();
     	String password=txtPassword.getText();
     	
     	if(laCasaDorada.validateEmployee(userName, password)) {
     		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
        	fxmlLoader.setController(this);
        	Parent menuPane = fxmlLoader.load();
        	mainPane.getChildren().setAll(menuPane);

     	}else if(!laCasaDorada.validateEmployee(userName, password)) {
     		loginErrorAlert();
     	}
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
    public void sub15GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-in.fxml"));
    	fxmlLoader.setController(this);
    	Parent signInPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(signInPane);
    }
    
    @FXML
    public void optCreateAccount(ActionEvent event) throws IOException {
    	String userName=txtUsername.getText();
    	System.out.println(userName);
    	
    	String password=txtPassword.getText();
    	System.out.println(password);
    	
    	String firstName=txtFirstName.getText();
    	System.out.println(password);
    	
    	String lastName=txtLastName.getText();
    	System.out.println(password);
    	
    	laCasaDorada.addEmployee(userName, password, firstName, lastName, lastName);
    	
    	if (userName.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty()) {
        	validationErrorAlert();
        }else{
        	accountCreatedAlert();
	    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sign-in.fxml"));
	    	fxmlLoader.setController(this);
	    	Parent signInPane = fxmlLoader.load();
	    	mainPane.getChildren().setAll(signInPane);
        }
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
    	initializeCustomerTableView();
    }

    @FXML
    public void menuEmployeeList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("employee-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent employeeListPane = fxmlLoader.load();
    	mainPane.setCenter(employeeListPane);
    	initializeEmployeeTableView();
    }

    @FXML
    public void menuOrderList(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("order-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent orderListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(orderListPane);
    	initializeOrderTableView();
    }

    @FXML
    public void menuProductList(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent productListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(productListPane);
    	initializeProductTableView();
    }
    
    @FXML
    public void menuUpdateStatus(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("order-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent orderListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(orderListPane);
    	initializeOrderTableView();
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
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent updateProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(updateProductPane);
    	initializeProductTableView();
    }
    
    @FXML
    public void menuUpdateTypeOfProduct(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("type-of-product-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent updateIngredientTypeOfProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(updateIngredientTypeOfProductPane);
    	initializeTypeOfProductTableView();
    }
    
    @FXML
    public void menuUpdateIngredient(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ingredient-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent ingredientListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(ingredientListPane);
    	initializeIngredientTableView();
    }
    
    @FXML
    public void menuUpdateEmployeeAccount(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("employee-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent updateEmployeeAccountPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(updateEmployeeAccountPane);
    	initializeEmployeeTableView();
    }
    
    @FXML
    public void menuDeleteAccount(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("delete-employee-account.fxml"));
    	fxmlLoader.setController(this);
    	Parent deleteEmployeeAccountPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(deleteEmployeeAccountPane);
    }


    @FXML
    public void menuDisableAccount(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("disable-employee-account.fxml"));
    	fxmlLoader.setController(this);
    	Parent disableEmployeeAccountPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(disableEmployeeAccountPane);
    }
    
    @FXML
    public void menuCreateCustomer(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-customer.fxml"));
    	fxmlLoader.setController(this);
    	Parent createCustomerPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createCustomerPane);
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
    
    @FXML
    public void COoptAddProduct(ActionEvent event) throws IOException{

    }
    
    @FXML
    public void COcreateOrder(ActionEvent event) throws IOException{

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
    
    private void initializeCustomerTableView(){
        ObservableList<ClientAccount> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getClients());
        tbCustomerList.setItems(observableList);
        
        tcFirstNameCustomer.setCellValueFactory(new PropertyValueFactory<ClientAccount, String>("firstName"));
        tcLastNameCustomer.setCellValueFactory(new PropertyValueFactory<ClientAccount, String>("lastName"));
        tcIdCustomer.setCellValueFactory(new PropertyValueFactory<ClientAccount, String>("id"));
        tcAddressCustomer.setCellValueFactory(new PropertyValueFactory<ClientAccount, String>("address"));
        tcPhoneNumberCustomer.setCellValueFactory(new PropertyValueFactory<ClientAccount, String>("phoneNumber"));
        tcObservationsCustomer.setCellValueFactory(new PropertyValueFactory<ClientAccount, String>("observations"));
    }
    
    public void loadCustomerTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("customer-list.fxml"));
        fxmlLoader.setController(this);
        Parent customerListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(customerListPane);
        initializeCustomerTableView();
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
    
    private void initializeOrderTableView(){
        ObservableList<Order> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getOrders());
        tbOrderList.setItems(observableList);
        
        tcNumberOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("orderNumber"));
        txStatusOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("status"));
        tcProductsOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("products"));
        tcQuantityOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("quantity"));
        tcEmployeeOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("employee"));
        tcDateOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("orderDate"));
        txHourOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("orderHour"));
        tcObservationsOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("observations"));
    }
    
    public void loadOrderTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("order-list.fxml"));
        fxmlLoader.setController(this);
        Parent orderListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(orderListPane);
        initializeOrderTableView();
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
    
    private void initializeProductTableView(){
        ObservableList<RestaurantProduct> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getProducts());
        tbProductList.setItems(observableList);
        
        tcNameList.setCellValueFactory(new PropertyValueFactory<RestaurantProduct, String>("productName"));
        tcTypeList.setCellValueFactory(new PropertyValueFactory<RestaurantProduct, String>("productType"));
    }
    
    public void loadProductTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product-list.fxml"));
        fxmlLoader.setController(this);
        Parent productListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(productListPane);
        initializeProductTableView();
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
    
    private void initializeEmployeeTableView(){
        ObservableList<EmployeeAccount> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getEmployees());
        tbEmployeeList.setItems(observableList);
        
        tcEmployeeFirstName.setCellValueFactory(new PropertyValueFactory<EmployeeAccount, String>("firstName"));
        tcEmployeeLastName.setCellValueFactory(new PropertyValueFactory<EmployeeAccount, String>("lastName"));
        tcEmployeeId.setCellValueFactory(new PropertyValueFactory<EmployeeAccount, String>("id"));
    }
    
    public void loadEmployeeTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("employee-list.fxml"));
        fxmlLoader.setController(this);
        Parent employeeListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(employeeListPane);
        initializeEmployeeTableView();
    }
    
    @FXML
    public void selectEmployee(MouseEvent event) throws IOException {
    	EmployeeAccount ea = this.tbEmployeeList.getSelectionModel().getSelectedItem();
    	
    	if(ea != null) {
    		this.tcEmployeeFirstName.setText(ea.getFirstName());
    		this.tcEmployeeLastName.setText(ea.getLastName());
    		this.tcEmployeeId.setText(ea.getId());
    	}	
    }
    
    @FXML
    public void employeeDeleteOpt(ActionEvent event) {
    	EmployeeAccount ea = this.tbEmployeeList.getSelectionModel().getSelectedItem();
    	
    	if(ea == null) {
    		selectAnOptionAlert();
    	}else {
    		this.laCasaDorada.getEmployees().remove(ea);
    		this.tbEmployeeList.refresh();
    		employeeWasDeletedAlert();
    	}
    	
    }

    @FXML
    public void employeeDisableOpt(ActionEvent event) {

    }
    
    
    /*
     **************************************** SCREEN INGREDIENT LIST (ingredient-list.fxml) *******************************************************
     */
    
    @FXML
    public void sub20GoBack(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    private void initializeIngredientTableView(){
        ObservableList<RestaurantIngredient> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getIngredients());
        tbIngredientList.setItems(observableList);
        
        tcIngredientName.setCellValueFactory(new PropertyValueFactory<RestaurantIngredient, String>("ingredientName"));
    }
    
    public void loadIngredientTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ingredient-list.fxml"));
        fxmlLoader.setController(this);
        Parent ingredientListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(ingredientListPane);
        initializeIngredientTableView();
    }
    
    /*
     **************************************** SCREEN TYPES OF PRODUCT LIST (type-of-product-list.fxml) *******************************************************
     */
    
    @FXML
    public void sub22GoBack(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    private void initializeTypeOfProductTableView(){
        ObservableList<RestaurantTypeOfProduct> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getTypeOfProducts());
        tbTypeOfProductList.setItems(observableList);
        
        tcTypeOfProductName.setCellValueFactory(new PropertyValueFactory<RestaurantTypeOfProduct, String>("typeOfProductName"));
    }
    
    public void loadTypesOfProductTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("types-of-product-list.fxml"));
        fxmlLoader.setController(this);
        Parent typeOfProductListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(typeOfProductListPane);
        initializeTypeOfProductTableView();
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
    
    @FXML
    public void optCreateIngredientTypeOfProduct(ActionEvent event) throws IOException{
    	String name = createIngredientName.getText();
    	System.out.println(name);
    	
    	String option = "";
    	if(optIngredient.isSelected()){
    		option = "Ingredient";
    		laCasaDorada.addIngredient(name);
    		ingredientCreatedAlert();
    		
    		
    	}else if(optTypeOfProduct.isSelected()) {
    		option = "Type of product";
    		laCasaDorada.addTypeOfProduct(name);
    		typeOfProductCreatedAlert();
    	}
    	System.out.println(option);
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
    
    @FXML
    public void productCreateProduct(ActionEvent event) throws IOException{
    	String name = productName.getText();
    	System.out.println(name);
    	
    	productTypes.getItems().add("Main dish");
    	productTypes.getItems().add("Additions");
    	productTypes.getItems().add("drink");
    	String dish = "";
    	if(productTypes != null) {
    		dish = productTypes.getValue().toString();
    	}
    	
    	System.out.println(dish);
    	
    	int personalPrice = Integer.parseInt(productPersonalPrice.getText());
    	System.out.println(personalPrice);
    	
    	int sharePrice = Integer.parseInt(productSharePrice.getText());
    	System.out.println(sharePrice);
    	
    	double[][] sizePrice = new double [personalPrice][sharePrice];
    	
    	 // productIngredients.get
    	String ingredients = "";
    	if(productTypes != null) {
    		ingredients = productIngredients.getValue().toString();
    	}
    	System.out.println(ingredients);
    	
    	laCasaDorada.addProduct(name, sizePrice);
    	
    	productCreatedAlert();
    	
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
     **************** SCREEN UPDATE INGREDIENT (ingredient-list.fxml) *****************************************
     */
    
    @FXML
    public void sub12GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN UPDATE TYPE OF PRODUCT (type-of-product-list.fxml) *****************************************
     */
    @FXML
    public void sub21GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    
    /*
     **************** SCREEN UPDATE PRODUCT (product-list.fxml) *************************************************************************
     */
    
    @FXML
    public void sub13GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN UPDATE EMPLOYEE ACCOUNT (employee-list.fxml) *************************************************************************
     */
    
    @FXML
    public void sub14GoBack(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN DELETE EMPLOYEE ACCOUNT (delete-employee-account.fxml) *************************************************************************
     */
    
    @FXML
    public void optDeleteAccount(ActionEvent event) throws IOException{

    }

    @FXML
    public void sub16GoBack(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN DISABLE EMPLOYEE ACCOUNT (disable-employee-account.fxml) *************************************************************************
     */
    
    @FXML
    public void optDisableAccount(ActionEvent event) throws IOException{

    }

    @FXML
    public void sub17GoBack(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     **************** SCREEN CREATE CUSTOMER (create-customer.fxml) *************************************************************************
     */
    
    @FXML
    public void optCreateCustomerAccount(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }

    @FXML
    public void sub18GoBack(ActionEvent event) throws IOException{
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
    	fxmlLoader.setController(this);
    	Parent menuPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(menuPane);
    }
    
    /*
     ***************************************** OPTIONS IMPORT AND EXPORT *************************************************************************
     */
    
    @FXML
    public void exportEmployeeReport(ActionEvent event) throws IOException{
    	FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new ExtensionFilter("Text", "*.csv"));
        File file = fc.showSaveDialog(menuPane.getScene().getWindow());

        laCasaDorada.exportEmployeeData(file.getAbsolutePath());
    }

    @FXML
    public void exportProductReport(ActionEvent event) throws IOException{
    	FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new ExtensionFilter("Text", "*.csv"));
        File file = fc.showSaveDialog(menuPane.getScene().getWindow());

        laCasaDorada.exportProductData(file.getAbsolutePath());
    }

    @FXML
    public void importCustomerData(ActionEvent event) throws IOException{
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	File f = fileChooser.showOpenDialog(menuPane.getScene().getWindow());
    	if(f!=null) {
    		try {
    			laCasaDorada.importCustomerData(f.getAbsolutePath());
        		importSuccessAlert();
    		}catch(IOException e){
    			importErrorAlert();
    		}
    	}  	
    }

    @FXML
    public void importEmployeeData(ActionEvent event) {
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	File f = fileChooser.showOpenDialog(menuPane.getScene().getWindow());
    	if(f!=null) {
    		try {
    			laCasaDorada.importEmployeeData(f.getAbsolutePath());
        		importSuccessAlert();
    		}catch(IOException e){
    			importErrorAlert();
    		}
    	}  	
    }

    @FXML
    public void importProductData(ActionEvent event) throws IOException{
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	File f = fileChooser.showOpenDialog(menuPane.getScene().getWindow());
    	if(f!=null) {
    		try {
    			laCasaDorada.importProductData(f.getAbsolutePath());
        		importSuccessAlert();
    		}catch(IOException e){
    			importErrorAlert();
    		}
    	}  	
    }

    /*
     **************************************************** ALERTS *************************************************************************
     */
    @FXML
    private void productCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Product created");
	    alert.setHeaderText("");
	    alert.setContentText("Product has been created successfully");
	    alert.showAndWait();
    }
    
    @FXML
    private void ingredientCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Ingredient created");
	    alert.setHeaderText("");
	    alert.setContentText("Ingredient has been created successfully");
	    alert.showAndWait();
    }
    
    @FXML
    private void typeOfProductCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Type of product created");
	    alert.setHeaderText("");
	    alert.setContentText("Type of product has been created successfully");
	    alert.showAndWait();
    }
    
    @FXML
    private void customerCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Customer created");
	    alert.setHeaderText("");
	    alert.setContentText("Customer has been created successfully");
	    alert.showAndWait();
    }
    
    @FXML
    private void accountCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Account created");
	    alert.setHeaderText("");
	    alert.setContentText("New account has been created");
	    alert.showAndWait();
    }
    
    @FXML
    private void validationErrorAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Validation error");
	    alert.setHeaderText("");
	    alert.setContentText("You must fill each field in the form");
	    alert.showAndWait();
    }
    
    @FXML
    private void loginErrorAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Log in incorrect\"");
	    alert.setHeaderText("");
	    alert.setContentText("The username and password given are incorrect");
	    alert.showAndWait();
	}
    
    @FXML
    private void importErrorAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Import Employee");
	    alert.setHeaderText("");
	    alert.setContentText("Employee data could not be imported");
	    alert.showAndWait();
	}
    
    @FXML
    private void importSuccessAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Import Employee");
	    alert.setHeaderText("");
	    alert.setContentText("Employee data was imported successfully");
	    alert.showAndWait();
	}
    
    @FXML
    private void selectAnOptionAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Error");
	    alert.setHeaderText("");
	    alert.setContentText("Select an option to delete");
	    alert.showAndWait();
	}
    
    @FXML
    private void employeeWasDeletedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Delete employee");
	    alert.setHeaderText("");
	    alert.setContentText("Employee was deleted successfully");
	    alert.showAndWait();
	}
   
}
