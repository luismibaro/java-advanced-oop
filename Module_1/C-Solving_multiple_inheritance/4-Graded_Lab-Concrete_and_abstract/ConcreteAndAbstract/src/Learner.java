//TODO 12: make Learner class implement Assessment interface
public class Learner implements Assessments {
    //TODO 1: declare instance variables
    String name;
    double grade;
    Course course;
    double gradeScore;

    Learner(String name, Course course) {
        //TODO 2: complete constructor
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }


    //TODO 13: override assignmentScore() method
    @Override
    public double assignmentScore() {
        return 1;
    }

    //TODO 14: override quizScore() method
    @Override
    public double quizScore() {
        return 1;
    }


    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;
        //TODO 17: calculate gradeScore as per the instructions above
        System.out.println(this.name+" online");
        return this.gradeScore;
    }

}