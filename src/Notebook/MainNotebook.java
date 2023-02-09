package Notebook;

import java.util.ArrayList;

public class MainNotebook {

    // 1. Создать список объектов типа Notebook
    // Отсортировать его тремя способами:
    // 1.1 по ОЗУ (ram)
    // 1.2 по цене (price)
    // 1.3 сначала по ram, потом по price (если ram не равны, сортируем по ним; если равны, то по цене)

    public static void main(String[] args) {

        ArrayList <Notebook> arrayList = new ArrayList<>();
        Sorted sorted = new Sorted();

        Notebook lenovo = new Notebook("Lenovo", 16384, 56999.99);
        Notebook samsung = new Notebook("Samsung", 8192, 66999.99);
        Notebook asus = new Notebook("Asus", 10240, 50999.99);
        Notebook msi = new Notebook("MSI", 16384, 59999.99);
        Notebook honor = new Notebook("Honor", 8192, 45999.99);

        arrayList.add(lenovo);
        arrayList.add(samsung);
        arrayList.add(asus);
        arrayList.add(msi);
        arrayList.add(honor);

        System.out.println("Оригинальный список:");
        for (Notebook notebook : arrayList) {
            System.out.println(notebook.title() + " RAM: " + notebook.ram() + " цена: " + notebook.price());
        }
        System.out.println();

        System.out.println("Сортировка по RAM:");
        sorted.sortedRAM(arrayList);
        for (Notebook notebook : arrayList) {
            System.out.println(notebook.title() + " RAM: " + notebook.ram() + " цена: " + notebook.price());
        }
        System.out.println();

        System.out.println("Сортировка по Price:");
        sorted.sortedPrice(arrayList);
        for (Notebook notebook : arrayList) {
            System.out.println(notebook.title() + " RAM: " + notebook.ram() + " цена: " + notebook.price());
        }
        System.out.println();

        System.out.println("Мега сортировка:");
        sorted.megaSorted(arrayList);
        for (Notebook notebook : arrayList) {
            System.out.println(notebook.title() + " RAM: " + notebook.ram() + " цена: " + notebook.price());
        }
    }
}


