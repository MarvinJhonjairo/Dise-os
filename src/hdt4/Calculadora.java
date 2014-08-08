
package hdt4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora {
    //------------------------------------------------------------------------
    // para Singleton posiblemente se tiene que separar calculadora del main "posiblemente"
    
    public static void main(String[] args) {
    
    HDT4 nueva= new HDT4();
    //HDT4 nueva= new HDT4.getInstance();

}
}


/*


    int numero = 0;
    //Stack<String> calculadora = new StackVector<String>();
    
    StackFactory<String> sFactory = new StackFactory<String>();
	// Solicitar la implementacion deseada del Stack:
	//  AL: implementacion con ArrayList
	//  V:   implementacion con Vector
        //  L:   implementacion con List
    Stack<String> calculadora = sFactory.getStack("L");
    

    try {	
	FileReader fr = new FileReader("Datos.txt");
	BufferedReader bf = new BufferedReader(fr);
	String cadena;
        char caracter;
        String operando;
        int resultado=0;
        
        cadena = bf.readLine();
        while (cadena !=null){
            for(int i=0;i<=cadena.length()-1;i++){
                caracter = cadena.charAt(i);
                operando= caracter+"";
                if (caracter != ' '){
                    if(calculadora.size()== 2){
                        if(operando.equals("+")){
                            resultado = (Integer.parseInt(calculadora.pop()))+(Integer.parseInt(calculadora.pop()));
                        }
                        if(operando.equals("-")){
                            numero = Integer.parseInt(calculadora.pop());
                            resultado = (Integer.parseInt(calculadora.pop()))-(numero);                   
                        }
                        if(operando.equals("*")){
                            resultado = (Integer.parseInt(calculadora.pop()))*(Integer.parseInt(calculadora.pop()));
                        }
                        if(operando.equals("/")){
                            numero = Integer.parseInt(calculadora.pop());
                            resultado = (Integer.parseInt(calculadora.pop()))/(numero);
                        }
                        calculadora.push(Integer.toString(resultado));
                    }else{
                        calculadora.push(operando);
                    }
                }
            }
            System.out.println("El resultado es: " + resultado);
            cadena = bf.readLine();
        }
    } catch (FileNotFoundException fnfe){
	fnfe.printStackTrace();
    } catch (IOException ioe){
	ioe.printStackTrace();
    }

    }

*/