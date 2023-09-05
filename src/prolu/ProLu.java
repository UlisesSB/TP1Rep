package prolu;

import java.util.ArrayList;

/**
 *
 * @author Ulises
 */
public class ProLu {
    public static void main(String[] args) {
        int NumInt = 1009;
        float NumFloat = 1009.2002f;
        double Numdouble = 20021009;
        String cadena = "cadenesius";
      
        System.out.println("Los datos son: " + NumInt);
        
        ArrayList<Float> lista = new ArrayList <> ();
        
        lista.add(NumFloat);
        lista.add(NumFloat);
        for(float i: lista){
            
        System.out.println("texto" + i);
        
        }
    }
}
