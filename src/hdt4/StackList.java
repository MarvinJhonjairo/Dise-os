
package hdt4;

import java.util.ArrayList;

public class StackList<E> extends AbstractStack<E> {
    protected ArrayList<E> data;
    
 public StackList(){
    data = new ArrayList<E>();
    ListFactory<E> factory = new ListFactory<E>();
    List<E> nuevo = factory.getList("1");
    }

 public void push(E item){data.add(item);}
 public E pop(){return data.remove(size()-1);}      
 public E peek(){return data.get(size() - 1);}
 public int size(){return data.size();}
 
}


/*
public class StackList<E> extends AbstractStack<E> {
    protected List<E> data;

      ---------------    Esto ya es para el factory --------------------- 
public StacktList(){
       ListFactory<E> factory = new ListFactory<E>();
       data = factory.getList();
   }
    
   
    
 public void push(E item){data.addLast(item);}
 public E pop(){return data.removeFirst();}      
 public E peek(){return data.getFirst();}
 public int size(){return data.size();}

*/