package controller;

import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

import java.util.Set;

public class ContactoController {

    public ContactoController(){
        runTreeContacto();
        runTreeContactoConNumero();
    }

    private void runTreeContacto(){
        System.out.println("Contactos orden alfabetico apellido-nombre");
        ContactoComparator comparador = new ContactoComparator();
        Set<Contacto> agenda = new TreeSet<>(comparador);

        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));  
    
        for(Contacto c: agenda){
            System.out.println(c);
        }
    
    }

    private void runTreeContactoConNumero(){
        System.out.println("\nContactos orden alfabetico apellido-nombre-telefono(des)");

        ContactoComparatorConNumero comparator = new ContactoComparatorConNumero();
        Set<Contacto> agenda = new TreeSet<>(comparator );

        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));  
    
        for(Contacto c: agenda){
            System.out.println(c);
        }
    
    }
    
}
