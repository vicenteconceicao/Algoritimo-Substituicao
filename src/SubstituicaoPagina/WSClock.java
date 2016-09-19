/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubstituicaoPagina;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sorcerer
 */
public class WSClock {
    
    private ArrayList<Pagina> paginas;
    private int tempoVirtualAtual;
    private long time;
    private final int tamanhoLista;
    private int paginaAtual;

    /**
     * 
     * @param tamanhoLista Tamanho da memória princial
     * @param tempoVirutal Tempo virtual do Sistema 
     * @param time Tempo limite para cada página na memória
     */
    public WSClock(int tamanhoLista, int tempoVirutal, long time) {
        
        //Lista de molduras de página
        this.paginas = new ArrayList<>();
        this.tamanhoLista = tamanhoLista;
        this.tempoVirtualAtual = tempoVirutal;
        this.time = time;
        this.paginaAtual = 0;
    }
    
    public void solicitarPagina(Pagina pagina){
        //Verificando se a lista circular tem espaço
        if(this.paginas.size() < this.tamanhoLista){
            //Verificando e a página já está na memória
            if(!paginas.contains(pagina)){
                //Se não estiver na memória, será add
                System.out.println("Falta de Página - Lista não está cheia. Adicionando...");
                this.paginas.add(pagina);
                this.paginaAtual++;
            }else{
                //Se estiver na memória, seus dados serão att 
                this.paginas.get(paginas.indexOf(pagina)).setM(1);
                this.paginas.get(paginas.indexOf(pagina)).setR(1);
                this.paginas.get(paginas.indexOf(pagina)).setTempo(1000);
                
            }
        }else{
        //Caso não tenha espaço, será necessário aplicar o algorítmo WSClock
            if(!paginas.contains(pagina)){
                //Se não estiver na memória, será solicitado o algoritmo de substituição
                System.out.println("Falta de Página - Lista está chegia. Executando WSClock...");
                substituirPagina(pagina);
            }else{
                //Se estiver na memória, seus dados serão att 
                
            }
        }
        
    }
    
    void substituirPagina(Pagina pagina){
        Pagina atual;
        
        while(true){
            if(paginaAtual < tamanhoLista){
                System.out.println(pagina);
                atual = paginas.get(paginaAtual);
                if(atual.getR() == 1){
                    atual.setR(0);
                    //Ponteiro para a próxima página
                    paginaAtual++;

                }else if(atual.getR() == 0){
                    System.out.println(this.tempoVirtualAtual - atual.getTempo()+" > "+time);
                    if(this.tempoVirtualAtual - atual.getTempo() > time){
                        System.out.println("Página com tempo "+pagina.getTempo()+" Foi substituida na posição: "+paginaAtual);
                        paginas.set(paginaAtual, pagina);
                        paginaAtual++;
                        break;
                    }else{
                        paginaAtual++;
                    }
                }
            }else{
                // A cada ciclo do relógio, 50 será adicionado ao tempo virtual
                this.tempoVirtualAtual+= 50;
                paginaAtual = 0;
            }
        }
    }

    @Override
    public String toString() {
        String lista = "";
        for (Pagina pagina : paginas) {
            lista = lista +" |"+ pagina.getTempo()+"|"+pagina.getR()+"|"+pagina.getM()+"| ->";
            
        }
        return lista;
    }
    
    

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public int getTempoVirtualAtual() {
        return tempoVirtualAtual;
    }

    public void setTempoVirtualAtual(int tempoVirtualAtual) {
        this.tempoVirtualAtual = tempoVirtualAtual;
    }
}
