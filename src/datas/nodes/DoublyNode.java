package datas.nodes;

import java.util.Objects;

public class DoublyNode<T> {

    private T payload;
    private DoublyNode<T> nextNode;
    private DoublyNode<T> previousNode;

    public DoublyNode(T payload) {
        this.payload = payload;
        this.nextNode = null;
        this.previousNode = null;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public DoublyNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoublyNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return this.payload.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoublyNode<?> that = (DoublyNode<?>) o;
        return Objects.equals(payload, that.payload) && Objects.equals(nextNode, that.nextNode) && Objects.equals(previousNode, that.previousNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, nextNode, previousNode);
    }
}
