import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int ran = random.nextInt(0, 2);
            linkedList.add(ran);
            arrayList.add(ran);
        }
        System.out.println(man(arrayList));
        System.out.println(man(linkedList));
    }

    public static LinkedList<Integer> man(LinkedList<Integer> linkedList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer integer : linkedList) {
            if (integer == 0) {
                list.addFirst(integer);
            } else {
                list.addLast(integer);
            }
        }
        return list;
    }

    public static ArrayList<Integer> man(ArrayList<Integer> linkedList) {
        LinkedList<Integer> list1 = new LinkedList<>();
        for (Integer integer : linkedList) {
            if (integer == 0) {
                list1.addFirst(integer);
            } else {
                list1.addLast(integer);
            }
        }
        return new ArrayList<>(list1);
    }
}