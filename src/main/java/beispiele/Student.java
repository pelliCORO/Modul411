package beispiele;

public class Student<T> implements Comparable<T>{
    public int age;
    public String name;
    public String vorname;

    public Student(int age, String name, String vorname) {
        this.age = age;
        this.name = name;
        this.vorname = vorname;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getVorname() {

        return vorname;
    }

    public void setVorname(String vorname) {

        this.vorname = vorname;
    }

    public String toString(){

        return this.vorname+" "+this.name+","+age;
    }

    @Override
    public int compareTo(T o) {
    Student s = (Student) o;

    if(this.age > s.getAge())
        return -1;
    else if(this.age<s.getAge())
        return 1;
    else return 0;
    }
}
