public class Student {
    // Private fields (Encapsulation)
    private String name;
    private int studentId;

    // Constructor
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(int studentId) {
        if (studentId <= 0) {
            throw new IllegalArgumentException("studentId must be positive");
        }
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', studentId=" + studentId + "}";
    }
}