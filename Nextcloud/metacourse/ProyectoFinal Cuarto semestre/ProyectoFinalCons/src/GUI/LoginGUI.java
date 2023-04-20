/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("Iniciar sesión - Mi aplicación");

        // Crear el contenedor principal de la interfaz gráfica
        BorderPane root = new BorderPane();

        // Crear la sección del logotipo
        VBox logoBox = new VBox();
        logoBox.setAlignment(Pos.CENTER);
        Image logoImage = new Image(getClass().getResourceAsStream("logo.png"));
        ImageView logoImageView = new ImageView(logoImage);
        logoImageView.setFitWidth(200);
        logoImageView.setFitHeight(200);
        logoBox.getChildren().add(logoImageView);

        // Crear la sección del formulario de inicio de sesión
        GridPane loginGrid = new GridPane();
        loginGrid.setAlignment(Pos.CENTER);
        loginGrid.setHgap(10);
        loginGrid.setVgap(10);
        loginGrid.setPadding(new Insets(25, 25, 25, 25));
        Text loginTitle = new Text("Iniciar sesión en Mi aplicación");
        loginTitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        loginTitle.setFill(Color.web("#555555"));
        loginGrid.add(loginTitle, 0, 0, 2, 1);
        Label userName = new Label("Nombre de usuario");
        userName.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
        userName.setTextFill(Color.web("#555555"));
        loginGrid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        userTextField.setStyle("-fx-border-color: #cccccc; -fx-border-radius: 5;");
        userTextField.setPrefHeight(40);
        loginGrid.add(userTextField, 1, 1);
        Label password = new Label("Contraseña");
        password.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
        password.setTextFill(Color.web("#555555"));
        loginGrid.add(password, 0, 2);
        PasswordField passwordField = new PasswordField();
        passwordField.setStyle("-fx-border-color: #cccccc; -fx-border-radius: 5;");
        passwordField.setPrefHeight(40);
        loginGrid.add(passwordField, 1, 2);
        Button loginButton = new Button("Iniciar sesión");
        loginButton.setStyle("-fx-background-color: #1abc9c; -fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold; -fx-border-radius: 5;");
        loginButton.setPrefHeight(40);
        loginButton.setPrefWidth(150);
        HBox hbLoginButton = new HBox(10);
        hbLoginButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbLoginButton.getChildren().add(loginButton);
        loginGrid.add(hbLoginButton, 1, 4);

        // Crear la sección del enlace para recuperar la contraseña
        HBox forgotPasswordBox = new HBox();
        forgotPasswordBox.setAlignment(Pos.CENTER_RIGHT);
     //   forgotPasswordBox.setPadding
    }

    public static void main(String[] args) {
        launch(args);
    }
}
