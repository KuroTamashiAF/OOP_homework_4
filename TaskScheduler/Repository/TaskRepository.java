package Repository;

import java.util.ArrayDeque;
import java.util.Deque;
import ObjectClasses.Task;

public class TaskRepository {
    Deque <Task> taskDeque;

    public TaskRepository() {
        taskDeque = new ArrayDeque<>();
    }

    public void addTask (Task task){
        taskDeque.addLast(task);
    }
    public Deque<Task> getTaskDeque() {
        return taskDeque;
    }
public void deleteTask(Task task){
    taskDeque.remove(task);
    
} 

}
