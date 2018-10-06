package task.uteis;

import javafx.beans.property.SimpleStringProperty;

public class TaskView {
    public long id;
    private SimpleStringProperty nometarefa;
    private SimpleStringProperty conteudotarefa;

    public TaskView(long l, String Name, String conteudotarefa){
        this.nometarefa = new SimpleStringProperty(Name);
        this.conteudotarefa = new SimpleStringProperty(conteudotarefa);
        this.id = l;
    }
    public String getNometarefa(){
        return nometarefa.get();
    }
    public String getConteudotarefa(){
        return conteudotarefa.get();

    }
    public long getId(){
        return id;
    }
}
