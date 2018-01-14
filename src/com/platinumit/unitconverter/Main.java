package com.platinumit.unitconverter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.util.Stack;

public class Main extends Application {


    Stage window;
    Scene scene1, scene2;

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

        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);

        scene1 = new Scene(layout1, 200, 200);

        //Button 2
        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 200, 200);

        window.setScene(scene1);
        window.setTitle("Switching scenes");
        window.show();
    }



}
