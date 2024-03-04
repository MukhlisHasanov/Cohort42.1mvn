package lesson21.homework;

public class RubberArrayNew {

    private final int INIT_DATA_SIZE = 3;
    private final float EXTEND_INDEX = 1.5f;
    private int[] data;
    private int length;

    public RubberArrayNew() {
            data = new int[INIT_DATA_SIZE];
            length = 0;
    }

    public int size() {
        return length;
    }

    public int get(int idx) {
        return data[idx];
    }

    public void add(int value) {
        if (length == data.length) {
            // create new array, length *= 1.5
            int[] newData = new int[(int) (data.length * EXTEND_INDEX)];
            // move items to new array
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            // change link to new array
            data = newData;
        }
        // add value
        data[length] = value;
        length++;
    }

    public void add(int value, int idx) {
        // TODO implement
        // 0, 1, 2, 3, 4, 5
        // 4, 6, 5, 2, 6, 1
    }

    public void remove(int idx) {
        // 0, 1, 2, 3
        // move elements right to left from idx
        for (int i = idx; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int indexOf(int value) {
        for (int i = 0; i < length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        // TODO use StringBuilder instead of toString
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            sb.append(data[i]);
            if (i < length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
