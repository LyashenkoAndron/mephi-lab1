import lab1.DAO.PeopleDAO;
import lab1.model.Lesson;
import lab1.model.Person;
import lab1.model.Teacher;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Elena", 25, "916", Lesson.CS, 1);
        System.out.printf(teacher.getFullName());
        PeopleDAO peopleDAO = new PeopleDAO();

    }
}