package controller;

import java.util.HashSet;
import java.util.Set;


public class Ejercicios {

    public Ejercicios(){
        System.out.println("\nEJERCICIOS SETS");
        System.out.println("Ejer 1:");
        System.out.println(tieneDuplicados(new int[] {1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int[] {1,2,3,4,5,4,3,2,45}));

        System.out.println("\nEjercicio 2");
        System.out.println("murcielago es isograma ? = "+ esIsograma("murcielago"));
        System.out.println("camaleon es isograma? = "+ esIsograma("camaleon"));

        System.out.println("\nEjercicio 3");
        String texto = """
                        La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?

            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.

                        
                                
                                """;
        int cantidadUnica= palabrasUnicas(texto);
        System.out.println("numero de palabras unicas: "+ cantidadUnica);
        
    }

    public boolean tieneDuplicados(int [] numeros ){
        Set<Integer> set = new HashSet<>();
        
        for(int n: numeros){
            if(!set.add(n)){
                return false;
            }
        } 
        return true;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> letras = new HashSet<>();

        for (char c : palabra.toLowerCase().toCharArray()) {
            if (letras.contains(c)) {
                return false; 
            }
        letras.add(c);
        }
        return true; // todas las letras fueron únicas
    }

    public int palabrasUnicas (String texto){
        String [] palabras = texto.split(" ");
        Set<String> unicas = new HashSet<>(); 

        for(String p : palabras){
            if(!p.isEmpty()){
                unicas.add(p);
            }
        }
        return unicas.size();
    }
}
