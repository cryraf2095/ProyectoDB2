
package herramientas;

import java.util.LinkedList;


public class Herramienta {
    public int[] convertirTexto(String texto){
        String[] arregloTexto = texto.split("\n");
        int[] arregloInt = new int[arregloTexto.length];
        for (int i = 0; i < arregloTexto.length; i++) {
            arregloInt[i] = Integer.parseInt(arregloTexto[i]);
        }
        return arregloInt;
    }
    public String convertirLista(LinkedList instrucciones){
        String text = "";
        for (int i = 0; i < instrucciones.size(); i++) {
            text += instrucciones.get(i) + "\n";
        }
        return text;
    }
}
