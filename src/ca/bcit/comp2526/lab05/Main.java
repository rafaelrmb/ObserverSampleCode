package ca.bcit.comp2526.lab05;

/**
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
        Student  raf    = new Student("Rafael", "A13246", course);
        Student  sophia = new Student("Sophia", "A13246", course);
        Student  john   = new Student("John", "A13246", course);

        course.attach(raf);
        course.attach(sophia);
        course.attach(john);
        course.setFinalsDate("2020-12-02");
        course.detach(raf);
        course.setInstructorName("Jason");
    }
}
