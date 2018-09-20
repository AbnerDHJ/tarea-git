package polimorfismo;
public class iPhone extends Teléfono{
    private String bloqueo;

    public iPhone(String bloqueo, String modelo, String almacenamiento, String camara) {
        super(modelo, almacenamiento, camara);
        this.bloqueo = bloqueo;
    }

    public String getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(String bloqueo) {
        this.bloqueo = bloqueo;
    }
    
    @Override //sobreescribimos el metodo de la clase anterior y agregamos los datos de esta clase
    // porque estamos eredando los datos de la clase anterior 
    public String mostrarDatos(){
        return "*****iPhone*****"+
                "\nmodelo: "+modelo+
                "\nalmacenamiento: "+almacenamiento+
                "\ncamara: "+camara+
                "\nbloqueo: "+bloqueo;
   }
}
