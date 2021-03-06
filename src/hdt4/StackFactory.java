
package hdt4;

public class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
      return new StackArrayList<E>(); //regresa ArrayList
        if (entry.equals("V"))
      return new StackVector<E>(); //regresa Vector
        if (entry.equals("L"))
      return new StackList<E>(); //regresa List
        else 
      return null;
   }
}