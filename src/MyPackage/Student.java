package MyPackage;
import java.util.Arrays;
import java.lang.*;

public class Student {

    private String name;
    private String surname;
    private int math;
    private int philosophy;

    public Student(String name, String surname, int math, int philosophy) {
        this.name = name;
        this.surname = surname;
        this.math = math;
        this.philosophy = philosophy;

    }

    public int getPhilosophy() {
        return philosophy;
    }

    public void setPhilosophy(int philosophy) {
        this.philosophy = philosophy;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}


