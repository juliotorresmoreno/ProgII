package talleruno;

import java.util.Iterator;
import java.util.List;

public  class  ClienteDTO  extends Repositorio {

    public ClienteDTO() {
    }

    @Override
    public Cliente traer(int id) {
               
         Iterator <Cliente> it =super.getLista().iterator();          
         while (it.hasNext()){
               Cliente x =it.next();
                if (x.getId()==id)
                  return x; 
          }
         return null;
}
}
