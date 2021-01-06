import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();
        a.add(6);
        a.add(1);
        a.add(1);
        a.add(1);
        
        System.out.println(a.get(0));
        System.out.println(a.size());
        System.out.println(a.get(6));
    }
}


class MyArrayList<T> {
    private int size = 0;
    private static final int CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[CAPACITY];
    }

    public void add(T t) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = t;
    }


    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public T get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + this.size() );
        }
        return (T) elements[i];
    }
    public int size(){
        return size;
    }
    public boolean contains(T data){
        for (int i = 0; i < size; i++){
            if(elements[i] == data) {
                return true;
            }
        }
        return false;
    }
}