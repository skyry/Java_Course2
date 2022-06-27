package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Dima");
        arrayList1.add("Igor");
        arrayList1.add(1, "Serj");
        for (String i : arrayList1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
    }
}
