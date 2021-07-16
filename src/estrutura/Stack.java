package estrutura;

public class Stack<T> {

    private Node<T> entryStack;

    public Stack() {
        this.entryStack = null;
    }

    public void push(Node<T> node) {
        Node<T> tempNode = this.entryStack;
        this.entryStack = node;

        this.entryStack.setNextNode(tempNode);

    }

    public Node<T> pop() {
        Node<T> tempNode = this.entryStack;

        if(!this.isEmpty()) {
            this.entryStack = this.entryStack.getNextNode();
        }

        return tempNode;
    }

    public Node<T> top() {
        return this.entryStack;
    }

    public Boolean isEmpty() {
        return this.entryStack == null;
    }

    @Override
    public String toString() {
        StringBuilder formatString = new StringBuilder(
                """
                ------------------
                \tSTACK
                ------------------
                """
        );

        Node<T> tempNode = this.entryStack;

        while(tempNode != null) {

            formatString.append(tempNode.toString())
                    .append("\n");

            tempNode = tempNode.getNextNode();
        }

        formatString.append("------------------\n");

        return formatString.toString();
    }

}
