
package Controlador;

import javax.swing.JOptionPane;

public class FloydWarshall {
    
// METODO DE ELEGIR EL RECORRIDO ELEGIDO POR EL USUARIO
 
    public int[][] shortestpath(int[][] adj, int[][] path){
        int n = adj.length;
        int[][] ans = new int[n][n];
        copy(ans, adj);
    	for (int k=0; k<n;k++) 
            for (int i=0; i<n; i++) 
        	for (int j=0; j<n;j++) 
                    if (ans[i][k]+ans[k][j] < ans[i][j]) {
                        ans[i][j] = ans[i][k]+ans[k][j];
          		        path[i][j] = path[k][j];
                    }
    	return ans;
    }
    
    public void copy(int[][] a, int[][] b) 
    {
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a[0].length;j++)
                a[i][j] = b[i][j];
    }
    
    //Metodo de imprimir el recorrido que el usuario deseo 
    public void imprimir(Grafo g, int [][] adj, int posO, int posD){
        
        int[][] shortpath;
        int[][] path = new int[adj.length][adj.length];

        for (int i=0; i<adj.length; i++)
            for (int j=0; j<adj.length; j++)
                if (adj[i][j] == 10000)
                    path[i][j] = -1;
    		else
                    path[i][j] = i;
    	for (int i=0; i<adj.length; i++)
            path[i][i] = i;

    	shortpath = shortestpath(adj, path);
        
       
    	int start = posO;
    	int end = posD;
        
        
        String myPath = ((Ciudad)g.getCiudades().obtenerValorDe(end)).getNombreCiudad() + "";
    	while (path[start][end] != start) {
            
            myPath = ((Ciudad)g.getCiudades().obtenerValorDe(path[start][end])).getNombreCiudad() + " >>> " + myPath;
            end = path[start][end];
    	}
        
            if(g.existeVuelo((Ciudad)g.getCiudades().obtenerValorDe(start), (Ciudad)g.getCiudades().obtenerValorDe(end))){
                myPath = ((Ciudad)g.getCiudades().obtenerValorDe(start)).getNombreCiudad() + " >>> " + myPath;
                JOptionPane.showMessageDialog(null, "Esta es la menor ruta:\n" + myPath, "Ruta menor", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null, "Esta es la menor ruta:\n", "Ruta menor", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
 }
