

package hdt4;

public class SimplementeEncadenada<E> extends AbstractList<E>{
   protected int count; // list size
   protected Nodo<E> head; // ref. to first element

   public SimplementeEncadenada()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  

   public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Nodo<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Nodo<E> temp = new Nodo<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Nodo<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
  
  /*
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Nodo<E>(value, head);
     count++;
  }
  
   public boolean contains(E value)
   // pre: value is not null
   // post: returns true iff value is found in list
  {
      Nodo<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
   }
*/
//Error sobre implementacion de lista
 
}