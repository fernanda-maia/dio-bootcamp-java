package datas;

import datas.model.Obj;
import datas.structure.*;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Obj> myTree = new BinaryTree<>();

        myTree.insert(new Obj(13));
        myTree.insert(new Obj(10));
        myTree.insert(new Obj(25));
        myTree.insert(new Obj(2));
        myTree.insert(new Obj(12));
        myTree.insert(new Obj(20));
        myTree.insert(new Obj(31));
        myTree.insert(new Obj(29));
        myTree.insert(new Obj(32));

        myTree.remove(new Obj(2));
        myTree.remove(new Obj(20));

        myTree.showInOrder();
        myTree.showInPreOrder();
        myTree.showInPosOrder();

//        Queue<String> myQueue = new Queue<>();
//        Stack<String> myStack = new Stack<>();
//        LinkedList<String> myList = new LinkedList<>();
//        DoublyLinkedList<String> myDList = new DoublyLinkedList<>();
//        CircularList<String> myCList = new CircularList<>();
//
//        myQueue.enqueue("NODE FIRST IN");
//        myStack.push("NODE FIRST IN");
//        myList.add("NODE FIRST IN");
//        myDList.add("NODE FIRST IN");
//        myCList.add("NODE FIRST IN");
//
//
//        for(int i = 1; i < 5; i++) {
//            myQueue.enqueue("NODE " + i);
//            myStack.push("NODE " + i);
//            myList.add("NODE " + i);
//            myDList.add("NODE " + i);
//            myCList.add("NODE " + i);
//        }
//
//        myQueue.enqueue("NODE LAST IN");
//        myStack.push("NODE LAST IN");
//        myList.add("NODE LAST IN");
//        myDList.add("NODE LAST IN");
//        myCList.add("NODE LAST IN");
//
//        System.out.println(myQueue);
//        System.out.println(myStack);
//        System.out.println(myList);
//        System.out.println(myDList);
//        System.out.println(myCList);
//
//        System.out.println("**** REMOVE ****");
//        System.out.println("QUEUE: " + myQueue.dequeue());
//        System.out.println("STACK: " + myStack.pop());
//        System.out.println("LINKED LIST: " + myList.remove(2));
//        System.out.println("DOUBLY LINKED LIST: " + myDList.remove(2));
//        System.out.println("CIRCULAR LIST: " + myCList.remove(2));
//
//        myDList.add("NEW NODE", 2);
//
//        System.out.println("\n**** FIRST / TOP ****");
//        System.out.println(myQueue.first());
//        System.out.println(myStack.top());
//        System.out.println(myList.get(0));
//        System.out.println(myDList.get(myDList.size() - 1));
//        System.out.println(myCList.get(myCList.size()));
//
//        System.out.println(myQueue);
//        System.out.println(myStack);
//        System.out.println(myList);
//        System.out.println(myDList);
//        System.out.println(myCList);

    }

}