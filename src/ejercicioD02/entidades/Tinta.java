
package entidades;


public class Tinta {
    private Color color;
    private Tipo tipo;
    

    public Tinta() {
        this.color = Color.Verde;
        this.tipo = Tipo.China;
    }

    public Tinta(Color color) {
        this();
        this.color = color;
    }

    public Tinta(Color color, Tipo tipo) {
        this(color);
        this.tipo = tipo;
        
    }
    
    private String mostrar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Color: ").append(this.color).append("\nTipo: ").append(this.tipo);
        return sb.toString();
    }
    
    public static String mostrar(Tinta tinta){
        
        return tinta.mostrar();
    }
    
    public static Boolean sonIguales(Tinta t1, Tinta t2){
        return t1.color.equals(t2.color) && t1.tipo.equals(t2.tipo);
    }
    
    public static Boolean sonDistintos(Tinta t1, Tinta t2){
        return !(Tinta.sonIguales(t1,t2));
    }
    

    @Override
    public String toString() {
        return "Tinta{" + "color=" + color + ", tipo=" + tipo + '}';
    }
    
    
    
}
