package exemploxenericos;

import java.util.ArrayList;

/**
 *
 * @author ifernandezblanco
 */
public class ExemploXenericos {

   
    public static void main(String[] args) {
        
        
        /*ClaseObject obx1 = new ClaseObject();
        //metodo que pemite darle valor a una variable
        obx1.setVariable("aaaa");
        
        //problemas de usar objetc
        //es necesario hacer un casteo de object al nuevo tipo  de dato
        String cadea = (String) obx1.getVariable();
        
        Persoa p = new Persoa("ana", 2000);
        obx1.setVariable(p);
        
        Persoa per = (Persoa)obx1.getVariable();
        //visualiza
        System.out.println(cadea);
        System.out.println(per);*/
        
        
        ClaseXenerica <String> nome = new ClaseXenerica<>();
        //so pode ter un valor string
        //debido a que o indicamos a o crear a clase xenerica
        nome.setXenerica("bbbb");
        String cadea2 = nome.getXenerico();
        Persoa pe = new Persoa("Anton", 3000);
        // e necesario volver a darlle un novo tipo a clase xenerica
        ClaseXenerica <Persoa> per = new ClaseXenerica<>();
        per.setXenerica(pe);
       
        
        ArrayList<Persoa> nomeP = new ArrayList<>();
        nomeP.add(pe);
        per.amosar(nomeP);
        
        ArrayList<Integer> num= new ArrayList<>();
        num.add(4);
        num.add(5);
    
    ClaseXenerica<Integer> nume = new ClaseXenerica<>();
    nume.amosar(num);
       
       ArrayList<Profesorado> profe = new ArrayList<>();
       profe.add(new Profesorado("pro","Math", 1500));
              profe.add(new Profesorado("pro1","Lengua", 2500));
       profe.add(new Profesorado("pro2","Gallego", 1000));
    per.ver(profe);
    }
   }
