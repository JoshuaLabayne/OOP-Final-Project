package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.MenuItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import alert.AlertMaker;
public class ProductController implements Initializable {


    

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, name9, price1, price2, price3, price4, price5, price6, price7, price8, price9;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    @FXML
    MenuItem logout;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    private Image icon;

    static AirForce1_FriendsAndFamily shoe1 = new AirForce1_FriendsAndFamily();
    static SBDunkLow_FreddyKrugger shoe2 = new SBDunkLow_FreddyKrugger();
    static Jordan4_Manila shoe3 = new Jordan4_Manila();
    static Jordan1_High_Dior shoe4 = new Jordan1_High_Dior();
    static Jordan1_Low_Travis_Scott_X_Fragment shoe5 = new Jordan1_Low_Travis_Scott_X_Fragment();
    static Kobe5_Bruce_Lee shoe6 = new Kobe5_Bruce_Lee();
    static Jordan1_Low_Reverse_Mocha shoe7 = new Jordan1_Low_Reverse_Mocha();
    static Jordan4_Travis_Purple shoe8 = new Jordan4_Travis_Purple();
    static Jordan1_Low_Dior shoe9 = new Jordan1_Low_Dior();
        

   
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {


        //============== AIR FORCE 1 - FRIENDS AND FAMILY ==================//
        shoe1.setProductName("AIR FORCE 1 - FRIENDS AND FAMILY");
        name1.setText(shoe1.getProductName());

        shoe1.setProductPrice(146.00);
        price1.setText('$'+Double.toString(shoe1.getProductPrice()));

        shoe1.setProductImage("images/air force 1 tiffany.png");
        Image AIRFORCE1_FRIENDS_AND_FAMILY = new Image(shoe1.getProductImage());
        img1.setImage(AIRFORCE1_FRIENDS_AND_FAMILY);

        // ============== SB DUNK LOW - FREDDY KRUEGER ==================//

        shoe2.setProductName("SB DUNK LOW - FREDDY KRUEGER");
        name2.setText(shoe2.getProductName());

        shoe2.setProductPrice(128.00);
        price2.setText('$'+Double.toString(shoe2.getProductPrice()));

        shoe2.setProductImage("images/nike sb dunk freddy krueger.png");
        Image SB_DUNK_LOW_FREDDY_KRUEGER = new Image(shoe2.getProductImage());
        img2.setImage(SB_DUNK_LOW_FREDDY_KRUEGER); 

        // ============== JORDAN 4 - MANILA ==================//
        shoe3.setProductName("JORDAN 4 - MANILA");
        name3.setText(shoe3.getProductName());

        shoe3.setProductPrice(176.00);
        price3.setText('$'+Double.toString(shoe3.getProductPrice()));

        shoe3.setProductImage("images/Jordan 4 manila.png");
        Image JORDAN_4_MANILA = new Image(shoe3.getProductImage());
        img3.setImage(JORDAN_4_MANILA);

         // ============== Jordan 1 High - Dior ==================//
        shoe4.setProductName("Jordan 1 High - Dior");
        name4.setText(shoe4.getProductName());

        shoe4.setProductPrice(178.00);
        price4.setText('$'+Double.toString(shoe4.getProductPrice()));

        shoe4.setProductImage("images/Jordan 1 high dior.png");
        Image Jordan1_High_Dior = new Image(shoe4.getProductImage());
        img4.setImage(Jordan1_High_Dior);

        // ============== JORDAN 1 LOW - TRAVIS SCOTT X FRAGMENT  ==================//

        shoe5.setProductName("JORDAN 1 LOW - TRAVIS SCOTT X FRAGMENT");
        name5.setText(shoe5.getProductName());

        shoe5.setProductPrice(146.00);
        price5.setText('$'+Double.toString(shoe5.getProductPrice()));

        shoe5.setProductImage("images/Jordan 1 low fragment.png");
        Image Jordan1_Low_Travis_Scott_X_Fragment = new Image(shoe5.getProductImage());
        img5.setImage(Jordan1_Low_Travis_Scott_X_Fragment); 

        // ============== KOBE 5 - BRUCE LEE ==================//
      
        shoe6.setProductName("KOBE 5 - BRUCE LEE");
        name6.setText(shoe6.getProductName());

        shoe6.setProductPrice(176.00);
        price6.setText('$'+Double.toString(shoe6.getProductPrice()));

        shoe6.setProductImage("images/Zoom Kobe 5 Bruce Lee.png");
        Image Kobe5_Bruce_Lee = new Image(shoe6.getProductImage());
        img6.setImage(Kobe5_Bruce_Lee);

        // ============== JORDAN 1 - REVERSE MOCHA ==================//
      
        shoe7.setProductName("JORDAN 1 - TRAVIS REVERSE MOCHA");
        name7.setText(shoe7.getProductName());

        shoe7.setProductPrice(176.00);
        price7.setText('$'+Double.toString(shoe7.getProductPrice()));

        shoe7.setProductImage("images/Jordan 1 travis reverse mocha.png");
        Image Jordan1_Reverse_Mocha = new Image(shoe7.getProductImage());
        img7.setImage(Jordan1_Reverse_Mocha);

        // ============== JORDAN 4 - TRAVIS PURPLE ==================//
       
        shoe8.setProductName("JORDAN 4 - TRAVIS PURPLE");
        name8.setText(shoe8.getProductName());

        shoe8.setProductPrice(176.00);
        price8.setText('$'+Double.toString(shoe8.getProductPrice()));

        shoe8.setProductImage("images/Jordan 4 travis.png");
        Image Jordan4_Travis_Purple = new Image(shoe8.getProductImage());
        img8.setImage(Jordan4_Travis_Purple);

        // ============== JORDAN 1 - LOW DIOR ==================//
       
        shoe9.setProductName("JORDAN 1 - LOW DIOR");
        name9.setText(shoe9.getProductName());

        shoe9.setProductPrice(146.00);
        price9.setText('$'+Double.toString(shoe9.getProductPrice()));

        shoe9.setProductImage("images/Jordan 1 low dior.png");
        Image Jordan1_Low_Dior = new Image(shoe9.getProductImage());
        img9.setImage(Jordan1_Low_Dior);   
       
       
        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            
        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            shoe1.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == button2) {
            shoe2.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == button3) {
            shoe3.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }
        else if (sourceButton.equals(button4)) {
            shoe4.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane4);
        }

        else if (sourceButton == button5) {
            shoe5.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane5);
        }

        else if (sourceButton == button6) {
            shoe6.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane6);
        }
         else if (sourceButton.equals(button7)) {
            shoe7.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane7);
        }

        else if (sourceButton == button8) {
            shoe8.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane8);
        }

        else if (sourceButton == button9) {
            shoe9.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane9);
        }
    }

    public void gotologout(ActionEvent event) throws IOException {
       
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Logout.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
    }


    // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {
       
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    
    }

}