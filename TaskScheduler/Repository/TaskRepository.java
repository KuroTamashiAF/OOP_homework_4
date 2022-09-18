package Repository;

import java.util.ArrayDeque;
import java.util.Deque;

import TaskScheduler.ObjectClasses.Task;

public class TaskRepository {
    Deque <Task> taskDeque;

    public TaskRepository() {
        taskDeque = new ArrayDeque<>();
    }
}
