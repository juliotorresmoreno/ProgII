package talleruno;
public class TallerUno {

      public static void main(String[] args) {
          
      Banco banco= new Banco("Davivienda");     
     
      Cliente cli1= new Cliente("72135240","Hernan","Pajaro","Activo");
      Cliente cli2= new Cliente("115240","Pedro","Navajas","Activo");
      CuentaCDT cdt1 = new CuentaCDT(cli1.getIdCliente(),50000,"Activa",0.05,0.02,2016,07,01,90);
      
      banco.addCuenta(cdt1);
      banco.addCliente(cli1);
      banco.addCliente(cli2);
      cli1.addCuenta(cdt1);
     
      CuentaAhorro ca1 = new CuentaAhorro(cli1.getIdCliente(),30000,0.03) ;     
      banco.addCuenta(ca1); 
      cli1.addCuenta(ca1);
      banco.depositar(2, 200000);
      
       // creacion por contructor default 
      CuentaCorriente cc1 = new CuentaCorriente();
      cc1.setIdCliente(cli1.getIdCliente());
      cc1.setSaldo(50000);
      cc1.setSobregiro(20000);
      cc1.setEstado("Activo");
      
      cc1.retirar(60000);
      
      // aplicacion de polimorfismo por sustitucion movimientos es una
      // Variable polimorfica
      
      Cuenta[] movimientos=new Cuenta[3];
      
      movimientos[0]=ca1; movimientos[1]=cc1; movimientos[2]=cdt1;
      
      for (int i=0;i<3;i++){
        movimientos[i].retirar(60000);
        movimientos[i].getSaldo();
        movimientos[i].getDatos();
        System.out.println("----------");
      }
      System.out.println("Total Dinero en cuentas ="+banco.totalCuentas());
       System.out.println("Saldo cuenta #="+ca1.getIdCuenta()+ " es = "+ca1.getSaldo());
       System.out.println("Saldo de la cuenta 1= "+banco.getSaldo(1));
       banco.traerClientes();
      }
}
