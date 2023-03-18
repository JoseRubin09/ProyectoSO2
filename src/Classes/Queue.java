/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Kevin
 */
public class Queue {

    public Node peek;
    public Node last;
    public int size;

    public Queue() {
        this.peek = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return peek == null;
    }

    public void empty() {
        this.peek = null;
        this.last = null;
        this.size = 0;
    }

    public void add(Node nuevo) {
        if (isEmpty()) {
            last = peek = nuevo;
        } else {
            last.setNext(nuevo);
            last = nuevo;
        }
        size++;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("No hay elementos para desenconlar.");
        } else if (size == 1) {
            empty();
        } else {
            peek = peek.getNext();
            size--;
        }
    }

}
