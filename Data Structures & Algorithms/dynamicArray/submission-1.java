class DynamicArray {
    private int[] backingArray;
    private int size;

    public DynamicArray(int capacity) {
        this.backingArray = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return backingArray[i];
    }

    public void set(int i, int n) {
        backingArray[i] = n;

    }

    public void pushback(int n) {
        if (size == backingArray.length) {
            this.resize();
        }

        backingArray[size] = n;
        size++;
    }

    public int popback() {
        int val = backingArray[size - 1];
        backingArray[size - 1] = 0;
        size--;
        return val;
    }

    public void resize() {
        int[] dummy = new int[backingArray.length * 2];

        for (int i = 0; i < backingArray.length; i++) {
            dummy[i] = backingArray[i];
        }

        backingArray = dummy;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return backingArray.length;
    }
}