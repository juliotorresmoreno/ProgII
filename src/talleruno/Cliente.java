package talleruno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

   @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

  
     
     
}
