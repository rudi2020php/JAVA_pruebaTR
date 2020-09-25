
package gerente;

/**
 *
 * @author rudi.dearcia
 */
public class Empleado {
    
        private String nombre;
    private double altura;
    
    public Empleado(String nombre, double altura){
        this.nombre = nombre;
        this.altura = altura;
    }
    //Método para mostrar los datos del del empleado, en este caso es un GERENTE, su vestimenta y su trabajo que debe de realizar
    public void mostrarNombre(){
        System.out.println(" Tús datos no han sido almacenados como gerente, vuelve a intentarlo...");
    }
}
