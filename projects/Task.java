import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    public Task(int id, String name, String description, LocalDate startDate, LocalDate dueDate, LocalDate endDate, int status, Project project, Person person) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long betweenDate(){
        return ChronoUnit.DAYS.between(startDate,dueDate);
    }


}
