import java.sql.Date;

/**
 * Task
 */
public class Tasks {

    private String disishion;       
    private int id;
    private int prioruty;                // 4- самый важный приоритет, 3 - важный приоритет, 2- средний приоритет, 1-низкий приоритет, 0- не важный приоритет
    private Date deadline;
    private static int idCount=0;


    public Tasks(String dis, int priority) {
        this.disishion =dis;
        this.id = idCount++;
        this.prioruty = priority;
    }

public String getDisishion() {
    return disishion;
}
public int getId() {
    return id;
}
public int getPrioruty() {
    return prioruty;
}
public Date getDeadline() {
    return deadline;
}
public void setDeadline(Date deadline) {
    this.deadline = deadline;
}
    
}