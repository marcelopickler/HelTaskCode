package task.uteis;

import task.entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter {
    public static TaskView adaptarParaView(Task t){
        return new TaskView(t.getId(),t.getName(),t.getDesc());
    }
    public static Task adaptarViewParaTarefa(TaskView tv){
        Task t = new Task();
        t.setId(tv.getId());
        t.setName(tv.getNometarefa());
        t.setDesc(tv.getConteudotarefa());
        return t;
    }
    public static List<TaskView> adaptarTodosParaView(List<Task> tarefasList){
        List<TaskView> lista = new ArrayList<TaskView>();
        for (Task t : tarefasList){
            lista.add(new  TaskView(t.getId(),t.getName(),t.getDesc()));
        }
        return lista;
    }
}
