package talleruno;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class TallerUno {

      public static void main(String[] args) {
          
      Banco banco= new Banco("Davivienda");    
     
      Cliente cli1= new Cliente("72135240","Hernan","Pajaro","Activo");
      Cliente cli2= new Cliente("115240","Pedro","Navajas","Activo");
      Cliente cli3= new Cliente("12356","Alvaro","Furibe","Activo");
     // ver la clase cliente con los metodos equals y hasCode redefinidis
      System.out.println("hc cLI2="+cli2.hashCode());
     System.out.println("hc cLI3="+cli3.hashCode());
      if (cli2.equals(cli3))
          System.out.println("Cli2 y CLi3 son iguales");
      else 
          System.out.println("Cli2 y CLi3 NO son iguales");

          
      CuentaCDT cdt1 = new CuentaCDT(cli1.getId(),50000,"Activa",0.05,0.02,2016,07,01,90);
      
      Set <Cliente> Clientes = new HashSet<>();
      Clientes.add(cli1);
      Clientes.add(cli2);
      Clientes.add(cli3);  // como es un Set no  repite objetos
      System.out.println("HC Cli2="+cli2.hashCode());
      System.out.println("HC Cli3="+cli3.hashCode());
      System.out.println(Clientes);
      
//Uso de Listas enlazadas 
      
      LinkedList <Cliente> ClientesLk = new LinkedList<>();
      ClientesLk.add(cli1);
      
      ClientesLk.add(cli2);
      
      ListIterator <Cliente> lits=ClientesLk.listIterator();
      lits.next();  // Mueve el apuintador de antes del inicio a despues del primer elemento
      ClientesLk.add(cli3); // Se adiciona el clientes antes del CLi2
       System.out.println(ClientesLk);
/*// Creando un CT para el cliente 1
      Repositorio<CuentaCDT> regCuentaCDT= new Repositorio<>();
      regCuentaCDT.adicionar(cdt1);
      regCuentaCDT.guardar();    
      Repositorio<Cliente> regCliente= new Repositorio<>();
      regCliente.cargar("Cliente");       
      regCliente.adicionar(cli1);
      regCliente.adicionar(cli2);
      regCliente.guardar();
      System.out.println(regCliente.getLista());
      System.out.println("===========================");
     ;
      
         Cliente cli4= new Cliente("122240","Pablo","Marmol","Activo");
         regCliente.cargar("Cliente");
         regCliente.adicionar(cli4);
         regCliente.guardar();
         System.out.println(regCliente.getLista());
         System.out.println(regCliente.traer(1));
         
         */
      }
}
