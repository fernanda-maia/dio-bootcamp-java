package estrutura;

public class LinkedList<T> {

    Node<T> entryNode;

    public LinkedList() {
        this.entryNode = null;
    }

    public void add(T payload) {
        Node<T> newNode = new Node<>(payload);
        Node<T> auxNode = this.entryNode;

        for(int i = 0; i < this.size() - 1; i++) {
            auxNode = auxNode.getNextNode();
        }

        if(auxNode != null) {
            auxNode.setNextNode(newNode);
        } else {
            this.entryNode = newNode;
        }

    }

    public Integer size() {
        Integer size = 0;
        Node<T> auxNode = this.entryNode;

        while(auxNode != null) {
            size++;
            auxNode = auxNode.getNextNode();
        }

        return size;
    }

    public Boolean isEmpty() {
        return this.entryNode == null;
    }

    public T remove(Integer index) {
        Node<T> pivotNode = this.getNode(index);
        Node<T> previousNode;

        if(index > 0) {
            previousNode = this.getNode(index - 1);
            previousNode.setNextNode(pivotNode.getNextNode());

        } else if (index == 0) {
            this.entryNode = pivotNode.getNextNode();
        }

        return pivotNode != null? pivotNode.getPayload() : null;
    }

    public T get(Integer index) {
        Node<T> auxNode = this.getNode(index);
        return  auxNode != null? auxNode.getPayload() : null;
    }

    @Override
    public String toString() {
        Node<T> auxNode = this.entryNode;
        StringBuilder stringBuilder = new StringBuilder( """
                ------------------
                \tLINKED LIST
                ------------------
                """);

        for(int i = 0; i < this.size(); i++) {
            stringBuilder
                    .append(i + 1)
                    .append(") ")
                    .append(auxNode.getPayload())
                    .append("\n");

            auxNode = auxNode.getNextNode();
        }

        stringBuilder.append("\n");

        return stringBuilder.toString();
    }

    private Node<T> getNode(Integer index) {
        Node<T> auxNode = this.entryNode;

        try {

            this.validIndex(index);
            for(int i = 0; i != index; i++) {
                auxNode = auxNode.getNextNode();
            }

        } catch(IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            auxNode = null;
        }

        return auxNode;
    }

    private void validIndex(Integer index) {
        if(index >= this.size() | index < 0) {
            throw new IndexOutOfBoundsException("INDEX OUT OF RANGE! SIZE: "
                    + this.size() + " INDEX: " + index);
        }
    }
}
