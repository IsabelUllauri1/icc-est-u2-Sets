import controller.ContactoController;
import controller.Ejercicios;
import controller.Sets;
import java.util.Set;
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hecho por: Isabel Ullauri");
        Sets sets = new Sets();
        runHashSet(sets);     
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparador2(sets);
        ContactoController cC= new ContactoController();
        Ejercicios ejer = new Ejercicios();
        

        
        
    }

    public static void runHashSet (Sets sets){
        Set<String> ejemploHash =  sets.construirHashSet();
        System.out.println("----Hash Set----");
        System.out.println("no se garantiza el orden");
        System.out.println("");
        for(String s:ejemploHash){
            System.out.println(s);
        }
        
    }

    public static void runLinkedHashSet( Sets sets){
        Set<String> ejemplo2 =  sets.construirLinkedHashSet();
        System.out.println("\n----LinkedHashSet----");
        System.out.println("respeta orden de insercion");
        for(String elemento : ejemplo2){
            System.out.println(elemento);
        }
    }

    public static void runTreeSet(Sets sets){
        Set<String>ejemplo3 = sets.construirTreeSet();
        System.out.println("\n---TreeSet---");
        System.out.println("orden alfabetico");        

        for(String elemento : ejemplo3){
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparador(Sets sets){
        Set<String> ejemplo4 = sets.construirTreeSetConComparador();
        System.out.println("\n---- TreeSetComparador----");
        System.out.println("ordenado por longitud de palabra");
        for(String c : ejemplo4){
            System.out.println(c);
        }
    }
    public static void runTreeSetConComparador2 (Sets sets){
        Set<String> ejemplo4 = sets.construirTreeSetConComparador();
        System.out.println("\n---- TreeSetComparadorDescendente----");
        System.out.println("ordenado por longitud de palabra z-a");
        for(String c : ejemplo4){
            System.out.println(c);
        }
    }
    
}
