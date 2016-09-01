package talleruno;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;



public class CuentaCDT extends CuentaAhorro {
     private double tasaDesc;
     private int diasVence;
     private LocalDate fechaInicio;
     private LocalDate fechaVence;
     
     public CuentaCDT(){
      
     }
     
     public CuentaCDT(int idCliente, double deposito, String estado,double tasa,double tasaDesc,int anio,int mes, int dia,int diasVence){
        super(idCliente,deposito,estado,tasa);
        this.tasaDesc=tasaDesc;
        this.diasVence=diasVence;
        
        //DateTimeFormatter fdf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaInicio = LocalDate.of(anio, mes, dia);
        fechaVence = fechaInicio.plusDays(diasVence);   
     
    }
    
     public double getTasaDesc(){
         return tasaDesc;
    }
    
    public void setTasaDesc(double valor){
       tasaDesc = valor;    
    }
    
    public LocalDate getFechaInicio(){
     return fechaInicio;
    }
    
     public LocalDate getFechaVence(){
       return fechaVence;
    }
        
    public boolean vencido(){
       LocalDate hoy = LocalDate.now();
      
       if (hoy.isBefore(fechaVence))
           return false; 
       else 
           return true;
       
    }
    
    @Override
    public void retirar(double valor){
     
        if (! vencido()){
           setSaldo(getSaldo()- valor * (1 - getTasaDesc()));
        } else{
           setSaldo((getSaldo()- valor));
        }        
    } 

 
    
     
}
