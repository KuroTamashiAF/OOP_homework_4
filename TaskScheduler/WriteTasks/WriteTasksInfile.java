package WriteTasks;

import Service.TaskServiceInterface;

public class WriteTasksInfile {
    TaskServiceInterface taskServiceInterface;

    public WriteTasksInfile(TaskServiceInterface taskServic) {
        this.taskServiceInterface = taskServic;
    }
}