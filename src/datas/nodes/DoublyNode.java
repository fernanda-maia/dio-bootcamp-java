package datas.nodes;

public class DoublyNode<T> {

    private T payload;
    private DoublyNode<T> nextNode;
    private DoublyNode<T> previousNode;

    public DoublyNode(T payload) {
        this.payload = payload;
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
}
