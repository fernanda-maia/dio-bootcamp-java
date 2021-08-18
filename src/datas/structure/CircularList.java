package datas.structure;

import datas.nodes.Node;

public class CircularList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int _size;

    public CircularList() {
        this.head = null;
        this.tail = null;
        this._size = 0;
    }

    public boolean isEmpty() {
        return this._size == 0;
    }

    public int size() {
        return this._size;
    }

    public T get(int index) {
        T payload = null;

        try {
            this.validIndex(index);
            if(!this.isEmpty()) {
                payload = this.getNode(index).getPayload();
            }

        } catch(IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

        return payload;
    }

    public T remove(int index) {
        T payload = null;

        try {
            this.validIndex(index);

            Node<T> auxNode = this.tail;

            if(!this.isEmpty()) {
                if(index == 0) {
                    this.tail = auxNode.getNextNode();
                    this.head.setNextNode(this.tail);

                } else if(index == 1) {
                    auxNode = auxNode.getNextNode();
                    this.tail.setNextNode(auxNode.getNextNode());

                } else {
                    Node<T> tempNode = this.getNode(index - 1);
                    auxNode = tempNode.getNextNode();

                    tempNode.setNextNode(auxNode.getNextNode());
                }

                payload = auxNode.getPayload();
                this._size--;
            }

        } catch(IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

        return payload;
    }

    public void add(T payload) {
        Node<T> newNode = new Node<>(payload);

        if(this.isEmpty()) {
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(this.tail);

        } else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }

        this._size++;
    }

    private Node<T> getNode(int index) {
        Node<T> auxNode = this.tail;

        try {
            validIndex(index);

            if(!isEmpty()) {
                for(int i = 0; i < index; i++) {
                    auxNode = auxNode.getNextNode();
                }
            }

        } catch(IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            auxNode = null;
        }

        return auxNode;
    }

    private void validIndex(Integer index) {
        if(index < 0) {
            throw new IndexOutOfBoundsException("INDEX OUT OF RANGE! SIZE: "
                    + this.size() + " INDEX: " + index);
        }
    }

    @Override
    public String toString() {
        Node<T> auxNode = this.tail;
        StringBuilder formatString = new StringBuilder( """
                ------------------
                \tCIRCULAR LIST
                ------------------
                """);

        for(int i = 0; i < this._size; i++) {
            formatString.append(i + 1)
                    .append(") ")
                    .append(auxNode.getPayload())
                    .append('\n');

            auxNode = auxNode.getNextNode();
        }

        if(this.isEmpty()) {
            formatString.append("{}\n");

        } else {
            formatString.append("TAIL >> ")
                    .append(this.tail.getPayload())
                    .append('\n');

        }

        return formatString.toString();
    }
}
