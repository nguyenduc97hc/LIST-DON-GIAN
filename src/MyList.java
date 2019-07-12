
import java.util.Arrays;


public class MyList<E> {
     int size = 0;
     private static final int DEFAULT_CAPACITY =10;
     private Object elements[];
     public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
     }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] =  e;
    }
    public E get(int i) {
            if (i < 0 || i >= this.size) {
                System.out.println("Vi tri lay phan tu khong hop le");
            }
        return (E) this.elements[i];
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
