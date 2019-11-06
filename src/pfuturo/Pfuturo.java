
 
package pfuturo;

public class Pfuturo {
 static String veredicto(String modulos, String horas) {
        if (modulos.equals(horas)) {
          return "Bien. Pero una hora de estudio para cada mÃ³dulo puede ser insuficiente.";}
  
        if (Integer.valueOf(modulos)>Integer.valueOf(horas)){
          return "Poco tiempo de estudio. Debes dedicar mÃ¡s tiempo.";}
 
        return "Ideal. Trabajas los contenidos en casa.";
    }
   
    public static void main(String[] args) {
      String resultado=veredicto(args[1],args[2]);
       
       System.out.println("Estudiante: " + args[0]);
       System.out.println(resultado);
   
    }
    
}
