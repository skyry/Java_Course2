package collection;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Dima");
        arrayList1.add("Igor");
        arrayList1.add("Dima");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!!!");
        arrayList2.add("@@@@@");
        arrayList2.add("#####");
        System.out.println(arrayList1.indexOf("Dima"));
        System.out.println(arrayList1.lastIndexOf("Dima"));
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Ivan"));
//        arrayList1.addAll(arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.addAll(1,arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();
//        System.out.println(arrayList1);
    }
}
