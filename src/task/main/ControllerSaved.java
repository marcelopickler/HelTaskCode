package task.main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import task.dao.TaskDAO;
import task.uteis.ControleTela;
import task.uteis.Maps;
import task.uteis.TaskAdapter;
import task.uteis.TaskView;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerSaved implements Initializable {

    //@FXML
    //public TableView tabela;
    @FXML
    public TableView tabela;
    @FXML
    public Button deleta;
    @FXML
    public Button edita;
    @FXML
    public Button sair;
    @FXML
    public Button cria;


    public void initialize(URL location, ResourceBundle res) {
        TaskDAO dao = new TaskDAO();
        final ObservableList<TaskView> listaTarefas = FXCollections
                .observableList(
                        TaskAdapter.adaptarTodosParaView(dao.getAll())

                );

        TableColumn colunaNome = (TableColumn) tabela.getColumns().get(0);
        TableColumn colunaDesc = (TableColumn) tabela.getColumns().get(1);
        colunaNome.setCellValueFactory(new PropertyValueFactory<TaskView, String>("nometarefa"));
        colunaDesc.setCellValueFactory(new PropertyValueFactory<TaskView, String>("conteudotarefa"));

        tabela.setItems(listaTarefas);
    }

    @FXML
    public void menuTask() {
        ControleTela.getInstance().showScreen(Maps.menu_fxml);
    }

    @FXML
    public void includeTask() {
        ControleTela.getInstance().showScreen(Maps.criatarefa_fxml);
    }

    @FXML
    public void deletar() throws IOException {

        TaskView view = (TaskView) tabela.getSelectionModel().getSelectedItem();
        TaskDAO dao = new TaskDAO();
        dao.deleteTarefa(view.getId());
        reload();
        JOptionPane.showMessageDialog(null, "Informacoes deletadas com sucesso");
    }

    private void reload() {
        ControleTela.getInstance().showScreen(Maps.menu_fxml);
    }

}