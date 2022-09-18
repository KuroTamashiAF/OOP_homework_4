package Service;
import ObjectClasses.Task;

public interface TaskServiceInterface {


    void addTask(Task task);
    void deleteTask(Task task);
    Task getTaskForId(int id);

    
}
