package org.thh;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("JavaFX App");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}