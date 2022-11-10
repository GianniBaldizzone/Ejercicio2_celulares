public class Iphone extends Celular {

    private String versionIOS;



    public Iphone( String modelo, int imei,String versionIOS) {
        super(modelo, imei);
        this.versionIOS = versionIOS;

    }
    public String getVersionIOS() {
        return versionIOS;
    }

    public void setVersionIOS(String versionIOS) {
        this.versionIOS = versionIOS;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "versionIOS='" + versionIOS + '\'' +
                "} " + super.toString();
    }
    @Override
    public void perderBateria(){
        System.out.println("Soy el celular "+this.getModelo()+" tenia "+ this.getBateria()+ "%");
        this.setBateria(this.getBateria()-0.1);
        System.out.println("Soy el celular "+this.getModelo()+" perdi bateria ahora me queda "+ this.getBateria()+"%");
    }
}
