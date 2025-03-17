package stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class inbuilt {

    public static void main(String[] args) {
    //     Stack<Integer> stack = new Stack<>();
    //     stack.push(10);
    //     stack.push(11);
    //     stack.push(16);
    //     stack.push(13);
    //     stack.push(14);
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //    // System.out.println(stack.pop());

    //queue
    // 

//FIFO
    // Queue<Integer> q = new LinkedList<>();
    // q.add(5);
    // q.add(1);
    // q.add(6);
    // System.out.println(q.remove());

    //java deque
    //insert and remove from both sides 
    Deque<Integer> deque = new ArrayDeque<>();
    //resizable array of deque interface , used in trees , dequeu comes handy  more than queue 
    
    deque.add(89);
    deque.add(839);
    deque.add(59);
    deque.addFirst(78 );
    deque.addLast(100);

    }
    
}