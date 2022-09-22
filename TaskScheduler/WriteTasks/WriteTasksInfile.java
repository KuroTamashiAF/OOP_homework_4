package WriteTasks;

import java.io.FileWriter;
import java.io.IOException;

import ObjectClasses.Task;
import Service.TaskServiceInterface;

public class WriteTasksInfile {
    TaskServiceInterface taskServiceInterface;

    public WriteTasksInfile(TaskServiceInterface taskServic) {
        this.taskServiceInterface = taskServic;
    }

    public void writeDataInFile() {
        try (FileWriter writer = new FileWriter("notes3.csv", false)) {
            for (Task task : taskServiceInterface.getAllTasks()) {
                String text = task.toString();
                writer.write(text);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
