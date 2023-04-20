/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalendarGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calendario");

        // Crear el contenedor de la interfaz gráfica
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        // Crear un controlador de fecha
        DatePicker datePicker = new DatePicker();

        // Agregar el controlador de fecha al contenedor principal
        root.setCenter(datePicker);

        // Crear un botón para imprimir la fecha seleccionada
        Button printButton = new Button("Imprimir fecha seleccionada");
        printButton.setOnAction(event -> {
            System.out.println("Fecha seleccionada: " + datePicker.getValue());
        });

        // Agregar el botón al contenedor secundario
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(10);
        hbox.getChildren().add(printButton);

        // Agregar el contenedor secundario al contenedor principal
        root.setBottom(hbox);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
