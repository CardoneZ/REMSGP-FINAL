/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javafx.scene.control.Button;

public class DateTimePickerGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Selector de fecha y hora");

        // Crear el contenedor principal de la interfaz gráfica
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        // Crear un selector de fecha
        DatePicker datePicker = new DatePicker();
        datePicker.setValue(LocalDate.now());

        // Crear un selector de hora
        Spinner<Integer> hourSpinner = new Spinner<>();
        hourSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23));
        hourSpinner.getValueFactory().setValue(LocalDateTime.now().getHour());

        Spinner<Integer> minuteSpinner = new Spinner<>();
        minuteSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59));
        minuteSpinner.getValueFactory().setValue(LocalDateTime.now().getMinute());

        // Agregar los selectores de fecha y hora al contenedor secundario
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.addRow(0, new Label("Fecha:"), datePicker);
        gridPane.addRow(1, new Label("Hora:"), hourSpinner, new Label("minutos:"), minuteSpinner);

        // Agregar el contenedor secundario al contenedor principal
        root.setCenter(gridPane);

        // Crear un botón para imprimir la fecha y hora seleccionadas
        Button printButton = new Button("Imprimir fecha y hora seleccionadas");
        printButton.setOnAction(event -> {
            LocalDate selectedDate = datePicker.getValue();
            LocalTime selectedTime = LocalTime.of(hourSpinner.getValue(), minuteSpinner.getValue());
            LocalDateTime selectedDateTime = LocalDateTime.of(selectedDate, selectedTime);
            System.out.println("Fecha y hora seleccionadas: " + selectedDateTime);
        });

        // Agregar el botón al contenedor secundario
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(10);
        hbox.getChildren().add(printButton);

        // Agregar el contenedor secundario al contenedor principal
        root.setBottom(hbox);

        Scene scene = new Scene(root, 400, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
