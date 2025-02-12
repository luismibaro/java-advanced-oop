import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO 8: declare and initialize the object of ClassroomCourse class
        Subject subjectMath = new Subject("Math", 10);
        ClassroomCourse classroomCourse = new ClassroomCourse(subjectMath, "Carlos Perez",10,
                "FOC", "First session");
        //TODO 9: declare and initialize the Learner object
        Learner learner = new Learner("Pedrito Barrera", classroomCourse);
        //TODO 18: display course list and accept user choice
        Scanner in = new Scanner(System.in);
        System.out.println("Course availables");
        System.out.println("1 = Java");
        System.out.println("2 = Java Online");
        System.out.println("3 = JavaScript");
        System.out.println("4 = JavaScript Online");
        //TODO 19: initialize object of chose course
        Course course1 = null;
        //TODO 20: accept user input for learner's name
        System.out.println("Enter name: ");
        String name = in.nextLine();
        //TODO 21: call assignmentScore() method and quizScore() methods
        System.out.println("Enter assigment marks");
        int mark1 = in.nextInt();
        System.out.println("Enter quiz marks");
        int mark2 = in.nextInt();
        learner.assignmentScore(mark1);
        learner.quizScore(mark2);

        //TODO 22: call assignmentScore() method. Display the result as described
        System.out.println("Grade score: "+learner.calculateGrade());
    }
}