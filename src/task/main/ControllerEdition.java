package task.main;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerEdition {
    @FXML

    public TextField text3;

    @FXML
    public TextArea area3;

    /*@FXML

    public void button(ActionEvent actionEvent) throws SQLException {
        System.out.println("Dado inserido no banco de dados!");
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO TAREFA (NOME, DESCRICAO) VALUES(\'"
                + nometarefa.getText() + "\', \'"
                + txtarea.getText() + "\')");
        stmt.execute();
        /*PreparedStatement delete = conn.prepareStatement("delete from tarefa");
        delete.execute();*/
       /* Node b = (Node) actionEvent.getSource();
        b.getScene().getWindow().hide();
        System.out.println(actionEvent.getSource());
    }*/
    /*@FXML
    public void apaga3 (){
        TaskDAO dao = new TaskDAO();
        Task task = dao.getById(id);
        text3.setText(task.getName());
    }*/
}
