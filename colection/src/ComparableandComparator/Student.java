package ComparableandComparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String Address;

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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        Address = address;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                '}';
    }
}
