package ca.bcit.comp2526.lab05;

/**
 * Step 5 - Instantiate a COMP2526 object and a few Student objects,
 * use the attach() method to enroll the students to the course.
 * Make changes to any attribute to the course object.
 * (This should result to all enrolled students being notified about the change.)
 * Main class.
 *
 * @author Rafael Barbieri
 * @version 2020-10-28
 */
public class Main {
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(final String[] args) {
        COMP2526 course = new COMP2526("Chris", "2020-10-29", "2020-12-01");
        Student  rafael = new Student("Rafael", "A13246", course);
        Student  sophia = new Student("Sophia", "A13246", course);
        Student  john   = new Student("John", "A13246", course);

        course.attach(rafael);
        course.attach(sophia);
        course.attach(john);
        course.setFinalsDate("2020-12-08");
        course.detach(rafael);
        course.setMidTermDate("There will be no midterm, prepare for finals.");
    }
}
