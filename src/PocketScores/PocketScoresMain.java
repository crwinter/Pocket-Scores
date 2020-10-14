
package PocketScores;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


/**
 *
 * @author brandonbanner
 */
public class PocketScoresMain extends Application {
    
    public static void main(String[] args){
        launch(args);
    }

    //@Override
    @FXML
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("PocketScoresFXML.fxml"));
        stage.setScene(new Scene(root, 450, 450));
        stage.show();
    }
    
}


