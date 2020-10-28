/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author gscia
 */
public class NewClass extends Application{
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn1 = new Button("NFL");
        Button btn2 = new Button("NBA");
        Button btn3 = new Button("MLB");
        Button btn4 = new Button("MLS");
        Label appName = new Label("PocketScores");
        appName.setFont(Font.font("Segoe UI", FontPosture.REGULAR, 18));
        Label instruction = new Label("Choose one of the following...");
        instruction.setFont(Font.font("Segoe UI", FontPosture.REGULAR, 12));
        Label logoP = new Label("P");
        logoP.setFont(Font.font("Segoe UI", FontWeight.BOLD, 40));
        Label logoS = new Label("S");
        logoS.setFont(Font.font("Segoe UI", FontWeight.BOLD, 40));
        Pane root = new Pane();
        logoP.setMaxSize(40, 40);
        logoP.setMinSize(40, 40);
        logoP.relocate(270, 80);
        logoP.setAlignment(Pos.CENTER);
        root.getChildren().add(logoP);
        logoS.setMaxSize(40, 40);
        logoS.setMinSize(40, 40);
        logoS.relocate(290, 100);
        logoS.setAlignment(Pos.CENTER);
        root.getChildren().add(logoS);
        instruction.setMaxSize(160, 25);
        instruction.setMinSize(160, 25);
        instruction.relocate(220, 200);
        instruction.setAlignment(Pos.CENTER);
        root.getChildren().add(instruction);
        appName.setMaxSize(120, 25);
        appName.setMinSize(120, 25);
        appName.relocate(240, 160);
        appName.setAlignment(Pos.CENTER);
        root.getChildren().add(appName);
        btn1.setMaxSize(160, 25);
        btn1.setMinSize(160, 25);
        btn1.relocate(220, 235);
        root.getChildren().add(btn1);
        btn2.setMaxSize(160, 25);
        btn2.setMinSize(160, 25);
        btn2.relocate(220, 265);
        root.getChildren().add(btn2);
        btn3.setMaxSize(160, 25);
        btn3.setMinSize(160, 25);
        btn3.relocate(220, 295);
        root.getChildren().add(btn3);
        btn4.setMaxSize(160, 25);
        btn4.setMinSize(160, 25);
        btn4.relocate(220, 325);
        root.getChildren().add(btn4);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(NewClass.class.getResource("PocketScoresCSS.css").toExternalForm());
        primaryStage.setTitle("Pocket Scores");
        primaryStage.show();
        Button back = new Button("Back");
        EventHandler<ActionEvent> backEvent = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                root.getChildren().add(logoP);
                root.getChildren().add(logoS);
                root.getChildren().add(instruction);
                root.getChildren().add(appName);
                root.getChildren().add(btn1);
                root.getChildren().add(btn2);
                root.getChildren().add(btn3);
                root.getChildren().add(btn4);
                primaryStage.setScene(scene);
                primaryStage.setTitle("Pocket Scores");
                root.getChildren().remove(back);
            }
        };
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                root.getChildren().remove(logoP);
                root.getChildren().remove(logoS);
                root.getChildren().remove(instruction);
                root.getChildren().remove(appName);
                root.getChildren().remove(btn1);
                root.getChildren().remove(btn2);
                root.getChildren().remove(btn3);
                root.getChildren().remove(btn4);
                back.setMaxSize(100, 25);
                back.setMinSize(100, 25);
                back.relocate(0, 0);
                root.getChildren().add(back);
            } 
        }; 
        btn1.setOnAction(event); 
        btn2.setOnAction(event); 
        btn3.setOnAction(event); 
        btn4.setOnAction(event);
        back.setOnAction(backEvent);
  
        
    }
    
    
    
}










