package estrutura;

public class Node<T> {

    private T payload;
    private Node<T> nextNode;

    public Node(T payload) {
        this.payload = payload;
        this.nextNode = null;
    }

    public void setNextNode(Node<T> node) {
        this.nextNode = node;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    @Override
    public String toString() {
        return "Content: " + this.payload;
    }

}
