package ca.bcit.comp2526.lab05;

import java.util.ArrayList;

/**
 * COMP2526 class.
 *
 * @author Rafael Barbieri
 * @version 2020-10-28
 */
public class COMP2526 implements Subject {
    private ArrayList<Observer> students;
    private int                 numberOfEnrolledStudents;
    private String              instructorName;
    private String              midTermDate;
    private String              finalsDate;

    /**
     * COMP2526 constructor.
     *
     * @param instructorName a String
     * @param midTermDate    a String
     * @param finalsDate     a String
     */
    public COMP2526(final String instructorName, final String midTermDate, final String finalsDate) {
        students = new ArrayList<>();
        numberOfEnrolledStudents = 0;
        this.midTermDate = midTermDate;
        this.finalsDate = finalsDate;
        this.instructorName = instructorName;
    }

    public int getNumberOfEnrolledStudents() {
        return numberOfEnrolledStudents;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getMidTermDate() {
        return midTermDate;
    }

    public String getFinalsDate() {
        return finalsDate;
    }

    public void setInstructorName(final String instructorName) {
        this.instructorName = instructorName;
        notifyObservers();
    }

    public void setMidTermDate(final String newMidTermDate) {
        this.midTermDate = newMidTermDate;
        notifyObservers();
    }

    public void setFinalsDate(final String newFinalsDate) {
        this.finalsDate = newFinalsDate;
        notifyObservers();
    }

    /**
     * Adds a student to the list and increments the number of students enrolled in the course.
     *
     * @param student an Observer.
     */
    @Override
    public void attach(final Observer student) {
        students.add(student);
        numberOfEnrolledStudents++;
    }

    /**
     * Removes a student to the list and decrements the number of students enrolled in the course.
     *
     * @param student an Observer.
     */
    @Override
    public void detach(final Observer student) {
        students.remove(student);
        numberOfEnrolledStudents--;
    }

    /**
     * Notifies all the students when changes are made to the course.
     */
    @Override
    public void notifyObservers() {
        for (Observer student : students) {
            student.update(this);
        }
    }

}
