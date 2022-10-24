package ProjetoArvoresBin;

/**
 * Classe Árvore Binária
 * Tipo genérica implementado a interface comparable.
 * @param <T>
 */
public class ArvoresBinaria<T extends Comparable<T>>{

    // Atributo
    private BinNo<T> raiz;

    //Construtor
    public ArvoresBinaria() {
        this.raiz = null;
    }

    /**
     * Método inserir externa classe
     * @param conteudo
     */
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo); // cria novoNo e instanciado novoNo recebe o conteudo.
        raiz = inserir(raiz, novoNo);           // raiz recebe inserir sobre carga dentro inserir recebe a raiz e novoNo.
    }

    /**
     * Método privado inserir
     * Sobre carga
     * @param atual
     * @param novoNo
     * @return
     */
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){ // raiz entra nesse método como nó atual.
        if (atual == null){ // condição caso for nulo nó novo esta na raiz.
            return novoNo;  // se for nulo o nó novo retorna, porque ele está sendo inserindo.

        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) { // condição é para comparar se contéudo do novoNo menor que contéudo do nó atual.
          atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));  // se for isso o nó atual vai para esquerda testando se é menor, função inserir faz referência do novoNo.

        }else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo)); // se novoNo for maior nó vai para direita.
        }
        return atual; // retorna nó atual.


    }

}
