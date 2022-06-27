package collection;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Dima");
        arrayList1.add("Igor");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(30);
        arrayList2.add("Ivan");
        arrayList2.add("Dima");

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);

    }
}
