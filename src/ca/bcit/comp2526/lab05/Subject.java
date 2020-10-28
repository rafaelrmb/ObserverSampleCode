package ca.bcit.comp2526.lab05;

/**
 * A subject can be observed.
 *
 * @author Rafael Barbieri
 * @version 2020-10-28
 */
public interface Subject {
    /**
     * Adds an observer to the list.
     *
     * @param observer an Observer
     */
    void attach(Observer observer);

    /**
     * Removes an observer from the list.
     *
     * @param observer an Observer
     */
    void detach(Observer observer);

    /**
     * Notifies observers when changes are made.
     */
    void notifyObservers();

}
