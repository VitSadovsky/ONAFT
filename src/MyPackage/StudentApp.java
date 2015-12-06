package MyPackage;
import java.util.*;
import java.lang.*;


public class StudentApp {
    public static void main(String[] args) {


        Institute onaft = new Institute("onaft");

        Group group171 = new Group(171, "management");
        Group group172 = new Group(172, "accounting");
        onaft.addGroup(group171);
        onaft.addGroup(group172);

        Student Ivanov = new Student("Ivan", "Ivanov", 5, 5);
        Student Rebrov = new Student("Vitalik", "Rebrov", 1, 5);
        Student Petrov = new Student("Vova", "Petrov", 5, 2);
        Student Sidorov = new Student("Viltor", "Sidorov", 3, 3);
        Student Golubev = new Student("Vova", "Golubev", 4, 4);
        Student Serebrov = new Student("Vitalik", "Serebrov", 2, 4);
        Student Silikonov = new Student("Vitya", "Silikonov", 5, 3);
        Student Lolikov = new Student("Olya", "Lolikov", 5, 1);

        group171.addStudent(Ivanov);
        group171.addStudent(Rebrov);
        group171.addStudent(Petrov);
        group171.addStudent(Sidorov);
        group172.addStudent(Golubev);
        group172.addStudent(Serebrov);
        group172.addStudent(Silikonov);
        group172.addStudent(Lolikov);

        for(Student st : group171.getStudentList()) {
            System.out.println(st.getSurname() + " " + st.getName() + " Оценка по математике: " + st.getMath()) ;
        }
        group171.contains("Rebrov");
    }
}

