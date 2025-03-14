import java.util.Scanner;

class Student {
    protected double marks;

    public void inputMarks(double marks) {
        this.marks = marks;
    }

    public void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}

class UndergraduateStudent extends Student {
    public void calculateGrade() {
        if (marks >= 85) {
            System.out.println("Undergraduate Grade: A");
        } else if (marks >= 70) {
            System.out.println("Undergraduate Grade: B");
        } else if (marks >= 40) {
            System.out.println("Undergraduate Grade: C");
        } else {
            System.out.println("Undergraduate Grade: F");
        }
    }
}

class GraduateStudent extends Student {
    private double thesisMarks;

    public void inputMarks(double marks, double thesisMarks) {
        super.inputMarks(marks);
        this.thesisMarks = thesisMarks;
    }

    public void calculateGrade() {
        double totalMarks = marks + thesisMarks;

        if (totalMarks >= 180) {
            System.out.println("Graduate Grade: A");
        } else if (totalMarks >= 150) {
            System.out.println("Graduate Grade: B");
        } else if (totalMarks >= 120) {
            System.out.println("Graduate Grade: C");
        } else {
            System.out.println("Graduate Grade: F");
        }
    }
}

public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for the student: ");
        double marks = input.nextDouble();

        Student student = new Student();
        student.inputMarks(marks);
        System.out.print("Student grade: ");
        student.calculateGrade();

        System.out.println("\n--- Undergraduate Student ---");
        System.out.print("Enter marks for the undergraduate student: ");
        double undergradMarks = input.nextDouble();
        UndergraduateStudent undergrad = new UndergraduateStudent();
        undergrad.inputMarks(undergradMarks); // Corrected variable name
        System.out.print("Undergraduate grade: ");
        undergrad.calculateGrade();

        System.out.println("\n--- Graduate Student ---");
        System.out.print("Enter marks for the graduate student: ");
        double gradMarks = input.nextDouble();
        System.out.print("Enter thesis marks for the graduate student: ");
        double thesisMarks = input.nextDouble();
        GraduateStudent grad = new GraduateStudent();
        grad.inputMarks(gradMarks, thesisMarks);
        System.out.print("Graduate grade: ");
        grad.calculateGrade();

        input.close();
    }
}
