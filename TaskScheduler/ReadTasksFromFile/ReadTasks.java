package ReadTasksFromFile;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import java.time.LocalDate;
import java.util.Arrays;
import ObjectClasses.Priority;
import ObjectClasses.Task;
import Service.TaskServiceInterface;

public class ReadTasks {
    TaskServiceInterface taskService; 

    public ReadTasks(TaskServiceInterface taskServic) {
        taskService = taskServic;
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
                List <String> stringParams = Arrays.stream(line.split(",")).toList();
                Task task = new Task(stringToInt(stringParams.get(0)), parseStringToPriority(stringParams.get(1)),
                 stringParams.get(2),parseStringToDate(stringParams.get(3)),stringParams.get(4));

                taskService.addTask(task);
            //System.out.println(line);
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
    private Priority parseStringToPriority(String priorityString){
        return Priority.valueOf(priorityString);
    }
    private LocalDate parseStringToDate(String dateString){
     
        return LocalDate.parse(dateString);
    }
    private int stringToInt( String data){
        return Integer.parseInt(data);
    }
}
