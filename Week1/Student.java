package Week1;

public class Student {
    // What if we want to model something more complex? Like students!
    // We could create an array of Student Objects
    // Students have a state and a list of behaviors
    // What are the possible states? Name, studentID….
    // What are some things a Student can do? SayName?
    private String studentID;
    private String name;

    // default constructor
    public Student() {
    }

    // constructor
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    // write getters and setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println(getName());
    }

}
