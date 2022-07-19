
package Controlador;

import javax.swing.JOptionPane;


public class Dijkstra {
    
    // METODO DE ELEGIR EL RECORRIDO QUE DESEE EL USUARIO
     public void masCorto(Grafo g, int[][] adj, String a, int destino) {
        
        //Declarando aux
        int[] distancia = new int[adj.length];
        int[] visitado = new int[adj.length];
        int[] camino = new int[adj.length];
        int min;
        int siguiente = numVertice(a, adj, g);
        for (int i = 0; i < adj.length; i++) {
            visitado[i] = 0;
            camino[i] = numVertice(a, adj, g);
        }
        distancia = adj[numVertice(a, adj, g)];
        distancia[numVertice(a, adj, g)] = 0;
        visitado[numVertice(a, adj, g)] = 1;

        for (int i = 0; i < adj.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < adj.length; j++) {
                if (min > distancia[j] && visitado[j] != 1) {
                    min = distancia[j];
                    siguiente = j;
                }
            }
            visitado[siguiente] = 1;

            for (int z = 0; z < adj.length; z++) {

                if (visitado[z] != 1) {

                    if (min + adj[siguiente][z] < distancia[z]) {
                        distancia[z] = min + adj[siguiente][z];
                        camino[z] = siguiente;

                    }
                }
            }
        }
       
        String caminito = "";
        
        //Imprimiendo el camino que el usuario eligio
        for (int i = 0; i < adj.length; i++) {
            
            if(i == destino){
                if (i != numVertice(a, adj, g)) {
                    int j;
                    caminito += ("La ruta de menor tiempo es:\n" + ((Ciudad)g.getCiudades().obtenerValorDe(i)).getNombreCiudad());
                    j = i;

                    do {
                        j = camino[j];
                            caminito += (" <<< " + ((Ciudad)g.getCiudades().obtenerValorDe(j)).getNombreCiudad());
                            
                    } while (j != numVertice(a,adj, g));
                } else {
                    caminito += ("La ruta de menor tiempo es:\nYa estabas ahi...");
                }
                JOptionPane.showMessageDialog(null, caminito, "Ruta  menor", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
    
    //Metodo numVertice sirve para hallar posicion en la que se encuentra la ciudad
    public int numVertice(String n, int[][] adj, Grafo g) {
        boolean encontrado = false;
        for (int i = 0; (i < adj.length) && !encontrado;) {
            encontrado = ((Ciudad)g.getCiudades().obtenerValorDe(i)).getNombreCiudad().equals(n);
            if (!encontrado) {
                i++;
            }else{
                return i;
            }
        }
        return 0;
    }
    
}
