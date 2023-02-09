package Notebook;

import java.util.List;

public class Sorted {

    public List<Notebook> sortedRAM(List<Notebook> notebookList) {
        notebookList.sort((o1, o2) -> o2.ram() - o1.ram());
        return notebookList;
    }

    public List<Notebook> sortedPrice(List<Notebook> notebookList) {
        notebookList.sort((o1, o2) -> (int) o2.price() - (int) o1.price());
        return notebookList;
    }

    public List<Notebook> megaSorted(List<Notebook> notebookList) {
        notebookList.sort((o1, o2) -> {
            int tmp = o2.ram() - o1.ram();
            if (tmp != 0)
                return o2.ram() - o1.ram();
            else
                return (int) o2.price() - (int) o1.price();
        });
        return notebookList;
    }
}
