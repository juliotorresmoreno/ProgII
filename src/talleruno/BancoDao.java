/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruno;

import java.util.List;

/**
 *
 * @author hpajaro
 */
public abstract class BancoDao{    
    
    public boolean adicionar(Object ins,List lista) {
        boolean add = lista.add(ins);
        return add;
    }


    public boolean  borrar(Object ins,List lista) {
        boolean remove = lista.remove(ins);
        return remove;
    }

    public void modificar(Object ins) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int  encontrar(Object ins,List lista) {
      int sw=0;    
      for (int i=0; i < lista.size();i++){
         if (lista.get(i).equals(ins))             
              sw = 1;              
         if (sw==0) i=-1;
         return i;
      }      
        return 0;
    }


    public List<Object> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
    
    
    
}
