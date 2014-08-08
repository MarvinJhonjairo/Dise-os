
package hdt4;

public abstract class AbstractList<E> implements List<E>{
   
    public AbstractList()
   // post: does nothing
   {
   }

   @Override
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
}