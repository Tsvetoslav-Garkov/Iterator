public interface Iterator<E> {
    boolean hasNext();

    E getNext();

    E currentItem();

    void reset();
}
