/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mylinkedlist;

/**
 *
 * @author leens
 */
public class Mylinkedlist<E> {

 
   Node <E> head,tail;
    int size=0;

    public Mylinkedlist() {
        
    }

    public  Mylinkedlist(E [] objects) {
        for (int i = 0; i < objects.length; i++) {
            addLast(objects[i]);
        }
    }
    public E getFirst()
    {
        if(size==0)
            return null;
        else
            return head.element;
    }
    
    public E getLast()
    {
        if(size==0)
            return null;
        else
            return tail.element;
    }
    
    public void addFirst(E e)
    {
        
        Node<E> newNode= new Node<E> (e);
        newNode.next=head;
        head=newNode;
        size++;
        if(tail==null)
            tail=head;
    }
     public void addLast(E e)
    {    
        Node<E> newNode= new Node<E> (e);
        if(tail==null)
            tail=head=newNode;
        else{
        tail.next=newNode;
        tail=newNode;
        }
        size++;
        
    }
    public void addAtIndex(int index,E e)
    {    
        if(index==0)
            addFirst(e);
        else if(index>=size)
            addLast(e);
        else{
        Node <E> current=head;
        for(int i=0;i<index-1;i++)
        {
            current=current.next;
        }
        Node<E> newNode= new Node<E> (e);
        
        newNode.next=current.next;
        current.next=newNode;
        size++;
    }
    
        
    }
    
     public E removeFirst()
     {
          
       if(size==0)
           return null;
       else {
           Node <E> temp=head;
           head=head.next;
           if(head==null)
               tail=null; 
           size--;
        return temp.element;
       }
       
         
     }
    public E removeLast()
     {
       Node <E> temp;
       if(size==0)
           return null;
       else if(size==1)
       {
           temp=head;
           head=tail=null;
           size=0;
           return temp.element;
       }
       else {
           Node<E> current=head;
            for(int i=0;i<size-2;i++)
            {
                current=current.next;
            }
    temp=current.next;// ممكن نحط  temp=tail;
    tail=current;
          tail.next=null;
           
           size--;
           return temp.element;
       }
       
        
           
     }
     public E removeFromIndex(int index)
     {
         if(index<0||index>size)
             return null;
        if(index==0)
           return removeFirst();
        else if(index==size-1)
           return removeLast();
        else{
        Node <E> current=head;
        for(int i=0;i<index-1;i++)
        {
            current=current.next;
        } 
        Node<E> temp=current.next;
        current.next=(current.next).next;
         size--;
        return temp.element;
       
     }
     }
     
public int size()
{
    return size;
}
public E set(int index, E e)
{
  if (size==0)
  {
      head=new Node<>(e);
     return null; 
  }
  else
  {
        Node <E> current=head;
        for(int i=0;i<index-1;i++)
        {
            current=current.next;
        }
     E temp= (current.next).element;
        
        (current.next).element=e;
        
        return temp;   
}}
   @Override
    public String toString()
{
     String result="[";
    if (size !=0)
    
    {
   
    Node<E> current=head;
    result+=head.element+" ";
    for(int i=0;i<size-1;i++)
    {
        result+=(current.next).element+" ";
        current=current.next;
    }
    }
    result+="]";
    return result;


}


    public static void main(String[] args) {
    Queue<Integer> m=new Queue<>();
    m.enqueue(1);
        m.enqueue(2);
    m.enqueue(3);
    m.enqueue(4);
        System.out.println(m.list.getFirst());
                System.out.println(m.list.getLast());
               m.list.addAtIndex(0,6);System.out.println(m.list.size);System.out.println(m.list.toString());

    }
}
