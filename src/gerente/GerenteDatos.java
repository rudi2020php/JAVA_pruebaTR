package gerente;

/**
 *
 * @author rudi.dearcia
 */
public class GerenteDatos{
    
    private String nombre;
    private double altura;
    
    public GerenteDatos(String nombre, double altura){
        this.nombre = nombre;
        this.altura = altura;
    }
    
//    public abstract void VestimentaGerente();
    
    //Método para mostrar los datos del del empleado, en este caso es un GERENTE, su vestimenta y su trabajo que debe de realizar
    public void mostrarNombre(){
        System.out.println("     El Gerente de la Empresa es un empleado que mide " + altura +", se llama " + nombre +" y");

        GerenteIndicacionesTrabajar vestir = new GerenteVestimenta();
        vestir.VestirTrabajar();
        
        GerenteIndicacionesTrabajar trabajo = new GerenteTrabajar();
        trabajo.VestirTrabajar();
        
         GerenteIndicacionesTrabajar entrevis = new GerenteEntrevista();
        entrevis.VestirTrabajar();
        
//        tye.VestimentaGerente();
//        tye.TrabajarG();
//        tye.doGerente();
        
    }
    
    
}
