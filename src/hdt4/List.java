
package hdt4;

public interface List<E> 
{

   public int size();           // post: returns number of elements in list
   public boolean isEmpty();    // post: returns true iff list has no elements
   public E getFirst();
   // pre: list is not empty
   // post: returns first value in list
   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list
   public void addLast(E value);// post: value is added to end of list
   

}
