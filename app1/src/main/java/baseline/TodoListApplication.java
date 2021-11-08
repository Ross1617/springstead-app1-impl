package baseline;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Ross Springstead
 */

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TodoListApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Parent root =
                FXMLLoader.load(getClass().getResource("TodoList.fxml"));

        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Todo List"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage

    }

    public static void main(String[] args) {

        launch(args);


    }

}
