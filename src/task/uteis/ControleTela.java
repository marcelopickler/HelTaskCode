package task.uteis;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControleTela {
    private static final ControleTela controletela = new ControleTela();
    private static Stage stage = new Stage();

    public static ControleTela getInstance(){
        return ControleTela.controletela;
    }

    public void showScreen(String path){
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(path));
            stage.setScene(new Scene(root));
            stage.show();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }


    public Stage getStage(){
        return stage;
    }


}
