/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerente;

/**
 *
 * @author rudi.dearcia
 */
public class EmpresaMain {

    public static void main(String args[]) {

        Persona identificate = new Persona();
        identificate.Identificarse();

        double altura = identificate.getAltura();

        if (altura != 1.80) {
            System.out.println("NO TIENES LA ALTURA DEL GERENTE");
            System.out.println("tú altura es diferente a 1.80");
            //hacer para empleado...
        } else {
            String nombre = identificate.getNombre();
            Gerente nmb = new Gerente(nombre, altura);
            nmb.mostrarNombre();
        }
    }
}
