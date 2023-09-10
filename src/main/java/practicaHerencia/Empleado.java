
package practicaHerencia;

 public  class Empleado{
    
    
    private String apellido;
    private int edad;
    private float sueldo;

    public Empleado(String nombre, String apellido, int edad, float sueldo) {
        
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

   

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public float getSueldo() {
        return sueldo;
    }
    
   
    
    
}
