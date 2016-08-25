
package talleruno;


public class Banco {
    
    private int idBanco;
    private static int idSiguiente=1;
    private String nombre;
    private Cliente[] clientes=new Cliente[100];
    private Cuenta[] cuentas=new Cuenta[10];
    private static int sigCliente=0;
    private static int sigCuenta=0;
    
    public  Banco(String nombre){
        this.nombre = nombre;
        idBanco=idSiguiente;
        idSiguiente++;
       
      
    }
    
    public void addCliente(Cliente c){
        clientes[sigCliente]=c;
        sigCliente++;
    }
    
    public void addCuenta(Cuenta c){        
        cuentas[sigCuenta]= c;
        sigCuenta++;
    }
    
    public double totalCuentas(){
       double xtotal=0.0;
       for (int i = 0;i < sigCuenta;i++){
            xtotal+=cuentas[i].getSaldo();
       }
       return xtotal;       
    }
    
    public void depositar(int idCuenta,double cant){
         Cuenta xcuenta=traerCuenta(idCuenta);
        if (xcuenta != null ){        
           xcuenta.depositar(cant);
        }
    }
   
    public Cuenta[] traerCuentas(){
     return cuentas;
     }
    
   public Cliente[] traerClientes(){
      return clientes;
   }
   
   public void listarClientes(){
    for (int i=0; i< sigCliente;i++){
          System.out.println("nombre ="+clientes[i]);
    }
   
   }
   
    public Cuenta traerCuenta(int id){
       
        Cuenta  xcuenta = null;
        for (int i=0; i< cuentas.length;i++){
           if (cuentas[i].getIdCuenta() == id ){              
               xcuenta= cuentas[i];
               break;
           }
        }
       return xcuenta;
    }
  
    public Cliente traerCliente(int id){
       
        Cliente  xcliente = null;
        for (int i=0; i< cuentas.length;i++){
           if (clientes[i].getIdCliente() == id ){              
               xcliente= clientes[i];
               break;
           }
        }
       return xcliente;
    }
      
    public double getSaldo(int id){
        Cuenta xcuenta= traerCuenta(id);
        if (xcuenta !=null)
             return xcuenta.getSaldo();
        else 
            return 0;    
    }
}
