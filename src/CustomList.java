import java.util.List;

public interface CustomList<E> {
    Iterator<E> iterator();

    //Not iterator related
    Boolean add(E element);
    E remove(int index);
}
