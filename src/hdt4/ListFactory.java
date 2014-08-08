

package hdt4;

public class ListFactory<E> {
       public List<E> getList(String entry){
        if(entry.equals("1"))
            return new SimplementeEncadenada<E>();
        if(entry.equals("2"))
            return new DoblementeEncadenada<E>();
        if(entry.equals("3"))
            return new Circular<E>();
        else 
            return null;
    
    } 
}
