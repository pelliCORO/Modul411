package beispiele;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class StundentListTest {



    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<Student>();

        Student student1 =new Student<>(18,"Pellicoro","Michael");
        students.add(student1);

        students.add(new Student(29,"Peter","Hans"));
        students.add(new Student(23,"Müller","Heinrich"));
        students.add(new Student(15,"Nachname","Marco"));
        students.add(new Student(40,"Berger","Sep"));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);




    }





}
