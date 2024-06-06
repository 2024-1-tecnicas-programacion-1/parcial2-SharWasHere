
package parcial2;


public class Automovil extends Vehiculo{
    
    private int numeroPuertas;
    private TipoCombustible tipocombustible;
    
    public Automovil(String marca, String modelo, int año) {
        super(marca, modelo, año);
        
       this.tipocombustible=tipocombustible;
       this.numeroPuertas=numeroPuertas;

       
               
    }

   
     public String imprimirInformacion(){
        return super.imprimirInformacion() + ", "+numeroPuertas+" puertas, combustión a "+tipocombustible;
        
     }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipocombustible;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipocombustible(TipoCombustible tipocombustible) {
        this.tipocombustible = tipocombustible;
    }
    
}
