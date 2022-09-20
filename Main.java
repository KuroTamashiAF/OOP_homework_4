import java.time.LocalDate;
import ObjectClasses.*;
import ReadTasksFromFile.ReadTasks;
import Service.*;






public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(1, Priority.URGENT, "Alex",LocalDate.now().plusDays(5), 
        "Отправить ТК на согласование Заполярного филиала");
        Task task2 = new Task(2, Priority.HIGH, "Yana", LocalDate.now().plusDays(5),
        "позвонить бородину старшему");
        Task task3 = new Task(3, Priority.URGENT, "Vasya", LocalDate.now().plusDays(5), 
        "позвонить бородину младшему");
        Task task4 = new Task(4, Priority.MEDIUM, "Mary", LocalDate.now().plusDays(5), 
        "Написать письмо на понедельник");        
        TaskServiceInterface taskservice = new TaskService();
        taskservice.addTask(task1);
        taskservice.addTask(task2);
        taskservice.addTask(task3);
        taskservice.addTask(task4);
        
        ReadTasks raedTasks = new ReadTasks(taskservice);
        raedTasks.listTasks("Test.txt");
        System.out.println(taskservice.getAllTasks());
    
    }
}
