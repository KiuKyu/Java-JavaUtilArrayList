import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    // Constructor k tham số khởi tạo với capacity 10
    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    // Constructor có tham số int capacity
    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    // Method tăng kích cỡ mảng + sao chép mảng sang 1 mảng mới
    public void ensureCapacity() {
        int newCapacity = this.elements.length * 2;
        this.elements = Arrays.copyOf(this.elements, newCapacity);
    }

    // Method add chay
    public void add(E element) {
        if (this.size == this.elements.length) {
            ensureCapacity();
        }
        this.elements[this.size++] = element;
    }
    // Method add dựa vào index
    public void add(int index, E element) {
        if (this.size == elements.length) {
            ensureCapacity();
        }

        if (index < 0 || index > this.size) {
            throw new ArrayIndexOutOfBoundsException("index: " + index + ", size: " + this.size);
        }
        for (int i = index + 1; i <= this.size; i++) {
            this.elements[i] = this.elements[i - 1];
        }
        elements[index] = element;
        this.size++;
    }

    // Method remove dựa vào index
    public void remove(int index) {
        if (index < 0 || index > this.size) {
            throw new ArrayIndexOutOfBoundsException("index: " + index + ", size: " + this.size);
        }
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    // Method trả về kích cỡ mảng
    public int size() {
        return this.size;
    }

    // Method in ra mảng
    public void toArray() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.elements[i]);
        }
    }

    // Method kiểm tra tồn tại trong array
    public boolean contains(E element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    // Method tìm ra index
    public int indexOf(E element) {
        int elementIndex = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == element) {
                elementIndex = i;
            }
        }
        return elementIndex;
    }

    // Method get element trong Array
    public E get(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size" + this.size);
            // Nếu vị trí k hợp lệ thì ném ra lỗi
        }
        return (E) this.elements[index];
    }
}
