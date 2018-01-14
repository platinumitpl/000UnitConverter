package com.platinumit.unitconverter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {


    Button button;


    public static void main(String[] args) {

//        System.out.println("Hello world");
//
//        String toSymbol = "kg";
//        String fromSymbol = "lb";
//        double fromValue = 123;
//
//        double convertedValue = UnitConverter.convert(fromValue, fromSymbol, toSymbol);
//
//        System.out.println(convertedValue);

        //go to Application and set up my JavaFX app
        launch(args);

    }


    //Application will start "start" method
    @Override
    public void start(Stage primaryStage) throws Exception {

        //set title of primary stage
        primaryStage.setTitle("Title of the window");
        //create new button
        button = new Button();
        //set button label
        button.setText("Convert");
        button.setOnAction(e -> System.out.println(UnitConverter.convert(10, "kg", "lb")));

        //create new pane
        StackPane layout = new StackPane();
        //add button to the pane
        layout.getChildren().add(button);
        //create new scene (thing inside of a stage)
        Scene scene = new Scene(layout, 300, 250);
        //set scene in a stage
        primaryStage.setScene(scene);
        //show window (stage)
        primaryStage.show();


    }



}
