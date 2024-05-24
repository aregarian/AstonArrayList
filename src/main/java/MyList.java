public interface MyList<E> {

    boolean isEmpty();

    void add(Object e);

    boolean remove(Object o);

    void clear();

    Object get(int index);

    void add(int index, Object element);

    Object set(Object obj, int index);




}
