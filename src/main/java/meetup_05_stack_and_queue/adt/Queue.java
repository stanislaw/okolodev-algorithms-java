package meetup_05_stack_and_queue.adt;

/**
 * <p>
 * First In First Out
 * </p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/Queue_(abstract_data_type)">Queue (abstract data type)</a>
 */
public interface Queue<E> {

    void enqueue(E element);

    E dequeue();

    E peek();

    boolean isEmpty();

    int size();

}
