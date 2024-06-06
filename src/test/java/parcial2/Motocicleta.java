
package parcial2;


public class Motocicleta extends Vehiculo{
    private TipoMotocicleta tipomotocicleta;
    
    public Motocicleta(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }
    
    public String imprimirInformacion() {
        return (", " + tipomotocicleta);

    
}

    public void setTipomotocicleta(TipoMotocicleta tipomotocicleta) {
        this.tipomotocicleta = tipomotocicleta;
    }

    public TipoMotocicleta getTipomotocicleta() {
        return tipomotocicleta;
    }
}
