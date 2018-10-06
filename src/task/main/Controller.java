package task.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import task.dao.ConnectionFactory;
import task.uteis.ControleTela;
import task.uteis.Maps;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Controller {

    @FXML

    public TextField nometarefa;

    @FXML
    public TextArea txtarea;

    @FXML

    public void button(ActionEvent actionEvent) throws SQLException {
        System.out.println("Dado inserido no banco de dados!");
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO TAREFA (NOME, DESCRICAO) VALUES(\'"
                + nometarefa.getText() + "\', \'"
                + txtarea.getText() + "\')");
        /*Tentar usar update nestes campos*/
        stmt.execute();
        /*PreparedStatement delete = conn.prepareStatement("delete from tarefa");
        delete.execute();*/
        Node b = (Node) actionEvent.getSource();
        JOptionPane.showMessageDialog(null, "Informacoes incluída com sucesso");
        ControleTela.getInstance().showScreen(Maps.menu_fxml);
        System.out.println(actionEvent.getSource());
    }
    @FXML
    public void apaga (){
        nometarefa.setText("");
        txtarea.setText("");
    }
    public void back(){
        ControleTela.getInstance().showScreen(Maps.menu_fxml);
    }
}