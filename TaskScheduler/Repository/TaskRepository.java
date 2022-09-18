package Repository;

import java.util.ArrayDeque;
import java.util.Deque;
import ObjectClasses.Task;

public class TaskRepository {
    Deque<Task> taskDeque;

    public TaskRepository() {
        taskDeque = new ArrayDeque<>();
    }

    public Deque<Task> getTaskDeque() {
        return taskDeque;
    }

    public void addTask(Task task) {
        taskDeque.addLast(task);
    }

    public void deleteTask(Task task) {
        taskDeque.remove(task);

    }

    public Task getTask(int id) {
        for (Task task : taskDeque) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

}
