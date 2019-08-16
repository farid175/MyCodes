import java.time.LocalDate;

public class Task {
    private int id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate dueDate;
    private LocalDate endDate;
    private int status;
    private Project project;
    private  Person person;

    public Task(int id, String name, String description, LocalDate startDate,LocalDate dueDate, LocalDate endDate, int status, Project project,Person person) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.endDate = endDate;
        this.status = status;
        this.project = project;
        this.person = person;
    }

    public Task() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
