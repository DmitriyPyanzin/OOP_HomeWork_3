package IteratorForList;

public class MainArr {

    public static void main(String[] args) {

        // 2. Реализовать итератор для массива

        int[] source = {1, 2, 3, 4, 5, 6, 7};
        IteratorArr iteratorArr = new IteratorArr(source);

        System.out.print("[ ");
        while (iteratorArr.hasNext()) {
            // FIXME: 20.01.2023 Должно работать!
            System.out.print(iteratorArr.next() + ", ");
        }
        System.out.print("]");

        // FIXME: 09.02.2023 Работает!!!!!!
    }
}

