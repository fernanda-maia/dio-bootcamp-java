package estrutura;

public class Main {

    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<>();
        Stack<String> myStack = new Stack<>();
        LinkedList<String> myList = new LinkedList<>();

        myQueue.enqueue("NODE FIRST IN");
        myStack.push("NODE FIRST IN");
        myList.add("NODE FIRST IN");

        for(int i = 2; i < 5; i++) {
            myQueue.enqueue("NODE " + i);
            myStack.push("NODE " + i);
            myList.add("NODE " + i);
        }

        myQueue.enqueue("NODE LAST IN");
        myStack.push("NODE LAST IN");
        myList.add("NODE LAST IN");

        System.out.println(myQueue);
        System.out.println(myStack);
        System.out.println(myList);

        System.out.println("**** REMOVE ****");
        System.out.println("QUEUE: " + myQueue.dequeue());
        System.out.println("STACK: " + myStack.pop());
        System.out.println("LINKED LIST: " + myList.remove(2));

        System.out.println("\n**** FIRST / TOP ****");
        System.out.println(myQueue.first());
        System.out.println(myStack.top());
        System.out.println(myList.get(0));

        System.out.println(myQueue);
        System.out.println(myStack);
        System.out.println(myList);

    }

}