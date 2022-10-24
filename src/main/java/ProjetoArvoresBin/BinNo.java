package ProjetoArvoresBin;


/**
 * Class BinNo
 * Árvores Binária
 * @param <T> tipo genérica
 */
public class BinNo<T extends Comparable<T>> {


    // Atributos
    private T conteudo;
    private BinNo<T> noEsq; // referência de nó esquerda
    private BinNo<T> noDir; // referência de nó a direita.


    //construtor
    public BinNo(T conteudo){
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }
    // construtor vazio
    public BinNo() {
    }

    // Getter e Setter
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    // toString exibe contéudo
    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
