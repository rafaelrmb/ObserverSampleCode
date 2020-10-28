package ca.bcit.comp2526.lab05;

/**
 * A observer can observe a Subject.
 *
 * @author Rafael Barbieri
 * @version 2020-10-28
 */
public interface Observer {

    /**
     * Updates an Observer.
     *
     * @param subject a Subject.
     */
    void update(Subject subject);
}
