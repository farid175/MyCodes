import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String fullName;

    public Person(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    List<Task> taskList = new ArrayList<>();

    public void addTask(){

    }
}
