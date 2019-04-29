
package exemploxenericos;

/**
 *
 * @author ifernandezblanco
 */
public class Profesorado extends Persoa {
    private String modulo="Programacion";

    public Profesorado() {
    }

    public Profesorado(String modulo, String nome, float soldo) {
        super(nome, soldo);
        this.modulo = modulo;
    }

    public String getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        return super.toString() + " modulo= " + modulo ;
    }
    
    
}
