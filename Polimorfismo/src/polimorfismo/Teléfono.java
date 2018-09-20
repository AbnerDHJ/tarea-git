package polimorfismo;

public class Teléfono {
    protected String modelo;
    protected String almacenamiento;
    protected String camara;

    public Teléfono(String modelo, String almacenamiento, String camara) {
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.camara = camara;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }
    public String mostrarDatos(){
        return "\nmodelo: "+modelo+
                "\nalmacenamiento: "+almacenamiento+
                "\ncamara: "+camara;
   }
}