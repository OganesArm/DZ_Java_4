package DZ_java.java_DZ_4;

import java.util.Arrays;
import java.util.LinkedList;

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
Постараться не обращаться к листу по индексам.
 */
public class task1 {
    public static void main(String[] args) {
        // с возвратом нового списка
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Первый список: " + linkedList1);
        LinkedList<Integer> reversedLinkedList = getReversedLinkedList(linkedList1);
        System.out.println("Перевернутый список: " + reversedLinkedList);
    }

    static LinkedList<Integer> getReversedLinkedList (LinkedList<Integer> linkedList){
        // возврат перевернутого списка
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        while (linkedList.size() > 0){
            reversedLinkedList.add(linkedList.pollLast());
        }
        return reversedLinkedList;
    }

}

