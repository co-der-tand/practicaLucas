
package practicaHerencia;


public class Jefe extends Empleado{
    
    private float incentivo;
    
    public Jefe(String nombre, String apellido, int edad, float sueldo){
        
        super(nombre, apellido, edad, sueldo);
    
    }
    
   
    @Override
    public float getSueldo(){
        
        float sueldo = super.getSueldo()+ incentivo;
        return sueldo;
        
    }
    
    public void incentivo(float extra){
        
        incentivo = extra;
        
    }
    
    @Override
    public String dameDescripcion(){
        
        return "Soy un jefe";
    }
    
}
