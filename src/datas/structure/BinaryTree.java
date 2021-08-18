package datas.structure;

import datas.nodes.DoublyNode;

public class BinaryTree<T extends Comparable<T>> {

    private DoublyNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public T remove(T payload) {
        // TODO
        return payload;
    }

    public void showInOrder() {
        String banner = """
                ------------------
                \tORDERED BINARY TREE
                ------------------
                """;

        System.out.println(banner);
        this.showInOrder(this.root);
    }

    public void showInPosOrder() {
        String banner =  """
                ------------------
                \tPOS ORDERED BINARY TREE
                ------------------
                """;

        System.out.println(banner);
        this.showInPosOrder(this.root);
    }

    public void showInPreOrder() {
        String banner = """
                ------------------
                \tPRE ORDERED BINARY TREE
                ------------------
                """;

        System.out.println(banner);
        this.showInPreOrder(this.root);
    }

    public void insert(T payload) {
        DoublyNode<T> newNode = new DoublyNode<>(payload);

        this.root = this.insert(this.root, newNode);
    }

    private DoublyNode<T> insert(DoublyNode<T> currentNode, DoublyNode<T> newNode) {
        DoublyNode<T> auxNode = newNode;

        if(currentNode != null) {
            T currentPayload = currentNode.getPayload();
            T newPayload = newNode.getPayload();

            if(newPayload.compareTo(currentPayload) < 0) {
                currentNode.setPreviousNode(insert(currentNode.getPreviousNode(), newNode));

            } else {
                currentNode.setNextNode(insert(currentNode.getNextNode(), newNode));
            }

            auxNode = currentNode;
        }

        return auxNode;
    }

    private void showInOrder(DoublyNode<T> currentNode) {
        if(currentNode != null) {
            this.showInOrder(currentNode.getPreviousNode());
            System.out.printf(" >> %s\n", currentNode.getPayload());
            this.showInOrder(currentNode.getNextNode());

        }
    }

    private void showInPosOrder(DoublyNode<T> currentNode) {
        if(currentNode != null) {
            this.showInPosOrder(currentNode.getPreviousNode());
            this.showInPosOrder(currentNode.getNextNode());
            System.out.printf(" >> %s\n",currentNode.getPayload());
        }

    }

    private void showInPreOrder(DoublyNode<T> currentNode) {

        if(currentNode != null) {
            System.out.printf(" >> %s \n", currentNode.getPayload());
            this.showInPreOrder(currentNode.getPreviousNode());
            this.showInPreOrder(currentNode.getNextNode());

        }
    }

}
