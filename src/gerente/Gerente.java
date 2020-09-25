package gerente;

/**
 *
 * @author rudi.dearcia
 */
public class Gerente{
    
    private String nombre;
    private double altura;
    
    public Gerente(String nombre, double altura){
        this.nombre = nombre;
        this.altura = altura;
    }
    //Método para mostrar los datos del del empleado, en este caso es un GERENTE, su vestimenta y su trabajo que debe de realizar
    public void mostrarNombre(){
        System.out.println("     El Gerente de la Empresa es un empleado que mide " + altura +", se llama " + nombre +" y");

        Entrevista tye = new Entrevista();
        
        tye.VestimentaGerente();
        tye.TrabajarG();
        tye.doGerente();
        
    }
    
}
