package estrutura;

import java.util.Objects;

public class Node<T> {

    private T payload;
    private Node<T> nextNode;

    public  Node() {
        this.nextNode = null;
    }

    public Node(T payload) {
        this();
        this.payload = payload;
    }

    public void setNextNode(Node<T> node) {
        this.nextNode = node;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public T getPayload() {
        return this.payload;
    }

    @Override
    public String toString() {
        return this.payload.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(payload, node.payload) && Objects.equals(nextNode, node.nextNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, nextNode);
    }
}
