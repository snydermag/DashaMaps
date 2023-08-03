package com.github.zipcodewilmington.mylinkedlist;

public class MyLinkedList {

    MyNode head;

    public MyLinkedList(String key){
        head = new MyNode(key, null);
    }

    public MyNode getHead(){ return head;}

    public void add(String key, Integer value){
        MyNode currentNode = head;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new MyNode(key, value));
    }

    public int size(){
        MyNode currentNode = head;
        int counter = 0;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            counter++;
        }

        return counter;
    }

    public MyNode get(String key){
        MyNode currentNode = head;
        while(currentNode != null){
            if (currentNode.getData().getKey().equals(key)){
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }

        return null;
    }

    public void remove(int index) {}

    public boolean isEmpty(){
        return (head.getNext() == null);
    }

}
