package task.dao;

import task.entity.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {

    Connection connection2 = ConnectionFactory.getConnection();

    public Task getById(Integer id) {
        String sql = "SELECT * FROM TAREFA WHERE IDTAREFA=?";
        try {
            PreparedStatement stmt = connection2.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                Task task = new Task();
                task.setId(rs.getInt("IDTAREFA"));
                task.setName(rs.getString("NOME"));
                task.setDesc(rs.getString("DESCRICAO"));
                return task;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Task> getAll() {
        String sql = "SELECT * FROM TAREFA";
        List<Task> tasks = new ArrayList<Task>();
        try {
            PreparedStatement stmt = connection2.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Task task = new Task();
                task.setId(rs.getInt("IDTAREFA"));
                task.setName(rs.getString("NOME"));
                task.setDesc(rs.getString("DESCRICAO"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }
    public void deleteTarefa(long l) {
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement p = conn.prepareStatement("delete from tarefa where idtarefa=?");
            p.setLong(1, l);
            p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
