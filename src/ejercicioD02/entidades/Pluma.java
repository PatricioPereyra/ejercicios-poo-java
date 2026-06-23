
package entidades;


public class Pluma {
    private String marca;
    private Tinta tinta;
    private int cantidad;

    public Pluma() {
        this.marca = "sin marca";
        this.cantidad = 1;
    }

    public Pluma(String marca) {
        this();
        this.marca = marca;
    }

    public Pluma(String marca, Tinta tinta) {
        this(marca);
        this.tinta = tinta;
    }

    public Pluma(String marca, Tinta tinta, int cantidad) {
        this(marca, tinta);
        this.cantidad = cantidad;
    }
    
    
    
    public String mostrar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(this.marca).append("\n");
        sb.append("Tinta: ").append(Tinta.mostrar(tinta)).append("\n");
        sb.append("Cantidad: ").append(this.cantidad).append("\n");
        return sb.toString();
    }
    
    public static Boolean sonIguales(Pluma p, Tinta t){
        return Tinta.sonIguales(p.tinta, t);
    }
    
    public static Boolean sonDistintos(Pluma p, Tinta t){
        return !(Pluma.sonIguales(p, t));
    }
    
    public static Pluma add(Pluma p, Tinta t){
        if(Tinta.sonIguales(p.tinta, t)){
            p.cantidad++;
        }
        return p;
    }
    
    public static Pluma remove(Pluma p, Tinta t){
       if(Tinta.sonIguales(p.tinta, t)){
            p.cantidad--;
        }
       return p;
    }

    @Override
    public String toString() {
        return "Pluma{" + "marca=" + marca + ", tinta=" + tinta + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
