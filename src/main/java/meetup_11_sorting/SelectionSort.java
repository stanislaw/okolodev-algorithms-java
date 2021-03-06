package meetup_11_sorting;

public class SelectionSort<E extends Comparable<E>> implements Sort<E> {

    @Override
    public E[] sort(E[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min = i;

            for (int j = i + 1; j < elements.length; j++) {
                if (less(elements[j], elements[min])) {
                    min = j;
                }
            }

            swap(elements, i, min);
        }

        return elements;
    }

    private boolean less(E a, E b) {
        return a.compareTo(b) < 0;
    }

    private void swap(E[] elements, int i, int j) {
        E tmp = elements[i];
        elements[i] = elements[j];
        elements[j] = tmp;
    }

}
