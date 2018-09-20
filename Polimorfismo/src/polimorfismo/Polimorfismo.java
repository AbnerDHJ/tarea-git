
package polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Teléfono misTeléfonos[] = new Teléfono[3];
        Galaxy galax = new Galaxy("15","gax12","asd123","128GB","12MGP");
        
        
        misTeléfonos[0] = new iPhone("faceId","123asd","256GB","12MGP");
        misTeléfonos[1] = new Samsung("gax32","123asd","32GB","12MGP");
        misTeléfonos[2] = new Huawei("5","123asd","64GB","12MGP");
        
        for (Teléfono Teléfono: misTeléfonos){
           System.out.println(Teléfono.mostrarDatos());
           System.out.println(" ");
         
        }
        System.out.println(galax.mostrarDatos());
    }
    
}
