package ObjectClasses;

//import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
    private int id;
    private Priority priority;
    private String discription;
    private String ownerName;
    private LocalDate deadLine;
    private LocalDateTime dateAdded;
    private boolean completionMark = false;


    public Task(int id, Priority priority, String ownerName, LocalDate deadLine, String discription) {
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
        
        return String.format(" %d - %s, %s, %s %s, ", id, discription,dateAdded, deadLine, completionMark + "\n");
    }
    public boolean getCompletionMark(){
        return completionMark;
    }
    public void setCompletionMark(boolean completionMark) {
        this.completionMark = completionMark;
    }
}
