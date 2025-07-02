package utils;

import java.util.Comparator;
import java.util.Set;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {


        //primero el apellido a-z
        int result = o1.getApellido().compareTo(o2.getApellido());
        //segundo: si son iguales comparo por el nombre a-z
        
        if(result!=0){

           return result;
        }

       //segundo: si son iguales comparo por el nombre a-z
       return o1.getNombre().compareTo(o2.getNombre());

        


    }

    

    

}
