package estrutura;

public class Main {

    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<>();
        Stack<String> myStack = new Stack<>();

        myQueue.enqueue("NODE FIRST IN");
        myStack.push("NODE FIRST IN");

        for(int i = 2; i < 5; i++) {
            myQueue.enqueue("NODE " + i);
            myStack.push("NODE " + i);
        }

        myQueue.enqueue("NODE LAST IN");
        myStack.push("NODE LAST IN");

        System.out.println(myQueue);
        System.out.println(myStack);

        System.out.println("**** REMOVE ****");
        System.out.println("QUEUE: " + myQueue.dequeue());
        System.out.println("STACK: " + myStack.pop());

        System.out.println("\n**** FIRST / TOP ****");
        System.out.println(myQueue.first());
        System.out.println(myStack.top());


        System.out.println(myQueue);
        System.out.println(myStack);

    }

}