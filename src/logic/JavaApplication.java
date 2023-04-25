/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaApplication extends Application {
    private static Scene scene;


    public static void main(String[] args) {
        launch();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JavaApplication.class.getResource(fxml));
        return fxmlLoader.load();
    }


    public static void changeView(String url, int width, int height) throws IOException {
        Stage currentStage = (Stage) scene.getWindow();
        configureStage(currentStage, width, height);
        JavaApplication.setRoot(url);
    }

    private static void configureStage(Stage stage, int width, int height) {
        stage.setWidth(width);
        stage.setHeight(height);
        stage.centerOnScreen();
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("../views/Login.fxml"), 700, 400);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
}