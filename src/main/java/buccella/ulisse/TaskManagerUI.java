package buccella.ulisse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class TaskManagerUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            // Obtener la URL del archivo FXML
            URL fxmlUrl = getClass().getResource("/Interfaz.fxml");

            // Comprobación de si la URL es nula (archivo no encontrado)
            if (fxmlUrl == null) {
                System.out.println("No se pudo encontrar el archivo FXML. Verifica la ruta.");
                return; // Salir si no se encuentra el archivo
            } else {
                System.out.println("Archivo FXML encontrado en: " + fxmlUrl);
            }

            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(fxmlUrl);
            Parent root = loader.load();

            // Crear la escena
            Scene scene = new Scene(root);
            stage.setTitle("Task Manager");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar el error en caso de que no se pueda cargar el FXML
            System.out.println("Error al cargar el archivo FXML.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
