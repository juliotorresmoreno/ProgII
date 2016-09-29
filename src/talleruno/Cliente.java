package talleruno;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    /**
     * @return the id
     */
 
     private int id;
     private static int idSiguiente=1;
     private  String cedula;
     private String nombres;
     private String apellidos;
     private String estado;
     private  List <Cuenta> cuentas;
     private static int sigCuenta=0;
     
       public Cliente(){
        this.cuentas = new ArrayList<>();
        id=idSiguiente;
        idSiguiente++;
     }
     public Cliente(String cedula,String nombres, String apellidos,String estado){
        this.cuentas = new ArrayList<>();
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.estado=estado;
        id=idSiguiente;
        idSiguiente++;    
     }
     
     public int getId() {
        return id;
    }
   
     
     public List<Cuenta> getCuentas(){     
         return cuentas;
     }
     
     public void  addCuenta(Cuenta c){
        cuentas.add(c);
        
     }
     
     public void getDatos(){
      System.out.println("Cedula= "+cedula+"\n"+"Nombres= "+nombres+"\n" + "Apellidos= "+apellidos);
     
     }
     @Override
     public  String toString(){
        return nombres+" "+apellidos;
     }
     
     
}
