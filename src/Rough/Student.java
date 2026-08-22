package Rough;



public class Student{
    private String name;
    private int age;
    //getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //toString method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }
    //hashCode method
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }
    //compareTo method
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    //compareTo method
    public int compareTo(Student o, String name) {
        return this.name.compareTo(o.name);
    }
    //compareTo method
    public int compareTo(Student o, int age) {
        return this.age - o.age;
    }
    //compareTo method



}
