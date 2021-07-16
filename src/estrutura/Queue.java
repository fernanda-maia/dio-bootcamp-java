package estrutura;

public class Queue<T> {

    private Node<T> entryNode;

    public Queue() {
        this.entryNode = null;
    }

    public void enqueue(Node<T> queue) {
        queue.setNextNode(entryNode);
        this.entryNode = queue;
    }

    public Node<T> dequeue() {
        Node<T> firstNode = this.first();
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

        return firstNode;
    }

    public Node<T> first() {
        Node<T> tempNode = this.entryNode;

        if(!this.isEmpty()) {
            while(tempNode.getNextNode() != null) {
                tempNode = tempNode.getNextNode();
            }
        }

        return tempNode;
    }

    public Boolean isEmpty() {
        return this.entryNode == null;
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
