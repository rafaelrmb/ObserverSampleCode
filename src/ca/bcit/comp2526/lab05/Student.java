package ca.bcit.comp2526.lab05;

/**
 * Student class.
 *
 * @author Rafael Barbieri
 * @version 2020-10-28
 */
public class Student implements Observer {
    private String   studentName;
    private String   studentNumber;
    private COMP2526 bcitCourse;

    /**
     * Student constructor.
     *
     * @param studentName   a String
     * @param studentNumber a String
     * @param bcitCourse    a course
     */
    public Student(final String studentName, final String studentNumber,
                   final COMP2526 bcitCourse) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.bcitCourse = bcitCourse;
    }

    /**
     * Updates the student about the changes made to the course.
     *
     * @param course an Object
     */
    @Override
    public void update(final Subject course) {
        System.out.println("Notifying student " + studentName
                                   + " that the following changes to the "
                                   + bcitCourse.getClass().getSimpleName() + " course were made.");
        System.out.println("Finals date: " + this.bcitCourse.getFinalsDate());
        System.out.println("Mid term date: " + this.bcitCourse.getMidTermDate());
        System.out.println("Instructor's name: " + this.bcitCourse.getInstructorName() + "\n");
    }
}
