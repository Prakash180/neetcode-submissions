class DynamicArray {

    private int[] arr;
    private int size;

    public DynamicArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == arr.length) {
            resize();
        }

        arr[size] = n;
        size++;
    }

    public int popback() {
        if (size == 0) {
            throw new RuntimeException("Array is empty");
        }

        size--;
        return arr[size];
    }

    private void resize() {
        int[] arr2 = new int[arr.length * 2];

        for (int i = 0; i < size; i++) {
            arr2[i] = arr[i];
        }

        arr = arr2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}