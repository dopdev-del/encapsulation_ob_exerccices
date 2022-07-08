public class Main {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setDatos("25", "Mario", "347-678-7878");
        String datos = persona.getDatos();
        System.out.println(datos);
    }

}

class Persona {
    private String edad;
    private String nombre;
    private String telefono;

    public void setDatos (String edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;

    }

    public String getDatos(){
        return this.nombre + " " + edad + " " +  telefono;

    }
}