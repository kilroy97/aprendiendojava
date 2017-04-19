
package banco;

import java.util.Scanner;

/**
 *
 * @author yankee23
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inserción de variables;
        int noCuenta;
        Scanner entrada = new Scanner(System.in);
        //Creación del objeto
        estructura objeto1 = new estructura();

        //comienzo del estructurado
        System.out.println("Inserte el numero de cuenta porfavor: ");
        noCuenta = entrada.nextInt();
        objeto1.setNumCuenta(noCuenta);
        objeto1.mostrarmensaje();

    }

}
