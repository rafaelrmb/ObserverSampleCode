package ca.bcit.comp2526.lab05;

import java.util.ArrayList;

/**
 * Step 3 - Define a concrete class that will implement the Subject interface
 * and contain a List of Observers.
 * A BCIT COMP2526 class is an example of a Subject that contains many students.
 * Any modifications made to its attributes will trigger a notification to every
 * student that is enrolled.
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
    public COMP2526(final String instructorName,
                    final String midTermDate,
                    final String finalsDate) {
        students = new ArrayList<>();
        numberOfEnrolledStudents = 0;
        this.midTermDate = midTermDate;
        this.finalsDate = finalsDate;
        this.instructorName = instructorName;
    }

    /**
     * Returns the number of students enrolled in this course.
     *
     * @return the number of students enrolled in this course, an int.
     */
    public int getNumberOfEnrolledStudents() {
        return numberOfEnrolledStudents;
    }

    /**
     * Returns the instructor's name for that course.
     *
     * @return the instructor's name for that course, a String.
     */
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * Returns the date when the mid term will happen.
     *
     * @return the midterm's date, a String.
     */
    public String getMidTermDate() {
        return midTermDate;
    }

    /**
     * Returns the date when the final exam will happen.
     *
     * @return the finals' date, a String.
     */
    public String getFinalsDate() {
        return finalsDate;
    }

    /**
     * Returns the course name.
     *
     * @return the course name, a String.
     */
    public String getCourseName() {
        return this.getClass().getSimpleName();
    }

    /**
     * Sets the instructor's name and notify all Observers about the change.
     *
     * @param instructorName a String.
     */
    public void setInstructorName(final String instructorName) {
        this.instructorName = instructorName;
        notifyObservers();
    }

    /**
     * Sets the midterm's date and notify all Observers about the change.
     *
     * @param newMidTermDate a String.
     */
    public void setMidTermDate(final String newMidTermDate) {
        this.midTermDate = newMidTermDate;
        notifyObservers();
    }

    /**
     * Sets the finals' date and notify all Observers about the change.
     *
     * @param newFinalsDate a String.
     */
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
        this.students.add(student); //adds an Observer (Student) to the list.
        numberOfEnrolledStudents++;
    }

    /**
     * Removes a student to the list and decrements the number of students enrolled in the course.
     *
     * @param student an Observer.
     */
    @Override
    public void detach(final Observer student) {
        this.students.remove(student); //removes an Observer (Student) from the list.
        numberOfEnrolledStudents--;
    }

    /**
     * Notifies all the students when changes are made to the course.
     */
    @Override
    public void notifyObservers() {
        for (Observer student : students) {
            student.update(this); //notifies all Students that are enrolled to that course.
        }
    }

}
