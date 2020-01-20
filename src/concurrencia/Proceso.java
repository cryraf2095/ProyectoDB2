
package concurrencia;


import herramientas.Herramienta;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Proceso extends Thread{
    
    private int identif;
    private Procesador procesador;
    private LinkedList listaInstrucciones = new LinkedList();
    private LinkedList listaEjecutadas = new LinkedList();
    private JTextArea pendientes;
    private JTextArea realizadas;
    private Herramienta herramienta = new Herramienta();
    private JLabel procesoInf;

    public Proceso(int identif, Procesador procesador, int[] listaInstrucciones, JTextArea pendientes, JTextArea realizadas, JLabel procesoInf) {
	this.identif = identif;
	this.procesador = procesador;
        for (int i = 0; i < listaInstrucciones.length; i++) {
            this.listaInstrucciones.add(listaInstrucciones[i]);
        }
        this.pendientes = pendientes;
        this.realizadas = realizadas;
        this.procesoInf = procesoInf;
    }

    public void run() {
        try {
            procesoInf.setText("Proceso " + identif + ": Iniciado");
            System.out.println("Proceso " + identif + ": Iniciado");
            Thread.sleep(2000);  
            procesoInf.setText("Proceso " + identif + ": Bloqueado");
            System.out.println("Proceso " + identif + ": Bloqueado");
            while(!listaInstrucciones.isEmpty()){
                pendientes.setText(herramienta.convertirLista(listaInstrucciones));
                int tiempoInstruccion = (int)listaInstrucciones.removeFirst();
                listaEjecutadas.add(tiempoInstruccion);
                procesador.realizarInstruccion(new Instruccion(identif,tiempoInstruccion), procesoInf);
                realizadas.setText(herramienta.convertirLista(listaEjecutadas));
            }
            pendientes.setText("");
            procesoInf.setText("Proceso " + identif + ": Terminado");
            System.out.println("Proceso " + identif + ": Terminado");
        } catch (InterruptedException ex) {
            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
