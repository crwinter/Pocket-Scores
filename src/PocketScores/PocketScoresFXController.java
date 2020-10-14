/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PocketScores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author brandonbanner
 */
public class PocketScoresFXController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public Button NFL;

    @FXML
    private void goToNFL(ActionEvent event){
        try{
            Stage stage = (Stage) NFL.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("NFLListView.fxml"));
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }    
    
}
