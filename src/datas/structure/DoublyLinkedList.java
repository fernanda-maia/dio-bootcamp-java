package datas.structure;

import datas.nodes.DoublyNode;

public class DoublyLinkedList<T> {

    private DoublyNode<T> firstNode;
    private DoublyNode<T> lastNode;
    private int _size;

    public DoublyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this._size = 0;
    }

    public int size() {
        return this._size;
    }

    public T get(int index) {
        DoublyNode<T> auxNode = this.getNode(index);

        return auxNode != null?
                auxNode.getPayload() : null;
    }

    public void add(T payload) {
        DoublyNode<T> newNode = new DoublyNode<>(payload);
        newNode.setNextNode(null);
        newNode.setPreviousNode(this.lastNode);

        if(firstNode == null) {
            this.firstNode = newNode;
        }

        if(lastNode != null) {
            this.lastNode.setNextNode(newNode);
        }

        lastNode = newNode;
        this._size++;
    }

    public void add(T payload, int index) {
        DoublyNode<T> auxNode = this.getNode(index);
        DoublyNode<T> newNode = new DoublyNode<>(payload);

        newNode.setNextNode(auxNode);

        if(auxNode != null) {
            newNode.setPreviousNode(auxNode.getPreviousNode());
            auxNode.setPreviousNode(newNode);

        } else {
            newNode.setPreviousNode(this.lastNode);
            this.lastNode = newNode;
        }

        if(index == 0) {
            this.firstNode = newNode;

        } else {
            newNode.getPreviousNode().setNextNode(newNode);
        }

        this._size++;
    }

    public T remove(int index) {

        DoublyNode<T> auxNode = this.getNode(index);

        try {
            this.indexIsValid(index);

            if(index == 0) {
                this.firstNode = this.firstNode.getNextNode();

                if(this.firstNode != null) {
                    this.firstNode.setPreviousNode(null);
                }

            } else {
                auxNode.getPreviousNode().setNextNode(auxNode.getNextNode());

                if(index == (this._size - 1)) {
                    this.lastNode = auxNode.getPreviousNode();

                } else {
                    auxNode.getNextNode().setPreviousNode(auxNode.getPreviousNode());
                }
            }

            this._size--;

        } catch(IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            auxNode = null;
        }

        return auxNode != null? auxNode.getPayload() : null;
    }

    private DoublyNode<T> getNode(int index) {
        DoublyNode<T> auxNode = this.firstNode;

        if(auxNode != null && index < this.size()) {
            for(int i = 0; i < index; i++) {
                auxNode = auxNode.getNextNode();
            }
        }

        return auxNode;
    }

    private void indexIsValid(int index) {
        if(index >= this._size || index < 0) {
            throw new IndexOutOfBoundsException(
                    "INDEX OUT OF RANGE! SIZE: " + this._size
                    + " INDEX: " + index
            );
        }
    }

    @Override
    public String toString() {
        StringBuilder formatString = new StringBuilder("""
                ------------------
                	DOUBLY LINKED LIST
                ------------------
                """);

        for(int i = 0; i < this._size; i++) {
            formatString.append(i + 1)
                    .append(") ")
                    .append(this.get(i))
                    .append("\n");
        }

        return formatString.toString();
    }
}
