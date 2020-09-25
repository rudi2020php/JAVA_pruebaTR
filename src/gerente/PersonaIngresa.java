package gerente;

import java.util.Scanner;

public class PersonaIngresa {

    protected String nombre;
    protected double altura;

    //Método para poder obtener los datos ingresado por el usuario e identificarlo.
    public void Identificarse() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cúal es tú Nombre? ");
        String nombre = entrada.next();
        this.nombre = nombre;

        System.out.print("Ingresa tú Estatura ");
        double altura = entrada.nextDouble();
        this.altura = altura;
    }

    //Método Get de las variables nombre y altura para poder reutilizarla posteriormente.
    public double getAltura() {
        return altura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

}
