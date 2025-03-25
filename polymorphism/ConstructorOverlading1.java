class OnlineCourse {
    String courseName;
    String instructor;
    double price;
    int durationWeeks;

    OnlineCourse() {
        courseName = "Introduction Course";
        instructor = "Generic Instructor";
        price = 0.0;
        durationWeeks = 4;
    }

    OnlineCourse(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.price = 50.0;
        this.durationWeeks = 6;
    }

    OnlineCourse(String courseName, String instructor, double price) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.price = price;
        this.durationWeeks = 8;
    }

    OnlineCourse(String courseName, String instructor, double price, int durationWeeks) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.price = price;
        this.durationWeeks = durationWeeks;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Instructor: " + instructor + ", Price: $" + price + ", Duration: " + durationWeeks + " weeks");
    }
}

public class ConstructorOverlading1 {
    public static void main(String[] args) {
        OnlineCourse course1 = new OnlineCourse();
        OnlineCourse course2 = new OnlineCourse("Java Basics", "Alice Smith");
        OnlineCourse course3 = new OnlineCourse("Web Development", "Bob Johnson", 100.0);
        OnlineCourse course4 = new OnlineCourse("Data Science", "Carol Williams", 150.0, 12);

        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
        course4.displayCourseDetails();
    }
}