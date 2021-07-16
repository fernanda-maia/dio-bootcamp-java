package estrutura;

public class Queue<T> {

    private Node<T> entryNode;

    public Queue() {
        this.entryNode = null;
    }

    public void enqueue(T object) {
        Node<T> queue = new Node<>(object);

        queue.setNextNode(entryNode);
        this.entryNode = queue;
    }

    public T dequeue() {
        T object;
        Node<T> firstNode = this.firstNode();
        Node<T> tempNode = this.entryNode;

        this.entryNode = firstNode == tempNode
                ? null
                : tempNode;

        if(!this.isEmpty()) {

            while(tempNode.getNextNode() != firstNode) {
                tempNode = tempNode.getNextNode();
            }

            tempNode.setNextNode(null);
        }

        object = firstNode != null
                ? firstNode.getPayload()
                : null;

        return object;
    }

    public T first() {
        T object = null;

        if(!this.isEmpty()) {
            Node<T> node = this.firstNode();
            object = node.getPayload();
        }

        return object;
    }

    public Boolean isEmpty() {
        return this.entryNode == null;
    }

    private Node<T> firstNode() {
        Node<T> tempNode = this.entryNode;

        if(!this.isEmpty()) {
            while(tempNode.getNextNode() != null) {
                tempNode = tempNode.getNextNode();
            }
        }

        return tempNode;
    }

    @Override
    public String toString() {
        StringBuilder formatString = new StringBuilder(
                """
                ------------------
                \tQUEUE
                ------------------
                """
        );

        Node<T> tempNode = this.entryNode;

        while(tempNode != null) {
            formatString.append(tempNode)
                    .append(tempNode.getNextNode() != null
                            ? " >> "
                            : "\n");

            tempNode = tempNode.getNextNode();
        }

        return formatString.toString();

    }
}
