/**
 * Representa uma localizacao no mapa
 * @author David J. Barnes and Michael Kolling and Luiz Merschmann
 */
public class Localizacao {
    private int x;
    private int y;

    /**
     * Representa uma localizacao na cidade
     * @param x Coordenada x: deve ser maior ou igual a 0.
     * @param y Coordenada y: deve ser maior ou igual a 0.
     */
    public Localizacao(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    /** 
     * Obtem a coordenada x da localizacao
     * @return int
     */
    public int getX() {
        return x;
    }

    
    /** 
     * Obtem a coordenada y da localizacao
     * @return int
     */
    public int getY() {
        return y;
    }
    
    /**
     * Verificacao de igualdade de conteudo de objetos do tipo Localizacao.
     * @return true: se a localizacao é igual.
     *         false: caso contrario.
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }else if(!(obj instanceof Localizacao)){
            return false;
        }else{
            Localizacao outro = (Localizacao) obj;
            return x == outro.x && y == outro.y;
        }
    }
    
    /**
     * @return A representacao da localizacao.
     */
    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    
    
}
