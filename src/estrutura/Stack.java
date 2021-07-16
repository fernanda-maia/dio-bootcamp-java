package estrutura;

public class Stack<T> {

    private Node<T> entryStack;

    public Stack() {
        this.entryStack = null;
    }

    public void push(T object) {
        Node<T> tempNode = this.entryStack;
        this.entryStack = new Node<>(object);

        this.entryStack.setNextNode(tempNode);
    }

    public T pop() {
        T object = null;

        if(!this.isEmpty()) {
            object = this.entryStack.getPayload();
            this.entryStack = this.entryStack.getNextNode();
        }

        return object;
    }

    public T top() {
        return !this.isEmpty()
                ? this.entryStack.getPayload()
                : null;
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
