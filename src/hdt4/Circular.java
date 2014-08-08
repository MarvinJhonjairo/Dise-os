/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hdt4;

public class Circular<E> extends AbstractList<E>{

protected Nodo<E> tail; 
protected int count;
protected Nodo<E> head;

public Circular()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Nodo<E> temp = new Nodo<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}


public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}


// lo dificil es quitar el elemento de la cola

public E removeFirst()
// pre: !isEmpty()
// post: returns and removes value from tail of list
{
   Nodo<E> temp = head;
   head = head.next();
   count--;
   return temp.value();
}

public E getFirst()
{
    return head.value();
}

    public int size()
// post: returns number of elements in list            
    {
        return count;
    }


}