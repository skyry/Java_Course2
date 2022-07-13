package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] arr1 = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(arr1);
        System.out.println(list);
//        arr1[0] = sb1.append("!!!");
        arr1[0] = new StringBuilder("F");
        System.out.println(list);
    }
}
