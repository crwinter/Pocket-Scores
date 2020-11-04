package PocketScores;

import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;

public class NFLListViewController implements Initializable {

    @FXML
    private VBox fullListItem;
    
    @FXML
    private JFXHamburger navButton;
    
    @FXML
    private JFXDrawer menuDrawer;
    
    @FXML
    private JFXComboBox yearBox;
    
    @FXML
    private JFXComboBox weekBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            VBox slidePane = FXMLLoader.load(getClass().getResource("menuSlidePane.fxml"));
            
            menuDrawer.setSidePane(slidePane);
            
        } catch (IOException ex) {
            Logger.getLogger(NFLListViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Nav button transition animation
        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(navButton);
        
        // Nav button click event
        navButton.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->{
            
            transition.setRate(transition.getRate()*-1);
            transition.play();
            
            if(menuDrawer.isOpened())
                menuDrawer.close(); //To close the navigation drawer
            else
                menuDrawer.open(); // To iniitally open navigation drawer
        });
        
        // Year comboBox items
        yearBox.getItems().add("2020");
        yearBox.getItems().add("2019");
        yearBox.getItems().add("2018");
        yearBox.getItems().add("2017");
        yearBox.getItems().add("2016");
        yearBox.getItems().add("2015");
        
        
        // Week comboBox items
        weekBox.getItems().add("Week 1");
        weekBox.getItems().add("Week 2");
        weekBox.getItems().add("Week 3");
        weekBox.getItems().add("Week 4");
        weekBox.getItems().add("Week 5");
        weekBox.getItems().add("Week 6");
        weekBox.getItems().add("Week 7");
        weekBox.getItems().add("Week 8");
        weekBox.getItems().add("Week 9");
        weekBox.getItems().add("Week 10");
        weekBox.getItems().add("Week 11");
        weekBox.getItems().add("Week 12");
        weekBox.getItems().add("Week 13");
        weekBox.getItems().add("Week 14");
        weekBox.getItems().add("Week 15");
        weekBox.getItems().add("Week 16");
        weekBox.getItems().add("Week 17");
        
    }    
    
}
