/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moklet_bank;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Anggi
 */
public class BankController implements Initializable {
    
    String pin ="";
    String PIN = "1234";
    int kesempatan=3;
    int tmp;

    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button2;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button9;
    @FXML
    private JFXButton buttonc;
    @FXML
    private JFXButton button0;
    @FXML
    private JFXButton ok;
    @FXML
    private JFXPasswordField pin1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan1(ActionEvent event) {
        pin+="1";
        pin1.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
          pin+="2";
        pin1.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
          pin+="3";
        pin1.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
          pin+="4";
        pin1.setText(pin);
    }

    @FXML
    private void tekan5(ActionEvent event) {
          pin+="5";
        pin1.setText(pin);
    }

    @FXML
    private void tekan6(ActionEvent event) {
          pin+="6";
        pin1.setText(pin);
    }

    @FXML
    private void tekan7(ActionEvent event) {
          pin+="7";
        pin1.setText(pin);
    }

    @FXML
    private void tekan8(ActionEvent event) {
          pin+="8";
        pin1.setText(pin);
    }

    @FXML
    private void tekan9(ActionEvent event) {
          pin+="9";
        pin1.setText(pin);
    }

    @FXML
    private void tekanc(ActionEvent event) {
        pin1.setText("");
         
    }

    @FXML
    private void tekan0(ActionEvent event) {
          pin+="0";
        pin1.setText(pin);
    }

    @FXML
    private void ok(ActionEvent event) {
        if(pin1.getText().equals("1234")){
        
         try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLbank2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("TomboLuwe");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
         
        }else{
            kesempatan -=1;
            JOptionPane.showMessageDialog(null, "pin salah \tersisa "+kesempatan+"kesempatan lagi!");
            pin1.setText("");
            pin="";
            if(kesempatan == 0){
                System.exit(0);
            }
        }
         
    }

    @FXML
    private void pin(ActionEvent event) {
    }
    
}
