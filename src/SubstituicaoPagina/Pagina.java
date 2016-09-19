/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubstituicaoPagina;

/**
 *
 * @author sorcerer
 */
public class Pagina {
    private long tempo;
    private int M;
    private int R;

    public Pagina() {
    }
    
    public Pagina(long tempo, int R, int M) {
        this.tempo = tempo;
        this.R = R;
        this.M = M;
    }

    public long getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }  
}
