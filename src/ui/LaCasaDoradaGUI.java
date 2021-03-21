package ui;

import java.io.File;
import java.io.IOException;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.ClientAccount;
import model.EmployeeAccount;
import model.MembersStatus;
import model.LaCasaDorada;
import model.Order;
import model.RestaurantIngredient;
import model.RestaurantProduct;
import model.RestaurantTypeOfProduct;
import model.Status;

public class LaCasaDoradaGUI {
	
	public final static String SAVE_PATH_FILE1 = "Employee-data.csv";
	public final static String SAVE_PATH_FILE2 = "Customer-data.csv";
	public final static String SAVE_PATH_FILE3 = "Product-data.csv";
	private LaCasaDorada laCasaDorada;
	
	@FXML
    private ToggleGroup createoption;
	
	@FXML
    private TextField createTypeOfProduct;    
	
	@FXML
    private ChoiceBox<String> orderNewStatus;
	
	@FXML
	private TextField COobservations;

	@FXML
	private TextField COaddQuantity;

	@FXML
	private ComboBox<String> COaddProduct;

	@FXML
	private ComboBox<String> COcustomerName;

	@FXML
	private ComboBox<String> COemployeeName;
	
	@FXML
	private TextField productPrice;

	@FXML
	private RadioButton optSize;
	
	@FXML
    private ComboBox<String> productSize;

    @FXML
    private ComboBox<String> productIngredients;

    @FXML
    private ComboBox<String> productTypes;
    
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
	private BorderPane createIngredientTypeOfProductPane;
	
	@FXML
	private BorderPane createProductPane;
	
	@FXML
	private BorderPane employeeListPane;

	@FXML
    private BorderPane productListPane;

	@FXML
	private BorderPane orderListPane;
	
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
    
    @FXML
    private TableColumn<ClientAccount, String> tcStatusCustomer;
    
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
    
    @FXML
    private TableColumn<RestaurantProduct, String> tcStatusList;
    
    @FXML
    private TableColumn<RestaurantProduct, String> tcSizeList;

    @FXML
    private TableColumn<RestaurantProduct, String> tcPriceList;



    // EMPLOYEE LIST
 
    @FXML
    private TableColumn<EmployeeAccount, String> tcEmployeeFirstName;

    @FXML
    private TableColumn<EmployeeAccount, String> tcEmployeeLastName;

    @FXML
    private TableColumn<EmployeeAccount, String> tcEmployeeId;
    
    @FXML
    private TableView<EmployeeAccount> tbEmployeeList;
    
    @FXML
    private TableColumn<EmployeeAccount, String> tcEmployeeStatus;
    
    @FXML
    private TextField tcEmployeeChangeName;
    
    @FXML
    private TextField tcEmployeeChangeLastName;
    
    @FXML
    private TextField tcEmployeeChangeID;
    
    @FXML
    private TextField tcEmployeeChangeStatus;
    
    
    // INGREDIENT LIST 
    
    @FXML
    private BorderPane ingredientListPane;

    @FXML
    private TableView<RestaurantIngredient> tbIngredientList;

    @FXML
    private TableColumn<RestaurantIngredient, String> tcIngredientName;
    
    @FXML
    private TableColumn<RestaurantIngredient, String> tcIngredientStatus;
    
    
    LaCasaDoradaGUI(LaCasaDorada lcd) throws IOException{
    	laCasaDorada = lcd;
	}
    
    // TYPE OF PRODUCT LIST 

    @FXML
    private TableView<RestaurantTypeOfProduct> tbTypeOfProductList;

    @FXML
    private TableColumn<RestaurantTypeOfProduct, String> tcTypeOfProductName;
    
    @FXML
    private TableColumn<RestaurantTypeOfProduct, String> tcTypeOfProductStatus;
    
    @FXML
    private TableColumn<RestaurantTypeOfProduct, String> tcIngredientsList;

    
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
    	String password=txtPassword.getText();
    	String firstName=txtFirstName.getText(); 
    	String lastName=txtLastName.getText();    	
    	String id=txtId.getText();
    	
    	laCasaDorada.addEmployee(userName, password, firstName, lastName, id);
    	
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
    	
    	setUpAddIngredientandTypeOfProduct();
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
    
    @FXML
    public void selectCustomer(MouseEvent event) throws IOException {
    	ClientAccount ca = this.tbCustomerList.getSelectionModel().getSelectedItem();
    	
    	if(ca != null) {
    		this.tcFirstNameCustomer.setText(ca.getFirstName());
    		this.tcLastNameCustomer.setText(ca.getLastName());
    		this.tcIdCustomer.setText(ca.getId());
    		this.tcAddressCustomer.setText(ca.getAddress());
    		this.tcPhoneNumberCustomer.setText(ca.getPhoneNumber());
    		this.tcObservationsCustomer.setText(ca.getObservations());
    	}	
    }
    
    @FXML
    public void customerDeleteOpt(ActionEvent event) throws IOException{
    	ClientAccount ca = this.tbCustomerList.getSelectionModel().getSelectedItem();
    	
    	if(ca == null) {
    		selectAnOptionAlert();
    	}else {
    		this.laCasaDorada.getClients().remove(ca);
    		this.tbCustomerList.refresh();
    		customerWasDeletedAlert();
    	}
    }

	@FXML
    public void customerDisableOpt(ActionEvent event) throws IOException{
		ClientAccount ca = this.tbCustomerList.getSelectionModel().getSelectedItem();
    	
    	if(ca == null) {
    		selectAnOptionAlert();
    	}else{
    		ca.setCustomerStatus(MembersStatus.INACTIVE);
    		this.tbCustomerList.refresh();
    		customerWasDisableAlert();
    	}
    }
	
	@FXML
    public void customerEnableOpt(ActionEvent event) throws IOException{
		ClientAccount ca = this.tbCustomerList.getSelectionModel().getSelectedItem();
    	
    	if(ca == null) {
    		selectAnOptionAlert();
    	}else{
    		ca.setCustomerStatus(MembersStatus.ACTIVE);
    		this.tbCustomerList.refresh();
    		itemWasEnableAlert();
    	}
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
    
    public void loadOrderTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("order-list.fxml"));
        fxmlLoader.setController(this);
        Parent orderListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(orderListPane);
        initializeOrderTableView();
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
    
    @FXML
    public void selectOrder(MouseEvent event) throws IOException {
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or != null) {
    		// this.tcNumberOrder.setText(or.get());
    		// this.txStatusOrder.setText(or.getOrderStatus());
    		// this.tcProductsOrder.setText(or.get());
    		// this.tcQuantityOrder.setText(or.get());
    		// this.tcEmployeeOrder.setText(or.get());
    		// this.tcDateOrder.setText(or.get());
    		// this.txHourOrder.setText(or.get());
    		// this.tcObservationsOrder.setText(or.getObservations());
    		
    		//****TERMINAR
    	}	
    }
    
    @FXML
    public void statusDelivered(ActionEvent event) throws IOException{
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or == null) {
    		selectAnOptionAlert();
    	}else{
    		or.setOrderStatus(Status.DELIVERED);
    		this.tbCustomerList.refresh();
    		orderWasUpdated();
    	}
    }

    @FXML
    public void statusProcessed(ActionEvent event) throws IOException{
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or == null) {
    		selectAnOptionAlert();
    	}else{
    		or.setOrderStatus(Status.PROCESSED);
    		this.tbCustomerList.refresh();
    		orderWasUpdated();
    	}
    }

    @FXML
    public void statusRequested(ActionEvent event) throws IOException{
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or == null) {
    		selectAnOptionAlert();
    	}else{
    		or.setOrderStatus(Status.REQUESTED);
    		this.tbCustomerList.refresh();
    		orderWasUpdated();
    	}
    }
    
    @FXML
    public void statusSent(ActionEvent event) throws IOException{
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or == null) {
    		selectAnOptionAlert();
    	}else{
    		or.setOrderStatus(Status.SENT);
    		this.tbCustomerList.refresh();
    		orderWasUpdated();
    	}
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
        //******COMPLETAR
    }
    
    public void loadProductTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product-list.fxml"));
        fxmlLoader.setController(this);
        Parent productListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(productListPane);
        initializeProductTableView();
    }
    
    @FXML
    public void selectProduct(MouseEvent event) throws IOException {
    	RestaurantProduct pr = this.tbProductList.getSelectionModel().getSelectedItem();
    	
    	if(pr != null) {
    		this.tcNameList.setText(pr.getProductName());
    		// ****COMPLETAR*****
    	}	
    }
    
    @FXML
    public void productDeleteOpt(ActionEvent event) throws IOException{
    	RestaurantProduct pr = this.tbProductList.getSelectionModel().getSelectedItem();
    	
    	if(pr == null) {
    		selectAnOptionAlert();
    	}else {
    		this.laCasaDorada.getProducts().remove(pr);
    		this.tbProductList.refresh();
    		itemWasDeletedAlert();
    	}
    }

	@FXML
    public void productDisableOpt(ActionEvent event) throws IOException{
		RestaurantProduct pr = this.tbProductList.getSelectionModel().getSelectedItem();
    	
    	if(pr == null) {
    		selectAnOptionAlert();
    	}else{
    		pr.setProductStatus(MembersStatus.INACTIVE);
    		this.tbProductList.refresh();
    		itemWasDisableAlert();
    	}
    }
	
	 @FXML
	 public void productEnableOpt(ActionEvent event) throws IOException{
		 RestaurantProduct pr = this.tbProductList.getSelectionModel().getSelectedItem();
	    	
	    	if(pr == null) {
	    		selectAnOptionAlert();
	    	}else{
	    		pr.setProductStatus(MembersStatus.ACTIVE);
	    		this.tbProductList.refresh();
	    		itemWasEnableAlert();
	    	}
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
        tcEmployeeStatus.setCellValueFactory(new PropertyValueFactory<EmployeeAccount, String>("employeeStatus"));
        
        tcEmployeeFirstName.setCellFactory(TextFieldTableCell.forTableColumn());
        tcEmployeeLastName.setCellFactory(TextFieldTableCell.forTableColumn());
        tcEmployeeId.setCellFactory(TextFieldTableCell.forTableColumn());
        
        tcEmployeeFirstName.setOnEditCommit(data -> {
            System.out.println("New first name: " +  data.getNewValue());
            System.out.println("Old first name: " + data.getOldValue());

            EmployeeAccount ea = data.getRowValue();
            ea.setFirstName(data.getNewValue());

            System.out.println(ea);
        });
        
        tcEmployeeLastName.setOnEditCommit(data -> {
            System.out.println("New last name: " +  data.getNewValue());
            System.out.println("Old last name: " + data.getOldValue());

            EmployeeAccount ea = data.getRowValue();
            ea.setLastName(data.getNewValue());

            System.out.println(ea);
        });
        
        tcEmployeeId.setOnEditCommit(data -> {
            System.out.println("New ID: " +  data.getNewValue());
            System.out.println("Old ID: " + data.getOldValue());

            EmployeeAccount ea = data.getRowValue();
            ea.setId(data.getNewValue());

            System.out.println(ea);
        });
        
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
    public void employeeDeleteOpt(ActionEvent event) throws IOException{
    	EmployeeAccount ea = this.tbEmployeeList.getSelectionModel().getSelectedItem();
    	
    	if(ea == null) {
    		selectAnOptionAlert();
    	}else {
    		this.laCasaDorada.getEmployees().remove(ea);
    		this.tbEmployeeList.refresh();
    		employeeWasDeletedAlert();
    		ObservableList<EmployeeAccount> observableList;
            observableList = FXCollections.observableArrayList(laCasaDorada.getEmployees());
            tbEmployeeList.setItems(observableList);
    	}
    }

    @FXML
    public void employeeDisableOpt(ActionEvent event) throws IOException{
    	EmployeeAccount ea = this.tbEmployeeList.getSelectionModel().getSelectedItem();
    	
    	if(ea == null) {
    		selectAnOptionAlert();
    	}else{
    		ea.setEmployeeStatus(MembersStatus.INACTIVE);
    		this.tbEmployeeList.refresh();
    		employeeWasDisableAlert();
    	}
    }
    
    @FXML
    public void employeeEnableOpt(ActionEvent event) throws IOException{
    	EmployeeAccount ea = this.tbEmployeeList.getSelectionModel().getSelectedItem();
    	
    	if(ea == null) {
    		selectAnOptionAlert();
    	}else{
    		ea.setEmployeeStatus(MembersStatus.ACTIVE);
    		this.tbEmployeeList.refresh();
    		itemWasEnableAlert();
    	}
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
        tcIngredientStatus.setCellValueFactory(new PropertyValueFactory<RestaurantIngredient, String>("ingredientStatus"));
    }
    
    public void loadIngredientTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ingredient-list.fxml"));
        fxmlLoader.setController(this);
        Parent ingredientListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(ingredientListPane);
        initializeIngredientTableView();
    }
    
    @FXML
    public void selectIngredient(MouseEvent event) throws IOException {
    	RestaurantIngredient ri = this.tbIngredientList.getSelectionModel().getSelectedItem();
    	
    	if(ri != null) {
    		this.tcEmployeeFirstName.setText(ri.getIngredientName());
    	}	
    }
    
    @FXML
    public void ingredientDeleteOpt(ActionEvent event) throws IOException{
    	RestaurantIngredient ri = this.tbIngredientList.getSelectionModel().getSelectedItem();
    	
    	if(ri == null) {
    		selectAnOptionAlert();
    	}else {
    		this.laCasaDorada.getIngredients().remove(ri);
    		this.tbIngredientList.refresh();
    		itemWasDeletedAlert();
    	}
    }

	@FXML
    public void ingredientDisableOpt(ActionEvent event) throws IOException{
		RestaurantIngredient ri = this.tbIngredientList.getSelectionModel().getSelectedItem();
    	
    	if(ri == null) {
    		selectAnOptionAlert();
    	}else{
    		ri.setIngredientStatus(MembersStatus.INACTIVE);
    		this.tbIngredientList.refresh();
    		itemWasDisableAlert();
    	}
    }
	
	@FXML
    public void ingredientEnableOpt(ActionEvent event) throws IOException{
		RestaurantIngredient ri = this.tbIngredientList.getSelectionModel().getSelectedItem();
    	
    	if(ri == null) {
    		selectAnOptionAlert();
    	}else{
    		ri.setIngredientStatus(MembersStatus.ACTIVE);
    		this.tbIngredientList.refresh();
    		itemWasEnableAlert();
    	}
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
        tcTypeOfProductStatus.setCellValueFactory(new PropertyValueFactory<RestaurantTypeOfProduct, String>("typeOfProductStatus"));
    }
    
    public void loadTypesOfProductTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("types-of-product-list.fxml"));
        fxmlLoader.setController(this);
        Parent typeOfProductListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(typeOfProductListPane);
        initializeTypeOfProductTableView();
    }
    
    @FXML
    public void selectTypeOfProduct(MouseEvent event) throws IOException {
    	RestaurantTypeOfProduct tp = this.tbTypeOfProductList.getSelectionModel().getSelectedItem();
    	
    	if(tp != null) {
    		this.tcTypeOfProductName.setText(tp.getTypeOfProductName());
    	}	
    }
    
    @FXML
    public void typeOfProductDeleteOpt(ActionEvent event) throws IOException{
    	RestaurantTypeOfProduct tp = this.tbTypeOfProductList.getSelectionModel().getSelectedItem();
    	
    	if(tp == null) {
    		selectAnOptionAlert();
    	}else {
    		this.laCasaDorada.getTypeOfProducts().remove(tp);
    		this.tbTypeOfProductList.refresh();
    		itemWasDeletedAlert();
    	}
    }

    @FXML
    public void typeOfProductDisableOpt(ActionEvent event) throws IOException{
    	RestaurantTypeOfProduct tp = this.tbTypeOfProductList.getSelectionModel().getSelectedItem();
    	
    	if(tp == null) {
    		selectAnOptionAlert();
    	}else{
    		tp.setTypeOfProductStatus(MembersStatus.INACTIVE);
    		this.tbTypeOfProductList.refresh();
    		itemWasDisableAlert();
    	}
    }
    
    @FXML
    public void typeOfProductEnableOpt(ActionEvent event) throws IOException{
    	RestaurantTypeOfProduct tp = this.tbTypeOfProductList.getSelectionModel().getSelectedItem();
    	
    	if(tp == null) {
    		selectAnOptionAlert();
    	}else{
    		tp.setTypeOfProductStatus(MembersStatus.ACTIVE);
    		this.tbTypeOfProductList.refresh();
    		 itemWasEnableAlert();
    	}
    }
   
    /*
     ************************* SCREEN CREATE INGREDIENT OR TYPE OF PRODUCT (create-ingredient-typeofproduct.fxml) *****************************************
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
    	String ingredientName = createIngredientName.getText();
    	String typeName = createTypeOfProduct.getText();
    	String option = "";
    	if(optIngredient.isSelected()){
    		option = "Ingredient";
    		laCasaDorada.addIngredient(ingredientName);
    		createIngredientName.clear();
    		if (ingredientName.isEmpty()) {
    			validationErrorAlert();
    		}else {
    			ingredientCreatedAlert();
    		}
    	}else if(optTypeOfProduct.isSelected()) {
    		option = "Type of product";
    		laCasaDorada.addTypeOfProduct(typeName);
    		createTypeOfProduct.clear();
    		if (typeName.isEmpty()) {
    			validationErrorAlert();
    		}else {
    			typeOfProductCreatedAlert();
    		}
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
    	String typeOfProduct = productTypes.getSelectionModel().getSelectedItem();
    	String sizeOfProduct = productSize.getSelectionModel().getSelectedItem();
    	double priceOfProduct = Double.parseDouble(productPrice.getText());
    	String ingredientsOfProduct = productIngredients.getValue().toString();
    	
    	if (name.isEmpty() || typeOfProduct.isEmpty() || sizeOfProduct.isEmpty() || priceOfProduct==0 || ingredientsOfProduct.isEmpty()) {
        	validationErrorAlert();
        }else{
        	productCreatedAlert();
        }
    	
    	laCasaDorada.addProduct(name, typeOfProduct, sizeOfProduct, priceOfProduct, ingredientsOfProduct);
    }
    
    public void setUpAddIngredientandTypeOfProduct() {
    	for(int i=0; i<laCasaDorada.getIngredients().size();i++) {
    		productTypes.getItems().add(laCasaDorada.getIngredients().get(i).getIngredientName());
    	}
    	for(int j=0; j<laCasaDorada.getTypeOfProducts().size();j++) {
    		productIngredients.getItems().add(laCasaDorada.getTypeOfProducts().get(j).getTypeOfProductName());
    	}
    	
    }
    
    /*
     ****************************** SCREEN CREATE CUSTOMER (create-customer.fxml) *************************************************************************
     */
    
    @FXML
    public void optCreateCustomerAccount(ActionEvent event) throws IOException{
    	String firstName=txtCxFirstName.getText();
    	String lastName=txtCxLastName.getText();
    	String id=txtCxId.getText();
    	String address=txtCxAddress.getText();
    	String phoneNumber=txtCxPhoneNumber.getText();
    	String observations=txtCxObservations.getText();
    	

    	if (firstName.isEmpty() || lastName.isEmpty() || id.isEmpty() || address.isEmpty() || phoneNumber.isEmpty() || observations.isEmpty()) {
        	validationErrorAlert();
        }else{
        	customerCreatedAlert();
        }
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
	    alert.setContentText("Select an option");
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
    
    private void employeeWasDisableAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Disable employee");
	    alert.setHeaderText("");
	    alert.setContentText("Employee was disable successfully");
	    alert.showAndWait();
	}
    
    private void customerWasDeletedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Delete customer");
	    alert.setHeaderText("");
	    alert.setContentText("Customer was deleted successfully");
	    alert.showAndWait();
		
	}
    
    private void customerWasDisableAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Disable customer");
	    alert.setHeaderText("");
	    alert.setContentText("Customer was disable successfully");
	    alert.showAndWait();
	}
    
    private void orderWasUpdated() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Updated order");
	    alert.setHeaderText("");
	    alert.setContentText("Order was updated");
	    alert.showAndWait();
		
	}
    
    private void itemWasDeletedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Delete item");
	    alert.setHeaderText("");
	    alert.setContentText("Item was deleted");
	    alert.showAndWait();
		
	}
    
    private void itemWasDisableAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Disable item");
	    alert.setHeaderText("");
	    alert.setContentText("Item was disable successfully");
	    alert.showAndWait();
	}
    
    private void itemWasEnableAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Disable item");
	    alert.setHeaderText("");
	    alert.setContentText("Item was enable successfully");
	    alert.showAndWait();
	}
   
}
