package gato_g;

import java.util.ArrayList;


public class Eventos {
    private Tableroo tg;
    private final ArrayList<Tableroo> listaTablero;
    
    public Eventos(){
        listaTablero = new ArrayList();
        crearMatriz();
    }        
    
    /**
     *Verifica posibles lineas en la matriz para ver si existe ganador segun los turnos X ó O
     */
    public final boolean verificarLinea(int[][] partida, int s) {                             
        for (int i = 0; i < partida.length; i++) {
            //Lineas horizontales
            if (partida[i][0] == s && partida[i][1] == s && partida[i][2] == s) 
                return true;
            else //Lineas verticales
                if (partida[0][i] == s && partida[1][i] == s && partida[2][i] == s) 
                    return true;
        }
        //Lineas diagonales
        if ((partida[0][0] == s && partida[1][1] == s && partida[2][2] == s)) 
            return true;
         else if ((partida[0][2] == s && partida[1][1] == s && partida[2][0] == s)) 
            return true;
        return false;
    }
    
    //verifica si el vector de la partida se ha completado condicionado al no haber 3 3n raya en ninguna posicion.
     
    public final boolean casoEmpate(int[][] partida){
        for (int[] partida1 : partida) {
            for (int j = 0; j < partida1.length; j++) {
                if (partida1[j] == -1)  
                    return false;
            }
        }
        return true;
    }
    
    //verifica si el vector de la partida se ha completado en raya.
    
  
    public int[] Raya(int[][] partida){
        for (int i = 0; i < partida.length; i++) {
            for (int j = 0; j < partida.length; j++) {
                if (partida[i][j] == -1)
                    return new int[]{i,j};
            }
        }
        return null;
    }    
    
    //Este metodo bloquea las casilla del jugador donde tiene una jugada.
    
    public int[] bloquearJuego(int[][] partida, int s, int ss){        
        for (int i = 0; i < partida.length; i++) {
             //Empezamos a recorre los ejes horizontales
            //Empezamos a recorre los ejes verticales
            if (partida[i][0] == s && partida[i][1] == s && partida[i][2] != ss) 
                return new int[]{i,2};                      //i = 0,2 - 1,2 - 2,2
            else if (partida[i][0] == s && partida[i][2] == s && partida[i][1] != ss) 
                return new int[]{i,1};                      //i = 0,1 - 1,1 - 2,1
            else if (partida[i][1] == s && partida[i][2] == s && partida[i][0] != ss) 
                return new int[]{i,0};                      //i = 0,0 - 1,0 - 2,0
           else if (partida[0][i] == s && partida[1][i] == s && partida[2][i] != ss) 
                return new int[]{2,i};                      //i = 2,0 - 2,1 - 2,2
           else if (partida[0][i] == s && partida[2][i] == s && partida[1][i] != ss) 
                return new int[]{1,i};                      //i = 1,0 - 1,1 - 1,2
            else if (partida[1][i] == s && partida[2][i] == s && partida[0][i] != ss) 
                return new int[]{0,i};                      //i = 0,0 - 0,1 - 0,2
        }
        //Recorrer las diagonales
        if ((partida[0][0] == s && partida[2][2] == s && partida[1][1] != ss) || 
                (partida[0][2] == s && partida[2][0] == s && partida[1][1] != ss)) 
                return new int[]{1,1};                      //i = 1,1
        else if (partida[0][0] == s && partida[1][1] == s && partida[2][2] != ss) 
                return new int[]{2,2};                      //i = 2,2
        else if (partida[1][1] == s && partida[2][2] == s && partida[0][0] != ss) 
                return new int[]{0,0};                      //i = 0,0
        else if (partida[0][2] == s && partida[1][1] == s && partida[2][0] != ss) 
                return new int[]{2,0};                      //i = 2,0
        else if (partida[1][1] == s && partida[2][0] == s && partida[0][2] != ss) 
                return new int[]{0,2};                      //i = 0,2
        return null;
    }    
    /**
     *Determinar el tablero contrincante a jugar
     * @return un tablero aleatorio para jugar
     */
    public int[][] vsTablero(){        
        int i = (int) Math.floor(Math.random()*(listaTablero.size()));
        return listaTablero.get(i).getTablero();
    }
    
    /**
     * El método crearTableros crea los tableros ganadores de la máquina.
     */
    private void crearMatriz(){
            //Matriz de gane 1
            tg = new Tableroo();
            tg.setTablero(new int[][]{{0, -1, 0}, 
                                      {0, 0, -1}, 
                                      {0, -1, 0}});
            listaTablero.add(tg);
            
            //Matriz de gane 2
            tg = new Tableroo();
            tg.setTablero(new int[][]{{0, 0, 0}, 
                                     {-1, 0, -1}, 
                                     {0, -1, 0}});
            listaTablero.add(tg);
            
            //Matriz de gane 3
            tg = new Tableroo();
            tg.setTablero(new int[][]{{0, -1, 0}, 
                                      {-1, 0, 0}, 
                                      {0, -1, 0}});
            listaTablero.add(tg);
            
            //Matriz de gane 4
            tg = new Tableroo();
            tg.setTablero(new int[][]{{0, -1, 0}, 
                                      {-1, 0, -1}, 
                                      {0, 0, 0}});
            listaTablero.add(tg);
            
            //Matriz de gane 5
            tg = new Tableroo();
            tg.setTablero(new int[][]{{-1, 0, -1}, 
                                      {0, 0, 0}, 
                                      {-1, 0, -1}});
            listaTablero.add(tg);
    
    }
    
}
