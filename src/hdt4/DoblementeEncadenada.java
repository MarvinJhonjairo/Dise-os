
package hdt4;

public class DoblementeEncadenada<E> extends AbstractList<E>{
protected int count;
protected DoblementeEncadenadaNodo<E> head;
protected DoblementeEncadenadaNodo<E> tail;

public DoblementeEncadenada()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}



public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoblementeEncadenadaNodo<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}


public E removeFirst()
    {
        
        DoblementeEncadenadaNodo<E> temp = head;
        head = head.next();
        count--;
        return temp.value();
}

  
    public int size()
// post: returns number of elements in list            
    {
        return count;
    }
     
    public E getFirst()
// post: returns number of elements in list            
    {
        return head.value();
    }
    


/*
   
    public E removeLast()
    {
        Assert.pre(!isEmpty(),"List is not empty.");
        DoblementeEncadenadaNodo<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
    }
    
  public void add(E value)
    {
        addFirst(value);
    }
    
public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoblementeEncadenadaNodo<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}
    public boolean isEmpty()
// post: returns true iff list has no elements           
    {
        return size() == 0;
    }

    public void clear()
// post: removes all elements from list
    {
        head = tail = null;
        count = 0;
    }

*/



}