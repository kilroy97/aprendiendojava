
package banco;

/**
 *
 * @author yankee23
 */
public class estructura {
    private int numCuentaOr = 789465;
    private int numCuenta = 0;
    //private int saldo; //variable en proceso

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
   
    private void evaluacion2(){
        if(evaluacion1() == true){
            
            if(getNumCuenta() != numCuentaOr){
                System.out.println("pero el Numero de cuenta no existe =( ");

            }
            else{
                System.out.println("Bienvenido a la su cuenta bancaria =) ");

            }
            
        }
    
    }
    
    private boolean evaluacion1(){
        boolean retornar;
        int convertir = numCuenta;
        String conv1 = "";
        conv1 = String.valueOf(convertir);
        conv1 = Integer.toString(convertir);
        
        int convertir2 = numCuentaOr;
        String conv2 = "";
        conv2 = String.valueOf(convertir2);
        conv2 = Integer.toString(convertir2);
        String uno = "";
        
            if(conv1.length() == conv2.length()){
               System.out.println("Ingresado correctamente =) ");
               retornar = true;
            }
            else{

               System.out.println("el numero de cuenta que ingresó está incompleto =) ");
               retornar = false;
            }
            return retornar;
        
            
    }
    
    public void mostrarmensaje(){
        evaluacion2();
    }
    
    
}
