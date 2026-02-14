package OOPsCodingTest;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 101, 'A');
        s1.printDetails();

    }
}

class Student{
    String name;
    int rollNo;
    char section;

    Student(String name, int rollNo, char section)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    void printDetails()
    {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }
}
