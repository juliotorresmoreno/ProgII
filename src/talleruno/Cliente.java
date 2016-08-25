package talleruno;

public class Cliente {

    /**
     * @return the idCliente
     */
 
     private int idCliente;
     private static int idSiguiente=1;
     private  String cedula;
     private String nombres;
     private String apellidos;
     private String estado;
     private  Cuenta[] cuentas= new Cuenta[10];
     private static int sigCuenta=0;
     
     public Cliente(String cedula,String nombres, String apellidos,String estado){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.estado=estado;
        idCliente=idSiguiente;
        idSiguiente++;    
     }
     
     public int getIdCliente() {
        return idCliente;
    }
     public Cliente(){
        idCliente=idSiguiente;
        idSiguiente++;
     }
     
     public Cuenta[] getCuentas(){     
         return cuentas;
     }
     
     public void  addCuenta(Cuenta c){
        cuentas[sigCuenta]=c;
        sigCuenta++;
     }
     
     public void getDatos(){
      System.out.println("Cedula= "+cedula+"\n"+"Nombres= "+nombres+"\n" + "Apellidos= "+apellidos);
     
     }
     public  String toString(){
        return nombres+" "+apellidos;
     }
     
}
