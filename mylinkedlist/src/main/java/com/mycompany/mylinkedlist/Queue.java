/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mylinkedlist;

/**
 *
 * @author leens
 */
public class Queue<E> {
     Mylinkedlist<E> list =new Mylinkedlist<E>();
    public Queue() {
    }
   
    public void enqueue(E e)
    {
        list.addLast(e);
    }
    
    public E dequeue()
    {
        return list.removeFirst();
    }
    public int size()
    {
      return  list.size;
    }
    public E peek()
    {
        return list.getFirst();
    }

}
