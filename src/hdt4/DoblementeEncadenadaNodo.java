
package hdt4;

public class DoblementeEncadenadaNodo<E>{
protected E data;
protected DoblementeEncadenadaNodo<E> nextElement;
protected DoblementeEncadenadaNodo<E> previousElement;

public DoblementeEncadenadaNodo(E v,DoblementeEncadenadaNodo<E> next,DoblementeEncadenadaNodo<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

public DoblementeEncadenadaNodo(E v)
// post: constructs a single element
{
    this(v,null,null);
}


 //void setNext(Object object) {}

public DoblementeEncadenadaNodo<E> next()
// post: constructs a single element
{
    return nextElement;
}

public E value(){return data;}

   
}