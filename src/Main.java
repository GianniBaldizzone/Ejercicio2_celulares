public class Main {
    public static void main(String[] args) {

        Persona Juliana = new Persona ("juliana","12345678","mujer");
        Persona Catalina = new Persona ("catalina","87654321","mujer");

        Motorola CelularJuliana = new Motorola("Motorola U9",172830483,"1.4.6");
        Iphone CelularCatalina = new Iphone("Iphone 8",372837283,"7.4.8");

        Juliana.usarCelular(CelularJuliana);
        Catalina.usarCelular(CelularCatalina);
        Juliana.hacerLlamada(CelularJuliana,CelularCatalina,Catalina);
    }
}


