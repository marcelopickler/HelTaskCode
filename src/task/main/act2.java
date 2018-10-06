package task.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

    public class act2 extends Application {


        @Override
        public void start(Stage primaryStage) throws Exception {
            // Carrega a Tela
            Parent root2 = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/javafxListaTarefas.fxml"));
            // Atribui o t�tulo da Janela
            primaryStage.setTitle("Hello World");
            // Atribui o tamanho da Janela
            primaryStage.setScene(new Scene(root2));
            //        // Exibe a Janela
            primaryStage.show();
        }


        public static void main(String[] args) {
            // M�todo para inicializar a tela
            launch(args);
        }
    }

