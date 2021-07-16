package estrutura;

public class Main {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        Node<String> node1 = new Node<>("NODE 1");
        Node<String> node2 = new Node<>("NODE 2");
        Node<String> node3 = new Node<>("NODE 3");
        Node<String> node4 = new Node<>("NODE 4");
        Node<String> node5 = new Node<>("NODE 5");
        Node<String> node6 = new Node<>("NODE 6");


        myStack.push(node1);
        myStack.push(node2);
        myStack.push(node3);
        myStack.push(node4);
        myStack.push(node5);
        myStack.push(node6);

        System.out.println(myStack);

        System.out.println(myStack.pop());

        System.out.println(myStack);
        System.out.println(myStack.top());


    }

}