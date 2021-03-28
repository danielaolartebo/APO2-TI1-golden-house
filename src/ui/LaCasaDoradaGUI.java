package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

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
import javafx.scene.control.Label;
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
import model.ProductQuantity;
import model.RestaurantIngredient;
import model.RestaurantProduct;
import model.RestaurantTypeOfProduct;
import model.Status;

public class LaCasaDoradaGUI {

	private LaCasaDorada laCasaDorada;
	
	// MINI TABLE VIEW IN CREATE PRODUCT SCREEN 
	
	@FXML
	private TableView<RestaurantIngredient> miniTbCreateProduct;

	@FXML
	private TableColumn<RestaurantIngredient, String> miniTcIngredients;
	
	// MINI TABLE VIEW IN CREATE ORDER SCREEN

	@FXML
	private TableView<ProductQuantity> miniTbCreateOrder;

	@FXML
	private TableColumn<ProductQuantity, String> miniTcProduct;

	@FXML
	private TableColumn<ProductQuantity, Double> miniTcQuantity;
	
	//******************************************************
	
	@FXML
	private TextField txtCustomerName;

	@FXML
	private Label totalOrder;

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
    private TextField productSize;

    @FXML
    private ComboBox<String> productIngredients;

    @FXML
    private ComboBox<String> productTypes;
    
	@FXML
	private TextField productName;

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
    private TableColumn<Order, String> tcCustomerOrder;


    @FXML
    private TableColumn<Order, String> tcNumberOrder;

    @FXML
    private TableColumn<Order, String> txStatusOrder;

    @FXML
    private TableColumn<Order, Double> txStatusOrder1;
    
    @FXML
    private TableColumn<Order, String> tcProductsOrder;

    @FXML
    private TableColumn<Order, Double> tcQuantityOrder;

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
    private TableColumn<RestaurantProduct, Double> tcPriceList;
    
    @FXML
    private TableColumn<RestaurantProduct, String[]> tcIngredientsList;



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

    
    // INGREDIENT LIST 
    
    @FXML
    private BorderPane ingredientListPane;

    @FXML
    private TableView<RestaurantIngredient> tbIngredientList;

    @FXML
    private TableColumn<RestaurantIngredient, String> tcIngredientName;
    
    @FXML
    private TableColumn<RestaurantIngredient, String> tcIngredientStatus;
    
    @FXML
    private ObservableList<RestaurantIngredient> temp;

    // TYPE OF PRODUCT LIST 

    @FXML
    private TableView<RestaurantTypeOfProduct> tbTypeOfProductList;

    @FXML
    private TableColumn<RestaurantTypeOfProduct, String> tcTypeOfProductName;
    
    @FXML
    private TableColumn<RestaurantTypeOfProduct, String> tcTypeOfProductStatus;
    
    public final static String SAVE_PATH_FILE = "data.laCasaDorada.csv";
    
    LaCasaDoradaGUI(LaCasaDorada lcd) throws IOException{
    	laCasaDorada = lcd;
	}
    
    public void saveData() throws FileNotFoundException, IOException{
    	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_PATH_FILE));
    	oos.writeObject(laCasaDorada);
    	oos.close();
    }
    
    public void loadData() throws IOException, ClassNotFoundException{
    	File f = new File (SAVE_PATH_FILE);
    	if(f.exists()) {
    		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_PATH_FILE));
    		laCasaDorada = (LaCasaDorada)ois.readObject();
    		ois.close();
    	}
    }
    
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
	    alert.setTitle("La Casa Dorada ");
	    alert.setHeaderText("Credits");
	    alert.setContentText("Daniela Olarte y Santiago Gutierrez \nAlgorithms II");
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
    	
    	if (userName.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty()) {
        	validationErrorAlert();
        }else{
        	accountCreatedAlert();
        	laCasaDorada.addEmployee(userName, password, firstName, lastName, id);
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
    public void menuCreateOrder(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-order.fxml"));
    	fxmlLoader.setController(this);
    	Parent createOrderPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createOrderPane);

    	setUpAddOrder();
    	initializeMiniOrderTableView();
    	
    	ObservableList<ProductQuantity> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getProductQuantity());
        miniTbCreateOrder.setItems(observableList);
        observableList.removeAll(observableList);
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
    	initializeMiniProductTableView();
    }

    @FXML
    public void menuCreateTypeOfProduct(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-ingredient-typeofproduct.fxml"));
    	fxmlLoader.setController(this);
    	Parent createIngredientTypeOfProductPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createIngredientTypeOfProductPane);
    }
    
    @FXML
    public void menuCreateCustomer(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("create-customer.fxml"));
    	fxmlLoader.setController(this);
    	Parent createCustomerPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(createCustomerPane);
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
    public void menuUpdateCustomer(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("customer-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent customerListPane = fxmlLoader.load();
    	mainPane.getChildren().setAll(customerListPane);
    	initializeCustomerTableView();
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
        tcStatusCustomer.setCellValueFactory(new PropertyValueFactory<ClientAccount, String>("customerStatus"));
        
        tcFirstNameCustomer.setCellFactory(TextFieldTableCell.forTableColumn());
        tcLastNameCustomer.setCellFactory(TextFieldTableCell.forTableColumn());
        tcIdCustomer.setCellFactory(TextFieldTableCell.forTableColumn());
        tcAddressCustomer.setCellFactory(TextFieldTableCell.forTableColumn());
        tcPhoneNumberCustomer.setCellFactory(TextFieldTableCell.forTableColumn());
        tcObservationsCustomer.setCellFactory(TextFieldTableCell.forTableColumn());
        
        tcFirstNameCustomer.setOnEditCommit(data -> {
            System.out.println("New first name: " +  data.getNewValue());
            System.out.println("Old first name: " + data.getOldValue());

            ClientAccount ca = data.getRowValue();
            ca.setFirstName(data.getNewValue());

            System.out.println(ca);
        });
        
        tcLastNameCustomer.setOnEditCommit(data -> {
            System.out.println("New lastname: " +  data.getNewValue());
            System.out.println("Old  lastname: " + data.getOldValue());

            ClientAccount ca = data.getRowValue();
            ca.setLastName(data.getNewValue());

            System.out.println(ca);
        });
        
        tcIdCustomer.setOnEditCommit(data -> {
            System.out.println("New ID: " +  data.getNewValue());
            System.out.println("Old ID: " + data.getOldValue());

            ClientAccount ca = data.getRowValue();
            ca.setId(data.getNewValue());

            System.out.println(ca);
        });
        
        tcAddressCustomer.setOnEditCommit(data -> {
            System.out.println("New address: " +  data.getNewValue());
            System.out.println("Old address: " + data.getOldValue());

            ClientAccount ca = data.getRowValue();
            ca.setAddress(data.getNewValue());

            System.out.println(ca);
        });
        
        tcPhoneNumberCustomer.setOnEditCommit(data -> {
            System.out.println("New phone number: " +  data.getNewValue());
            System.out.println("Old phone number: " + data.getOldValue());

            ClientAccount ca = data.getRowValue();
            ca.setPhoneNumber(data.getNewValue());

            System.out.println(ca);
        });
        
        tcObservationsCustomer.setOnEditCommit(data -> {
            System.out.println("New observation: " +  data.getNewValue());
            System.out.println("Old observation: " + data.getOldValue());

            ClientAccount ca = data.getRowValue();
            ca.setObservations(data.getNewValue());

            System.out.println(ca);
        });
        
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
    		ObservableList<ClientAccount> observableList;
            observableList = FXCollections.observableArrayList(laCasaDorada.getClients());
            tbCustomerList.setItems(observableList);
    	}
    }

	@FXML
    public void customerDisableOpt(ActionEvent event) throws IOException{
		ClientAccount ca = this.tbCustomerList.getSelectionModel().getSelectedItem();
    	
    	if(ca == null) {
    		selectAnOptionAlert();
    	}else{
    		ca.setCustomerStatus(MembersStatus.INACTIVA);
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
    		ca.setCustomerStatus(MembersStatus.ACTIVA);
    		this.tbCustomerList.refresh();
    		itemWasEnableAlert();
    	}
    }
	
	@FXML
	public void searchCustomer(ActionEvent event) throws IOException{

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
        
        tcNumberOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("number"));   
        tcCustomerOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("nameClient"));
        tcProductsOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("product"));
        tcQuantityOrder.setCellValueFactory(new PropertyValueFactory<Order, Double>("quantity"));
        tcEmployeeOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("nameEmployee"));
        tcDateOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("date"));
        txHourOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("time"));
        tcObservationsOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("observations"));
        txStatusOrder.setCellValueFactory(new PropertyValueFactory<Order, String>("orderStatus"));
        txStatusOrder1.setCellValueFactory(new PropertyValueFactory<Order, Double>("price"));
    }
	
    @FXML
    public void selectOrder(MouseEvent event) throws IOException {
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or != null) {
    		this.tcNumberOrder.setText(String.valueOf(or.getNumber()));

    		this.tcProductsOrder.setText(String.valueOf(or.getNameProduct()));

    		this.tcCustomerOrder.setText(or.getNameClient());
    		this.tcProductsOrder.setText(or.getProduct().getName());

    		this.tcQuantityOrder.setText(String.valueOf(or.getQuantity()));
    		this.tcEmployeeOrder.setText(or.getNameEmployee());
    		this.tcDateOrder.setText(String.valueOf(or.getDate()));
    		this.txHourOrder.setText(String.valueOf(or.getTime()));
    		this.tcObservationsOrder.setText(or.getObservations());
    	}	
    }
    
    public void loadMiniProductTable(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("order.fxml"));
        fxmlLoader.setController(this);
        Parent ordertListPane = fxmlLoader.load();
        menuPane.getChildren().clear();
        menuPane.setCenter(ordertListPane);
        initializeMiniOrderTableView();
        
        ObservableList<ProductQuantity> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getProductQuantity());
        miniTbCreateOrder.setItems(observableList);
    }
    
    @FXML
    public void statusRequested(ActionEvent event) throws IOException{
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or == null) {
    		selectAnOptionAlert();
    	}else{
    		or.setOrderStatus(Status.SOLICITADO);
    		this.tbOrderList.refresh();
    		orderWasUpdated();
    	}
    } 

    @FXML
    public void statusProcessed(ActionEvent event) throws IOException{
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or == null) {
    		selectAnOptionAlert();
    	}else{
    		or.setOrderStatus(Status.EN_PROCESO);
    		this.tbOrderList.refresh();
    		orderWasUpdated();
    	}
    }

    
    
    @FXML
    public void statusSent(ActionEvent event) throws IOException{
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or == null) {
    		selectAnOptionAlert();
    	}else{
    		or.setOrderStatus(Status.ENVIADO);
    		this.tbOrderList.refresh();
    		orderWasUpdated();
    	}
    }
    
    @FXML
    public void statusDelivered(ActionEvent event) throws IOException{
    	Order or = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(or == null) {
    		selectAnOptionAlert();
    	}else{
    		or.setOrderStatus(Status.ENTREGADO);
    		this.tbOrderList.refresh();
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
    	laCasaDorada.sortByPrice();
        ObservableList<RestaurantProduct> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getProducts());
        tbProductList.setItems(observableList);
        
        tcNameList.setCellValueFactory(new PropertyValueFactory<RestaurantProduct, String>("name"));
        tcTypeList.setCellValueFactory(new PropertyValueFactory<RestaurantProduct, String>("typeOfProduct"));
        tcIngredientsList.setCellValueFactory(new PropertyValueFactory<RestaurantProduct, String[]>("ingredientsOfProduct"));
        tcSizeList.setCellValueFactory(new PropertyValueFactory<RestaurantProduct, String>("sizeOfProduct"));
        tcPriceList.setCellValueFactory(new PropertyValueFactory<RestaurantProduct, Double>("priceOfProduct"));
        tcStatusList.setCellValueFactory(new PropertyValueFactory<RestaurantProduct, String>("productStatus"));
        
        tcNameList.setCellFactory(TextFieldTableCell.forTableColumn());
        tcTypeList.setCellFactory(TextFieldTableCell.forTableColumn());
        tcSizeList.setCellFactory(TextFieldTableCell.forTableColumn());
        
        
        /*tcNameList.setOnEditCommit(data -> {
            System.out.println("New first name: " +  data.getNewValue());
            System.out.println("Old first name: " + data.getOldValue());
            RestaurantProduct pr = data.getRowValue();
            pr.setName(data.getNewValue());
            System.out.println(pr);
        });*/
        
        /*tcTypeList.setOnEditCommit(data -> {
            System.out.println("New first name: " +  data.getNewValue());
            System.out.println("Old first name: " + data.getOldValue());
            RestaurantProduct pr = data.getRowValue();
            pr.setTypeOfProduct(data.getNewValue());
            System.out.println(pr);
        });*/
        
    /*    tcIngredientsList.setOnEditCommit(data -> {
            System.out.println("New first name: " +  data.getNewValue());
            System.out.println("Old first name: " + data.getOldValue());
            RestaurantProduct pr = data.getRowValue();
            pr.setIngredientsOfProduct(data.getNewValue());
            System.out.println(pr);   
        });  */
        
        tcSizeList.setOnEditCommit(data -> {
            System.out.println("New first name: " +  data.getNewValue());
            System.out.println("Old first name: " + data.getOldValue());

            RestaurantProduct pr = data.getRowValue();
            pr.setSizeOfProduct(data.getNewValue());

            System.out.println(pr);
        });
        
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
    		this.tcNameList.setText(pr.getName());
    		this.tcTypeList.setText(pr.getTypeOfProduct());
    		// this.tcIngredientsList.setText(pr.getIngredientsOfProduct());
    		this.tcSizeList.setText(pr.getSizeOfProduct());
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
    		laCasaDorada.sortByPrice();
    		ObservableList<RestaurantProduct> observableList;
            observableList = FXCollections.observableArrayList(laCasaDorada.getProducts());
            tbProductList.setItems(observableList);
    	}
    }

	@FXML
    public void productDisableOpt(ActionEvent event) throws IOException{
		RestaurantProduct pr = this.tbProductList.getSelectionModel().getSelectedItem();
    	
    	if(pr == null) {
    		selectAnOptionAlert();
    	}else{
    		pr.setProductStatus(MembersStatus.INACTIVA);
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
	    		pr.setProductStatus(MembersStatus.ACTIVA);
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
    		ea.setEmployeeStatus(MembersStatus.INACTIVA);
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
    		ea.setEmployeeStatus(MembersStatus.ACTIVA);
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

    	laCasaDorada.sortByIngredientName();
        ObservableList<RestaurantIngredient> observableListIngredient;
        observableListIngredient = FXCollections.observableArrayList(laCasaDorada.getIngredients());
        tbIngredientList.setItems(observableListIngredient);
        
        tcIngredientName.setCellValueFactory(new PropertyValueFactory<RestaurantIngredient, String>("ingredientName"));
        tcIngredientStatus.setCellValueFactory(new PropertyValueFactory<RestaurantIngredient, String>("ingredientStatus"));
        
        tcIngredientName.setCellFactory(TextFieldTableCell.forTableColumn());
        
        tcIngredientName.setOnEditCommit(data -> {
            System.out.println("New first name: " +  data.getNewValue());
            System.out.println("Old first name: " + data.getOldValue());

            RestaurantIngredient ri = data.getRowValue();
            ri.setIngredientName(data.getNewValue());

            System.out.println(ri);
        });
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
    		this.tcIngredientName.setText(ri.getIngredientName());
    	}	
    }
    
    @FXML
    public void ingredientDeleteOpt(ActionEvent event) throws IOException{
    	RestaurantIngredient ri = this.tbIngredientList.getSelectionModel().getSelectedItem();
    	
    	if(ri == null) {
    		selectAnOptionAlert();
    	}else if(laCasaDorada.verifyRemoveIngredientInOrder(ri)){
    		this.laCasaDorada.getIngredients().remove(ri);
    		this.tbIngredientList.refresh();
    		itemWasDeletedAlert();
    		laCasaDorada.sortByIngredientName();
    		ObservableList<RestaurantIngredient> observableList;
            observableList = FXCollections.observableArrayList(laCasaDorada.getIngredients());
            tbIngredientList.setItems(observableList);
    	}else {
    		itemCannotBeDeletedAlert();
    	}
    }

	@FXML
    public void ingredientDisableOpt(ActionEvent event) throws IOException{
		RestaurantIngredient ri = this.tbIngredientList.getSelectionModel().getSelectedItem();
    	
    	if(ri == null) {
    		selectAnOptionAlert();
    	}else{
    		ri.setIngredientStatus(MembersStatus.INACTIVA);
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
    		ri.setIngredientStatus(MembersStatus.ACTIVA);
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
    		ObservableList<RestaurantTypeOfProduct> observableList;
            observableList = FXCollections.observableArrayList(laCasaDorada.getTypeOfProducts());
            tbTypeOfProductList.setItems(observableList);
    	}
    }

    @FXML
    public void typeOfProductDisableOpt(ActionEvent event) throws IOException{
    	RestaurantTypeOfProduct tp = this.tbTypeOfProductList.getSelectionModel().getSelectedItem();
    	
    	if(tp == null) {
    		selectAnOptionAlert();
    	}else{
    		tp.setTypeOfProductStatus(MembersStatus.INACTIVA);
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
    		tp.setTypeOfProductStatus(MembersStatus.ACTIVA);
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
    			saveData();
    		}
    	}else if(optTypeOfProduct.isSelected()) {
    		option = "Type of product";
    		laCasaDorada.addTypeOfProduct(typeName);
    		createTypeOfProduct.clear();
    		if (typeName.isEmpty()) {
    			validationErrorAlert();
    		}else {
    			typeOfProductCreatedAlert();
    			saveData();
    		}
    	}
    	System.out.println(option);
    }

	/*
     ************************************ SCREEN CREATE PRODUCT (create-product.fxml) *************************************************************************
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
    	String ingredientsOfProduct = productIngredients.getSelectionModel().getSelectedItem();
    	String sizeOfProduct = productSize.getText();
    	double priceOfProduct = Double.parseDouble(productPrice.getText());
    	
    	
   
    	ArrayList<RestaurantIngredient> ingredients = new ArrayList<>(miniTbCreateProduct.getItems());
    	String [] ingredientsProducts=new String [ingredients.size()];
    	
    	for (int i=0;i<ingredients.size();i++) {
    		ingredientsProducts[i]=ingredients.get(i).getIngredientName();
    	}
    	
    	if (name.isEmpty() || typeOfProduct.isEmpty() || ingredientsOfProduct.isEmpty() || sizeOfProduct.isEmpty() || priceOfProduct==0) {
        	validationErrorAlert();
        }else{
        	laCasaDorada.addProduct(name, typeOfProduct, ingredientsProducts, sizeOfProduct, priceOfProduct);
        	productName.clear(); productSize.clear(); productPrice.clear(); 
        	productCreatedAlert();
        	saveData();
        }
    	
    	
    }
    
    public void setUpAddIngredientandTypeOfProduct() throws IOException{
    	for(int i=0; i<laCasaDorada.getIngredients().size();i++) {
    		productIngredients.getItems().add(laCasaDorada.getIngredients().get(i).getIngredientName());
    	}
    	for(int j=0; j<laCasaDorada.getTypeOfProducts().size();j++) {
    		productTypes.getItems().add(laCasaDorada.getTypeOfProducts().get(j).getTypeOfProductName());
    	}
    	
    }
    
    @FXML
    public void optAddIngredient(ActionEvent event) throws IOException{
    	if(!productIngredients.getSelectionModel().getSelectedItem().equals("")) {
    		 temp.add(laCasaDorada.findIngredient(productIngredients.getSelectionModel().getSelectedItem()));
    	}
    	miniTbCreateProduct.refresh();
    }
    
    
    private void initializeMiniProductTableView(){
    	
    	temp = FXCollections.observableArrayList();
    	miniTbCreateProduct.setItems(temp);
        
        miniTcIngredients.setCellValueFactory(new PropertyValueFactory<RestaurantIngredient, String>("ingredientName"));
       
        miniTcIngredients.setCellFactory(TextFieldTableCell.forTableColumn());
    }
    
    public void selectMiniIngredient(MouseEvent event) throws IOException {
    	RestaurantIngredient mri = this.miniTbCreateProduct.getSelectionModel().getSelectedItem();
    	
    	if(mri != null) {
    		this.miniTcIngredients.setText(mri.getIngredientName());
    	}	
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
    public void COcreateOrder(ActionEvent event) throws IOException{

    	String client = COcustomerName.getValue();
    	String product = COaddProduct.getValue();
    	String employee = COemployeeName.getValue();
    	String code = null;
    	LocalDate date = LocalDate.now();
    	LocalTime time = LocalTime.now();
    	double quantity = Double.parseDouble(COaddQuantity.getText());
    	String observations = COobservations.getText();
    	int number = laCasaDorada.getNumberList();
    	number+=1;	
    	laCasaDorada.setNumberList(number);
    	

    	if (client.isEmpty() || product.isEmpty() || employee.isEmpty() || observations.isEmpty() || quantity==0) {
        	validationErrorAlert();
        }else{
        	System.out.println(employee);
        	System.out.println(product);
        	System.out.println(client);
        	laCasaDorada.addOrder(laCasaDorada.findClient(client), laCasaDorada.findProduct(product), laCasaDorada.findEmployee(employee), code, date, time, quantity,observations, number, quantity);
        	COaddQuantity.clear(); COobservations.clear();
        	productCreatedAlert();
        	saveData();
        }
    	
    	
    }
    

    public void setUpAddOrder() {
    	for(int i=0; i<laCasaDorada.getProducts().size();i++) {
    		COaddProduct.getItems().add(laCasaDorada.getProducts().get(i).getName());
    	}
    	for(int j=0; j<laCasaDorada.getClients().size();j++) {
         	COcustomerName.getItems().add(laCasaDorada.getClients().get(j).getFirstName());	
        }
    	for(int i=0; i<laCasaDorada.getEmployees().size();i++) {
            COemployeeName.getItems().add(laCasaDorada.getEmployees().get(i).getFirstName());
   		}
    	
    }
    
    @FXML
    public void COoptAddProduct(ActionEvent event) throws IOException{
    	
    	String product = COaddProduct.getValue();
    	double quantity = Double.parseDouble(COaddQuantity.getText());
    	double price = 0;
    	double priceT=laCasaDorada.getPriceTotal();
    	for(int i=0; i<laCasaDorada.getProducts().size() ;i++) {
    		if(laCasaDorada.getProducts().get(i).getName().equals(product)) {
    		price = laCasaDorada.getProducts().get(i).getPriceOfProduct();
    		}
    	}
    	double priceTotal = price*quantity;
    	System.out.println(product);
    	System.out.println(priceTotal); 
    	priceT=priceTotal+priceT;
    	laCasaDorada.setPriceTotal(priceT);
    	
    	if(product.isEmpty() || quantity==0) {
    		validationErrorAlert();
    	}else {
    		System.out.println(quantity);
    		laCasaDorada.addProductQuantity(laCasaDorada.findProduct(product), quantity, laCasaDorada.findPrice(price));
    		
    		miniTbCreateOrder.refresh();
    		totalOrder.setText(String.valueOf(priceT));
    		ObservableList<ProductQuantity> observableList;
            observableList = FXCollections.observableArrayList(laCasaDorada.getProductQuantity());
            miniTbCreateOrder.setItems(observableList);
    	}
    	
    }
    
    
    private void initializeMiniOrderTableView(){
    	ObservableList<ProductQuantity> observableList;
        observableList = FXCollections.observableArrayList(laCasaDorada.getProductQuantity());
        miniTbCreateOrder.setItems(observableList);
        
    	miniTcProduct.setCellValueFactory(new PropertyValueFactory<ProductQuantity, String>("nameProduct"));
    	miniTcQuantity.setCellValueFactory(new PropertyValueFactory<ProductQuantity, Double>("quantity"));
       
    	miniTcProduct.setCellFactory(TextFieldTableCell.forTableColumn());
    }
   
    public void selectMiniProduct(MouseEvent event) throws IOException {
    	ProductQuantity mrp = this.miniTbCreateOrder.getSelectionModel().getSelectedItem();
    	
    	if(mrp != null) {
    		this.miniTcProduct.setText(mrp.getNameProduct());
    		this.miniTcQuantity.setText(String.valueOf(mrp.getQuantity()));
    	}	
    }
    
    @FXML
    public void deleteOrder(ActionEvent event) {
    	Order ro = this.tbOrderList.getSelectionModel().getSelectedItem();
    	
    	if(ro == null) {
    		selectAnOptionAlert();
    	}else if(ro.getOrderStatus()==Status.ENTREGADO){
    		this.laCasaDorada.getOrders().remove(ro);
    		this.tbOrderList.refresh();
    		itemWasDeletedAlert();
    		ObservableList<Order> observableList;
    		observableList = FXCollections.observableArrayList(laCasaDorada.getOrders());
    		tbOrderList.setItems(observableList);
    	}else {
    		itemCannotBeDeletedAlert();
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
        	laCasaDorada.addClient(firstName, lastName, id, address, phoneNumber, observations);
        	txtCxFirstName.clear(); txtCxLastName.clear(); txtCxId.clear(); txtCxAddress.clear(); txtCxPhoneNumber.clear(); txtCxObservations.clear();
        	customerCreatedAlert();
        	saveData();
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
    public void importOrderData(ActionEvent event) {
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	File f = fileChooser.showOpenDialog(menuPane.getScene().getWindow());
    	if(f!=null) {
    		try {
    			laCasaDorada.importOrderData(f.getAbsolutePath());
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
	    alert.setTitle("Producto creado");
	    alert.setHeaderText("");
	    alert.setContentText("El producto ha sido creado satisfactoriamente");
	    alert.showAndWait();
    }
    
    @FXML
    private void ingredientCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Ingrediente creado");
	    alert.setHeaderText("");
	    alert.setContentText("El ingrediente ha sido creado");
	    alert.showAndWait();
    }
    
    @FXML
    private void typeOfProductCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Tipo de producto creado");
	    alert.setHeaderText("");
	    alert.setContentText("El tipo de producto ha sido creado satisfactoriamente");
	    alert.showAndWait();
    }
    
    @FXML
    private void customerCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Cliente creado");
	    alert.setHeaderText("");
	    alert.setContentText("El cliente ha sido creado satisfactoriamente");
	    alert.showAndWait();
    }
    
    @FXML
    private void accountCreatedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Cuenta creada");
	    alert.setHeaderText("");
	    alert.setContentText("Nueva cuenta ha sido creada");
	    alert.showAndWait();
    }
    
    @FXML
    private void validationErrorAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Error de validación");
	    alert.setHeaderText("");
	    alert.setContentText("Llene todos los espacios");
	    alert.showAndWait();
    }
    
    @FXML
    private void loginErrorAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Log in incorrecto");
	    alert.setHeaderText("");
	    alert.setContentText("El usuario o contraseña no coinciden");
	    alert.showAndWait();
	}
    
    @FXML
    private void importErrorAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Import empleado");
	    alert.setHeaderText("");
	    alert.setContentText("El empleado no pudo ser importado");
	    alert.showAndWait();
	}
    
    @FXML
    private void importSuccessAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Importar empleado");
	    alert.setHeaderText("");
	    alert.setContentText("El empleado fue importado satisfactoriamente");
	    alert.showAndWait();
	}
    
    @FXML
    private void selectAnOptionAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Error");
	    alert.setHeaderText("");
	    alert.setContentText("Seleccione una opción");
	    alert.showAndWait();
	}
    
    @FXML
    private void employeeWasDeletedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Eliminar empleado");
	    alert.setHeaderText("");
	    alert.setContentText("El empleado fue eliminado satisfactoriamente");
	    alert.showAndWait();
	}
    
    private void employeeWasDisableAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Deshabilitar empleado");
	    alert.setHeaderText("");
	    alert.setContentText("El empleado fue deshabilitado satisfactoriamente");
	    alert.showAndWait();
	}
    
    private void customerWasDeletedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Eliminar cliente");
	    alert.setHeaderText("");
	    alert.setContentText("El cliente fue eliminado satisfactoriamente");
	    alert.showAndWait();
		
	}
    
    private void customerWasDisableAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Deshabilitar cliente");
	    alert.setHeaderText("");
	    alert.setContentText("El cliente fue deshabilitado satisfactoriamente");
	    alert.showAndWait();
	}
    
    private void orderWasUpdated() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Actualizar orden");
	    alert.setHeaderText("");
	    alert.setContentText("La orden fue actualizada satisfactoriamente");
	    alert.showAndWait();
		
	}
    
    private void itemWasDeletedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Eliminar item");
	    alert.setHeaderText("");
	    alert.setContentText("El item fue eliminado satisfactoriamente");
	    alert.showAndWait();
		
	}
    
    private void itemWasDisableAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Deshabilitar item");
	    alert.setHeaderText("");
	    alert.setContentText("El item fue deshabilitado satisfactoriamente");
	    alert.showAndWait();
	}
    
    private void itemWasEnableAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Habilitar item");
	    alert.setHeaderText("");
	    alert.setContentText("El item fue habilitado satisfactoriamente");
	    alert.showAndWait();
	}
    
    private void itemCannotBeDeletedAlert() {
    	Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Eliminar item error");
	    alert.setHeaderText("");
	    alert.setContentText("El item no se puede eliminar porque está en uso");
	    alert.showAndWait();
   	}
   
}