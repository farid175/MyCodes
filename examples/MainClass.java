import java.time.LocalDate;
import java.time.Month;

public class MainClass {
    public static void main(String[] args) {
        Project project1 = new Project(1,"Proyekt1");

        Project project2 = new Project(2,"Proyekt2");


        Person person1 = new Person(1,"Cavid Bagirov");
        Person person2 = new Person(2,"Emil Karimov");
        Person person3 = new Person(3,"Alim Qasimov");
        Person person4 = new Person(4,"Nail Memmedov");


        Task task1 = new Task(1,"task1","task1 iwledi",LocalDate.of(2020, Month.JANUARY,22),LocalDate.of(2020,Month.JANUARY,22).plusDays(5),null,0,project1,person1);
        Task task2 = new Task(2,"task2","task2 iwledi",LocalDate.of(2021,Month.JANUARY,23),LocalDate.of(2021,Month.JANUARY,23).plusDays(3),null,0,project1,person1);
        Task task3 = new Task(3,"task3","task3 iwledi",LocalDate.now(),LocalDate.now().plusDays(6),null,1,project1,person2);
        Task task4 = new Task(4,"task4","task4 iwledi",LocalDate.now(),LocalDate.now().plusDays(3),null,3,project2,person2);
        Task task5 = new Task(5,"task5","task5 iwledi",LocalDate.now(),LocalDate.now().plusDays(4),null,3,project2,person3);
        Task task6 = new Task(6,"task6","task6 iwledi",LocalDate.now(),LocalDate.now().plusDays(3),null,3,project2,person3);
        Task task7 = new Task(7,"task7","task7 iwledi",LocalDate.now(),LocalDate.now().plusDays(2),LocalDate.now(),2,project2,person4);
        Task task8 = new Task(8,"task8","task8 iwledi",LocalDate.now(),LocalDate.now().plusDays(1),LocalDate.now(),2,project2,person4);
        Task task9 = new Task(9,"task9","task9 iwledi",LocalDate.now(),LocalDate.now().plusDays(7),LocalDate.now(),2,null,null);
        Task task10 = new Task(10,"task10","task10 iwledi",LocalDate.now(),LocalDate.now().plusDays(4),LocalDate.now(),2,null,null);
        

    }
}
