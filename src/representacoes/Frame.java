/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representacoes;

/**
 *
 * @author horgun
 */
public class Frame {
    private int moldura;
    private Page page;

    public Frame() {
    }

    public Frame(int moldura, Page page) {
        this.moldura = moldura;
        this.page = page;
    }

    public int getMoldura() {
        return moldura;
    }

    public void setMoldura(int moldura) {
        this.moldura = moldura;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object obj) {
        Frame f = (Frame) obj;
        if (f.getPage() != null && f.getPage().equals(getPage()))
            return true;
        return false;
    }
    
    
}
