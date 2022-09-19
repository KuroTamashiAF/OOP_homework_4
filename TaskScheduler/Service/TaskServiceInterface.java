package Service;
import java.util.List;

import ObjectClasses.Priority;
import ObjectClasses.Task;

public interface TaskServiceInterface {


    void addTask(Task task);
    void deleteTask(Task task);
    Task getTaskForId(int id);
    List<Task> getOnePriorityTasks(Priority priority);

    
}
