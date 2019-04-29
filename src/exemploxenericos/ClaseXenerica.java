
package exemploxenericos;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class ClaseXenerica <T>{//clase parametrizada
    
    
    private T valor;

    public ClaseXenerica() {
        //meteodo que so da valor nulo
        valor = null;
    }

    public void setXenerica(T v) {
        //recibe un valor calquera tipo
        valor = v;
    }

    public T getXenerico() {
        return valor;
    }
    //esto e  un metodo xenerico
    //vale para clase xenerica e non xenerica
public <T> void amosar(ArrayList<T>lista){
    //metodo que amosa o arrayList
    for(int i=0; i<lista.size();i++){
        System.out.println(lista.get(i));
        for (T elemento:lista){
            System.out.println(elemento);
        }
    }
}
//o ? + extends indica que persoa e comodin para todas as clases fillas
        public void ver(ArrayList<? extends Persoa>listaPersoa){
            for(int i=0;i<listaPersoa.size();i++){
                
            
            System.out.println(listaPersoa.get(i));
            }
    }
 public <T>void validar(){
     Scanner sc = new Scanner(System.in);

    System.out.print("Numero: ");
    int numero = sc.nextInt();

    if( numero <= 0)
    { System.out.println("Numero no valido"); }
    else 
    { System.out.println(numero); }
    
     
 }
}
   
    
    

