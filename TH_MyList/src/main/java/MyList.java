public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        Object[] objects = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
            objects[i] = elements[i];
        }
        elements = objects;
    }

    public void add(E element) {
        if (elements.length == size) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index:" + i + ", size:" + i);
        }
        return (E) elements[i];
    }
}
