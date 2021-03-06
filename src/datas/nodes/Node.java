package datas.nodes;

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

    public Node(T payload, Node<T> nextNode) {
        this.payload = payload;
        this.nextNode = nextNode;
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

    public String linkedToString() {
        StringBuilder stringBuilder = new StringBuilder(this.getPayload().toString());
        Node<T> node = this.nextNode;

        if(node != null) {
            stringBuilder.append(" >> ")
                    .append(node.getPayload().toString());
        }

        stringBuilder.append(" >> null");

        return stringBuilder.toString();
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
