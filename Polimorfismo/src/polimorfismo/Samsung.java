package polimorfismo;
public class Samsung extends Teléfono{
    protected String procesador;

    public Samsung(String procesador, String modelo, String almacenamiento, String camara) {
        super(modelo, almacenamiento, camara);
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
   @Override //sobreescribimos el metodo de la clase anterior y agregamos los datos de esta clase
   // porque estamos eredando los datos de la clase anterior 
    public String mostrarDatos(){
        return "*****Samsung*****"+
                "\nmodelo: "+modelo+
                "\nalmacenamiento: "+almacenamiento+
                "\ncamara: "+camara+
                "\nprocesador: "+procesador;
   } 
}
