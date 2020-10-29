package ca.bcit.comp2526.lab05;

/**
 * Step 4 - Define a concrete Student class that will implement the Observer interface.
 * For this example, there is only one course available for the students.
 * Student class.
 *
 * @author Rafael Barbieri
 * @version 2020-10-28
 */
public class Student implements Observer {
    private String   studentName;
    private String   studentNumber;
    private COMP2526 bcitCourse;
    private String   vacationDay;

    /**
     * Constructs a Student Object.
     *
     * @param studentName   a String
     * @param studentNumber a String
     * @param bcitCourse    a course
     */
    public Student(final String studentName,
                   final String studentNumber,
                   final COMP2526 bcitCourse) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.bcitCourse = bcitCourse;
        this.vacationDay = bcitCourse.getFinalsDate();
    }

    /**
     * Updates the student about the changes made to the Subject.
     *
     * @param course a Subject
     */
    @Override
    public void update(final Subject course) {
        //vacationDay = bcitCourse.getFinalsDate();
        System.out.println("Notifying student " + studentName
                                   + " that the following changes to the "
                                   + bcitCourse.getCourseName() + " course were made.");
        System.out.println("Instructor's name: " + this.bcitCourse.getInstructorName());
        System.out.println("Mid term date: " + this.bcitCourse.getMidTermDate());
        System.out.println("Finals date: " + this.bcitCourse.getFinalsDate() + "\n");
        //System.out.println("Your vacation starts: " + vacationDay);
    }

    public void test() {

    }
}
