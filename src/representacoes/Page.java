/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representacoes;

import java.util.ArrayList;

/**
 *
 * @author horgun
 */
public class Page {
    private int pagina;
    private long tempoCarregado;
    private long tempoUltimaRef;
    private int bitR;
    private int bitM;
    private String history;
    
    public Page(){
    }
    
    public Page(int pagina, int tempoCarregado, int tempoUltimaRef, int bitR, int bitM, String history) {
        this.pagina = pagina;
        this.tempoCarregado = tempoCarregado;
        this.tempoUltimaRef = tempoUltimaRef;
        this.bitR = bitR;
        this.bitM = bitM;
        this.history = history;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public long getTempoCarregado() {
        return tempoCarregado;
    }

    public void setTempoCarregado(long tempoCarregado) {
        this.tempoCarregado = tempoCarregado;
    }

    public long getTempoUltimaRef() {
        return tempoUltimaRef;
    }

    public void setTempoUltimaRef(long tempoUltimaRef) {
        this.tempoUltimaRef = tempoUltimaRef;
    }

    public int getBitR() {
        return bitR;
    }

    public void setBitR(int bitR) {
        this.bitR = bitR;
    }

    public int getBitM() {
        return bitM;
    }

    public void setBitM(int bitM) {
        this.bitM = bitM;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return ""+pagina;
    }
    
    
}
