
package concurrencia;


public class Instruccion {
    private int idProceso;
    private int tiempoEjecucion;
    
    public Instruccion(int idProceso, int tiempoEjecucion){
        this.idProceso = idProceso;
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }
}
