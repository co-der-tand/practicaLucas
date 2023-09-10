
package practicaHerencia;


public class Principal {
    
    public static void main(String[] args) {
        
        Jefe jefeGeneral = new Jefe("Horacio", "Cabello", 65, 215.74f);
        jefeGeneral.incentivo(100.65f);
        
        
        
        [] personas = new Persona[6];
        
        personas[0]= new Persona("Lucas", "Martin",42, 100.42f );
        personas[1]= new Persona("Matias", "Perez",28, 120.20f );
        personas[2]= new Persona("Norma", "Gonzales",35, 98.14f );
        personas[3]= new Persona("Pablo", "Alvarez",39, 140.45f );
        personas[4]= new Jefe("Laura", "Iñigues", 50,200.21f);
        personas[5]=jefeGeneral;
        
        Jefe jefeSegundo = (Jefe)personas[4];
        jefeSegundo.incentivo(98.65f);
        
             
                
          for(Persona p: personas){
    
            System.out.println("Nombre: "+p.getNombre()+
                    "\napellido: "+p.getApellido()+
                    "\nedad: "+ p.getEdad()+
                    "\nsueldo: "+p.getSueldo());
             System.out.println(" ");
          }
         
        
    }
    
  
    
 }
    

