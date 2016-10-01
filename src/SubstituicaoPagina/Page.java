/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubstituicaoPagina;

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

    public Page(){
    }
    
    public Page(int pagina, int tempoCarregado, int tempoUltimaRef, int bitR, int bitM) {
        this.pagina = pagina;
        this.tempoCarregado = tempoCarregado;
        this.tempoUltimaRef = tempoUltimaRef;
        this.bitR = bitR;
        this.bitM = bitM;
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

    @Override
    public String toString() {
        return ""+pagina;
    }
    
    
}
