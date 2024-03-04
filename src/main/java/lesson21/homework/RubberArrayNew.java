package lesson21.homework;

public class RubberArrayNew {

    private final int INIT_DATA_SIZE = 3;
    private final float EXTEND_INDEX = 1.5f;

    private int[] data;

    public int length;

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

    private void extendArrayIfNeed() {
        if (length == data.length) {
            int[] newData = new int[(int) (data.length * EXTEND_INDEX)];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    public void add(int value) {
        extendArrayIfNeed();
        data[length] = value;
        length++;
    }

    //Task 4
    public void add(int value, int idx) {
        extendArrayIfNeed();
        for (int i = length; i > idx; i--) {
            data[i] = data[i - 1];
        }
        data[idx] = value;
        length++;
    }

    public void remove(int idx) {
        for (int i = idx; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    //Task2
    public boolean contains(int value) {
        return indexOf(value) !=-1;
    }

    //Task3
    public int indexOf(int value) {
        for (int i = 0; i < length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //Task1
    @Override
    public String toString() {
        StringBuilder strSb = new StringBuilder();
        strSb.append("[");
        for (int i = 0; i < length; i++) {
            strSb.append(data[i]);
            if (i < length - 1) {
                strSb.append(",");
            }
        }
        strSb.append("]");
        return strSb.toString();
    }
}