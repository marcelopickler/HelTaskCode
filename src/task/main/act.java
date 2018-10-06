package task.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class act extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega a Tela
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/javafxCriaTarefa.fxml"));
        // Atribui o t�tulo da Janela
        primaryStage.setTitle("Hello World");
        // Atribui o tamanho da Janela
        primaryStage.setScene(new Scene(root));
        //        // Exibe a Janela
        primaryStage.show();
    }



}