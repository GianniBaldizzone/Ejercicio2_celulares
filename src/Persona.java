public class Persona {
    private String nombre;
    private String dni;
    private String genero;

    public Persona(String nombre, String dni ,String genero) {
        this.nombre = nombre;
        this.dni = dni;
        this.genero = genero;
    }


    public void usarCelular(Celular celular){
    System.out.println("soy la persona "+this.getNombre()+"y su celular es "+ celular.getModelo()); // this se utiliza para referenciar al objeto o clase que este usando el metodo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void hacerLlamada(Celular nuestro, Celular otro, Persona receptor){
        System.out.println("soy "+this.getNombre()+" estoy llamando a "+receptor.getNombre());
        nuestro.perderBateria();
        otro.perderBateria();
        System.out.println("Termina la llamada...");
    }
}
