
package principal;

import entidades.Color;
import entidades.Pluma;
import entidades.Tinta;
import entidades.Tipo;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tinta t1 = new Tinta(Color.Rojo, Tipo.ConBrillito);
        
        Pluma p1 = new Pluma("Pirulo", t1, 5);
        
        System.out.println(p1.mostrar());
        
        Pluma.add(p1, t1);
        
        System.out.println("------------------");
        
        System.out.println(p1.mostrar());
        
        System.out.println("------------------");
        
        Pluma.remove(p1, t1);
        
        System.out.println(p1.mostrar());
        
        
    }
    
}
