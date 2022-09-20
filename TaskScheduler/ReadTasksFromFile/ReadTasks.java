package ReadTasksFromFile;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import ObjectClasses.Task;
import Service.TaskService;
import Service.TaskServiceInterface;

public class ReadTasks {
    TaskServiceInterface taskService; 

    public ReadTasks(TaskServiceInterface taskService) {
        taskService = taskService;
    }
    
    public List<Task> listTasks(String path){
        try {
            File file = new File(path);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
            System.out.println(line);
            // считываем остальные строки в цикле
            line = reader.readLine();
            }
            } catch (FileNotFoundException e) {
            e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
            }

        return List.of();
    }
}
