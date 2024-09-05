class Student {
    String name;
    int studentId;
    double gpa;

    Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public Boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    public void displayInfo() {
        System.out.println("Name of student: " + name);
        System.out.println("ID of student: " + studentId);
        System.out.println("GPA of student: " + gpa);
        
        if (isHonorStudent()) {
            System.out.println(name + " is an honor student.");
        } else {
            System.out.println(name + " is not an honor student.");
        }
    }
}

public class StudentDetails { 
    public static void main(String[] args) {
        
        Student student1 = new Student("Soorya", 234, 4.0);        
        student1.displayInfo();
        
        Student student2 = new Student("Soorya2", 235, 3);        
        student2.displayInfo();
    }
}
