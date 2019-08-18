import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    static List<Task> taskList = new ArrayList<>();
    static List<Task> taskPersonList = new ArrayList<>();
    public static void main(String[] args) {


        Project project1 = new Project(1,"Proyekt1");

        Project project2 = new Project(2,"Proyekt2");


        Person person1 = new Person(1,"Cavid Bagirov");
        Person person2 = new Person(2,"Aydin Qurbanov");
        Person person3 = new Person(3,"Alim Qasimov");
        Person person4 = new Person(4,"Nail Memmedov");


        Task task1 = new Task(1,"task1","task1 iwledi", LocalDate.of(2020, Month.JANUARY,22),LocalDate.of(2020,Month.JANUARY,22).plusDays(5),null,0,project1,person1);
        Task task2 = new Task(2,"task2","task2 iwledi",LocalDate.of(2021, Month.JANUARY,23),LocalDate.of(2021,Month.JANUARY,23).plusDays(3),null,0,project1,person1);
        Task task3 = new Task(3,"task3","task3 iwledi",LocalDate.now(),LocalDate.now().plusDays(6),null,1,project1,person2);
        Task task4 = new Task(4,"task4","task4 iwledi",LocalDate.now(),LocalDate.now().plusDays(3),null,3,project2,person2);
        Task task5 = new Task(5,"task5","task5 iwledi",LocalDate.now(),LocalDate.now().plusDays(4),null,3,project2,person3);
        Task task6 = new Task(6,"task6","task6 iwledi",LocalDate.now(),LocalDate.now().plusDays(3),null,3,project2,person3);
        Task task7 = new Task(7,"task7","task7 iwledi",LocalDate.now(),LocalDate.now().plusDays(2),LocalDate.now(),2,project2,person4);
        Task task8 = new Task(8,"task8","task8 iwledi",LocalDate.now(),LocalDate.now().plusDays(1),LocalDate.now(),2,project2,person4);
        Task task9 = new Task(9,"task9","task9 iwledi",LocalDate.now(),LocalDate.now().plusDays(5),LocalDate.now().plusDays(8),2,null,null);
        Task task10 = new Task(10,"task10","task10 iwledi",LocalDate.now(),LocalDate.now().plusDays(4),LocalDate.now(),2,null,null);

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskList.add(task5);
        taskList.add(task6);
        taskList.add(task7);
        taskList.add(task8);
        taskList.add(task9);
        taskList.add(task10);


        System.out.println(longestProject());
        System.out.println(longTask());
        System.out.println(delayTask());
        System.out.println(endedTask());
        System.out.println(hardworkingPerson());

    }

    public static String longTask(){
        long max = taskList.get(0).betweenDate();
        String name  = taskList.get(0).getName();
        for (Task t: taskList){
            if(t.betweenDate() > max){
                max =t.betweenDate();
                name = t.getName();
            }
        }
        return "The Longest Task:" +name + " days" + max;
    }

    public static String delayTask(){
        int count = 0;
        boolean comp;
        String name = null;
        for(Task t: taskList){
            if(t.getEndDate() != null) {
                if (comp = t.getEndDate().isAfter(t.getDueDate())) {
                    count++;
                    name = t.getName();
                }
            }
        }
        return  "The Delayed Tasks:" + count;
    }

    public static String endedTask(){
        int count = 0;
        boolean comp;
        String name = null;
        for(Task t: taskList){
            if(t.getEndDate() != null) {
                if (comp = t.getEndDate().isBefore(t.getDueDate())) {
                    count++;
                    name = t.getName();
                }
            }
        }
        return  "The Ended Tasks:" + count;
    }

    public static String longestProject(){
        String name = null;
        long max = taskList.get(0).betweenDate();
        for (Task t: taskList){
            if(t.getProject() != null){
                if(t.betweenDate() > max){
                    max = t.betweenDate();
                    name = t.getProject().getName();
                }
            }
        }
        return "The longest Project:" + name;
    }

    public static String hardworkingPerson(){
        long max = taskList.get(0).betweenDate();
        String name = null;
        for(Task t: taskList){
            if(t.getPerson() != null){
                if(t.betweenDate() > max){
                    max = t.betweenDate();
                    name = t.getPerson().getFullName();
                }
            }
        }
        return "The Hardworking Person :" +name;
    }
}
