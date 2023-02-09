package IteratorForList;

import java.util.*;

public class IteratorArr implements Iterator<Integer> {

    private final ArrayList<Integer> intArr;

    private int index = 0;

    public IteratorArr(int[] source) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int j : source) {
            tmp.add(j + new Random().nextInt(50));
        }
        tmp.sort(Comparator.comparing(Integer::shortValue).reversed());
        this.intArr = tmp;
    }

    @Override
    public boolean hasNext() {
        return index <= intArr.size() - 1;

    }

    @Override
    public Integer next() {
        int nextInt = intArr.get(index);
        index++;
        return nextInt;
    }
}
