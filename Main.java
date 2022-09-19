import java.time.LocalDateTime;

import ObjectClasses.*;
import Service.*;





public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(1, Priority.URGENT, "Alex",LocalDateTime.now().plusDays(3), 
        "Отправить ТК на согласование Заполярного филиала");
        Task task2 = new Task(2, Priority.HIGH, "Yana", LocalDateTime.now().plusDays(4),
        "позвонить бородину старшему");
        Task task3 = new Task(3, Priority.URGENT, "Vasya", LocalDateTime.now().plusDays(5), 
        "позвонить бородину младшему");
        Task task4 = new Task(4, Priority.MEDIUM, "Mary", LocalDateTime.now().plusDays(4), 
        "Написать пьмо на понедельник");

        
        TaskServiceInterface taskservice = new TaskService();
        taskservice.addTask(task1);
        taskservice.addTask(task2);
        taskservice.addTask(task3);
        taskservice.addTask(task4);
        //System.out.println(taskservice.getOnePriorityTasks(Priority.URGENT));
        //System.out.println(taskservice.getTaskForId(3));
        System.out.println(taskservice.getAllTasks());
        
        

        

    
        

    


        
    }
}
