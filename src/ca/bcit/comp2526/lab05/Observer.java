package ca.bcit.comp2526.lab05;

/**
 * Step 2 - Define an Observer interface that will
 * later be implemented by the objects that need to be notified whenever
 * a Subject change its state.
 * An Observer observes a Subject.
 *
 * @author Rafael Barbieri
 * @version 2020-10-28
 */
public interface Observer {

    /**
     * Updates all the Observers that are attached to a Specific Subject.
     *
     * @param subject The subject
     *                passed to the Update operation lets the observer determine which subject
     *                changed when it observes more than one.
     */
    void update(Subject subject); //this allows an Observer to observe multiple Subjects.
}
