package DZ_java.java_DZ_4;
import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> queue = new LinkedList<>();
    void enqueue(int item){
        queue.addLast(item);
    }

    int dequeue(){
        if (queue.size() > 0){
            return queue.pollFirst();
        }else {
            throw new RuntimeException("Ошибка при удалении первого элемента из очереди. Возможно, очередь пуста.");
        }
    }

    int first(){
        if (queue.size()>0){
            return queue.peekFirst();
        }else {
            throw new RuntimeException("Ошибка при возврате первого элемента из очереди. Возможно, очередь пуста.");
        }
    }
}
