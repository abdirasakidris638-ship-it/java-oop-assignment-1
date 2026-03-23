public class Main {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Abdirasak", 101);
        Student student2 = new Student("Amina", 102);

        // Printing student details via encapsulated getters and toString
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);

        // Update properties through setters (encapsulation in action)
        student1.setName("Abdi");
        student1.setStudentId(201);
        System.out.println("Updated Student 1: " + student1);
    }
}