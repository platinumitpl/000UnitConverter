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
        window.setTitle("Switching scenes");


        Button button = new Button("New window");
        button.setOnAction(e -> {

            boolean result = ConfirmBox.display("Question", "Are you sure that you want to do this?");
            System.out.println(result);
        });


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.show();
    }


}
