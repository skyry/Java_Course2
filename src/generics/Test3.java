package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();        //ok
        List<Integer> list2 = new ArrayList<Integer>(); //ok
        //    List<Number> list3 = new ArrayList<Integer>(); //nok
        List<?> list4 = new ArrayList<Integer>();       //ok, List<?> - wildcard

        List<Double> list5 = new ArrayList<>();
        list5.add(3.14);
        list5.add(2.65);
        list5.add(10.89);
        list5.add(50.25);
        showListInfo(list5);

        List<String> list6 = new ArrayList<>();
        list6.add("Hello");
        list6.add("Good Bye");
        list6.add("Welcome");
        list6.add("Hi");
        showListInfo(list6);

        ArrayList<Double> al = new ArrayList<>();
        al.add(3.14);
        al.add(2.65);
        al.add(10.89);
        al.add(50.25);
        System.out.println(summ(al));


    }

    static void showListInfo(List<?> list) {
        System.out.println("My list have value: " + list);
    }

    public static double summ(ArrayList<? extends Number> list){
        double sum = 0;
        for (Number i:list){
            sum+=i.doubleValue();
        }
        return sum;
    }

}
