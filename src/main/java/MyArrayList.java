public class MyArrayList<E> implements MyList<E>{

    private Object[] values;

    private int size = 0;

    private final static int INITCAPACITY = 10;

    private int arraySize = INITCAPACITY;

    public MyArrayList(int size) {
        this.size = size;
        values = new Object[this.size];
    }

    public MyArrayList() {
        values = new Object[INITCAPACITY];

    }






    public int indexOf(Object obj) {
        for (int k = 0; k < size; k++) {
            if (values[k].equals(obj)) {
                return k;
            }
        }
        return -1;
    }











    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Object obj) {
        resize();
        values[size] = obj;
        size++;

    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);


        return false;
    }

    @Override
    public void clear() {
        for (int k = 0; k < size; k++) {
            values[k] = null;
        }
        size = 0;
    }

    @Override
    public Object get(int index) {
        if (index < size && index >= 0) {
            return values[index];
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object set(Object obj, int index) {
        return null;
    }

    private void resize() {
        if (size >= arraySize) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }

        if (size >= INITCAPACITY && size < arraySize / 4) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }


    }
}
