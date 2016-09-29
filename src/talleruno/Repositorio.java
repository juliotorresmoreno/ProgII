package talleruno;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Repositorio <T>  {   
  
   private List<T> lista=new ArrayList<>();
    public Repositorio() {
    }
   
    public  void  guardar() {
      Gson gson = new Gson();
      String json = gson.toJson(lista);
      String nombre = lista.get(0).getClass().getSimpleName();
      try (FileWriter writer = new FileWriter("datos/"+nombre+".json")) {
            gson.toJson(lista, writer);
            
        } catch (IOException e) {
              System.out.println(e);
        }
    } 
    
     public void cargar(String nombre) {
        
        if (lista !=null ) return; 
        Gson gson =new Gson();
         FileReader reader;
        try {
            reader = new FileReader("datos/"+nombre+".json");
             Type tipo = new TypeToken<List<T>>(){}.getType();
             lista = gson.fromJson(reader,tipo);             
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClienteDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }
     
    public void adicionar(T t) {
       if (lista == null)
            lista=new ArrayList<>();
      
       lista.add(t);
            
       
    }

    
    public void borrar(T t) {
       lista.remove(t);
    }

    
    public void modificar(int id) {
          
    }

    
    public  abstract T  traer(int id); 

    
    public List<T> getLista() {        ;
         return lista;
    }
  
    public void setLista(List<T> t) {        
         lista=t;
    }
}
