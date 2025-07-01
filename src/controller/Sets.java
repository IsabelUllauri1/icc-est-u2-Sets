package controller;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets(){

    }
    public Set<String> construirHashSet(){
        Set<String>palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        return palabras;

    }
    public Set<String> construirLinkedHashSet(){
        Set<String> palabrasLinkeadas = new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");

        return palabrasLinkeadas;

    }
    public Set<String> construirTreeSet(){
        Set<String> palabrasTreeSet = new TreeSet<>();
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Manzana");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Celular");
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Laptop");

        return palabrasTreeSet;
    }

    public Set<String> construirTreeSetConComparador(){
        //crear un comparador
        Comparator<String> comparadorLongitud= new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                //primero comparamos la longitud
                int result = Integer.compare(s1.length(), s2.length());
               //si el orden es igual se compara alfabeticamente
                if(result==0){
                   return s1.compareToIgnoreCase(s2);

                }
                return result;
            }


        };
        
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);//se crea un treeset pero que vaya ordenando por logitud de palabra
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");

        return miTreeSet ;
    }

    public Set<String> construirTreeSetConComparadorMenorMayor(){
        //crear un comparador
        Comparator<String> comparadorLongitud= new Comparator<String>() {
            @Override
            public int compare(String s2, String s1){
                //primero comparamos la longitud
                int result = Integer.compare(s1.length(), s2.length());
               //si el orden es igual se compara alfabeticamente
                if(result==0){
                   return s1.compareToIgnoreCase(s2);

                }
                return result;
            }


        };
        
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);//se crea un treeset pero que vaya ordenando por logitud de palabra
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");

        return miTreeSet ;
    }

}
