package polimorfismo;
public class Galaxy extends Samsung{
    private String tamaño;

    public Galaxy(String tamaño, String procesador, String modelo, String almacenamiento, String camara) {
        super(procesador, modelo, almacenamiento, camara);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    @Override //sobreescribimos el metodo de la clase anterior y agregamos los datos de esta clase
    // porque estamos eredando los datos de la clase anterior 
    public String mostrarDatos(){
        return "*****Galaxy*****"+
                "\nmodelo: "+modelo+
                "\nalmacenamiento: "+almacenamiento+
                "\ncamara: "+camara+
                "\nprocesador: "+procesador+
                "\ntamaño: "+tamaño; 
   } 
    
}
