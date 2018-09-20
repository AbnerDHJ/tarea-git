package polimorfismo;
public class Huawei extends Teléfono{
   private String mCuentas; 

    public Huawei(String mCuentas, String modelo, String almacenamiento, String camara) {
        super(modelo, almacenamiento, camara);
        this.mCuentas = mCuentas;
    }

    public String getmCuentas() {
        return mCuentas;
    }

    public void setmCuentas(String mCuentas) {
        this.mCuentas = mCuentas;
    }
   
   @Override //sobreescribimos el metodo de la clase anterior y agregamos los datos de esta clase
   // porque estamos eredando los datos de la clase anterior 
   public String mostrarDatos(){
        return "*****Huawei*****"+
                "\nmodelo: "+modelo+
                "\nalmacenamiento: "+almacenamiento+
                "\ncamara: "+camara+
                "\nnumero de cuentas: "+mCuentas;
   }
}
