package Repository;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import ObjectClasses.Priority;
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

    public List<Task> getOnePriorityTasks(Priority priority){
        List<Task> result = new ArrayList<>();
        for (Task task : taskDeque) {
            if (task.getPriority() == priority) {
                result.add(task);
            }
        }
        return result;
    }
}
