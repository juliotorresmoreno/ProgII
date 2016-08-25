
package talleruno;


public class TallerUno {

 
    public static void main(String[] args) {
       
        /*Cuenta  c1= new Cuenta("72135240","Hernan",55000,"Activa");
        c1.depositar(20000);
        c1.retirar(-10000);
        c1.setEstado("Embargada");
        c1.getDatos();
        Cuenta  c2= new Cuenta("112","pedro",10000,"Activa");
        c2.getDatos();
       Cuenta  c3 = new Cuenta();*/
        
       CuentaAhorro  c1 = new CuentaAhorro("72135240","Hernan",55000,"Activa",0.05);
       c1.saldoConIntereses();
       c1.saldoConIntereses();
       c1.getDatos();
    }
    
}
