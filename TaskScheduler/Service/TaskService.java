package Service;

import java.util.Deque;
import java.util.List;

import ObjectClasses.Priority;
import ObjectClasses.Task;
import Repository.TaskRepository;

public class TaskService implements TaskServiceInterface {
    private TaskRepository taskRepository;

    public TaskService() {
        this.taskRepository = new TaskRepository();
    }

    @Override
    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.deleteTask(task);
    }

    @Override
    public Task getTaskForId(int id) {
        return taskRepository.getTask(id);
    }

    @Override
    public List<Task> getOnePriorityTasks(Priority priority) {
        return taskRepository.getOnePriorityTasks(priority);
    }

    @Override
    public Deque<Task> getAllTasks() {
        System.out.println();
        return taskRepository.getTaskDeque();
    }

    @Override
    public void markAsDone(int id) {
        taskRepository.taskIsDone(id);
    }
    public TaskRepository getTaskRepository() {
        return taskRepository;
    }
    
}
