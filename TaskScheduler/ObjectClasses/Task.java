package TaskScheduler.ObjectClasses;

import java.sql.Date;

public class Task {
    private int id;
    private Priority priority;
    // private String discription;
    private String ownerName;
    private Date deadLine;

    public Task(int id, Priority priority, String ownerName, Date deadLine) {
        this.id = id;
        this.priority = priority;
        this.ownerName = ownerName;
        this.deadLine = deadLine;

    }

}
