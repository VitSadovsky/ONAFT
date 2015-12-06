package MyPackage;
import java.util.*;
import java.lang.*;


public class Group implements Comparable {

    private int groupId;
    private String speciality;
    private ArrayList <Student> studentList;

    public Group(int groupId, String speciality) {
        this.groupId = groupId;
        this.speciality = speciality;
        studentList = new ArrayList<Student>();
        }

    public void addStudent(Student s){
        studentList.add(s);
        }

    public void deleteStudent(String A){
        for (Student s : studentList)
            if(A.equals(s.getSurname()))
            {studentList.remove(s);
            }
    }

    public void contains (String A) {
        int count = 0;
        for (Student s : studentList) {
            if (A.equals(s.getSurname()))
            {count++;
            }
        }
        if(count>=1){System.out.println("Группа содержит " + A);}
        else {System.out.println("Группа не содержит " + A);}



    }

    public void clearGroup (){
        studentList.clear();
    }

    public void combainGroup (Group g){
        studentList.addAll(g.getStudentList());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void sortGroup(){
        studentList.sort(Comparator.<Student>naturalOrder());
    }




    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}