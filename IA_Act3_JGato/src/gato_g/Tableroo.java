
package gato_g;


public class Tableroo {
    
    private int[][] tablero;

    /**
     * Constructor
     */
    public Tableroo() {
    }
 
    /**
     * Recibe un tablero ganador
     * @param tablero 
     */
    
    public void setTablero(int[][] tablero){
        this.tablero = tablero;
    }
    
    /**
     * 
     * @return un tablero ganador
     */
    public int[][] getTablero(){
        return this.tablero;
    }
    
}
