package ObjectClasses;

import java.sql.Date;
import java.time.LocalDateTime;

public class Task {
    private int id;
    private Priority priority;
    private String discription;
    private String ownerName;
    private LocalDateTime deadLine;
    private LocalDateTime dateAdded;


    public Task(int id, Priority priority, String ownerName, LocalDateTime deadLine, String discription) {
        this.id = id;
        this.priority = priority;
        this.ownerName = ownerName;
        this.deadLine = deadLine;
        this.dateAdded = LocalDateTime.now();
        this.discription = discription;


    }

    public int getId() {
        return id;
    }
    public Priority getPriority() {
        return priority;
    }
    @Override
    public String toString() {
        
        return discription;
    }
}
