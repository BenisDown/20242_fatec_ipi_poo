public class VetorDinamico {
    private int qtde;
    private int cap;
    private int [] elementos;
    private static final int CAPACIDADE_MINIMA = 4;

    public void adicionar(int e){
        if(estaCheio()){
            redimensionar(2);
        }
        elementos[qtde] = e;
        qtde++;
    }

    private void redimensionar(double fator){
        int[] aux;
        aux = new int[(int)(cap * fator)];
        for (int i = 0; i < qtde; i++){
            aux[i] = elementos[i];
        }
        cap = (int) (cap * fator);
        elementos = aux;
    }

    public void remover(){
        if(!estaVazio()){
            qtde--;
        }
        if(estaUmQuartoCheio() && cap > CAPACIDADE_MINIMA){
            redimensionar(0.5);
        }
    }

    public boolean estaUmQuartoCheio(){
        return qtde <= cap / 4;
    }

    public boolean estaVazio(){
        return qtde == 0;
    }

    public boolean estaCheio(){
        return qtde == cap;
        // if(qtde == cap)
        // return true;
    }

    public VetorDinamico(int cap){
        if (cap >= 4){
            elementos = new int[cap];
            this.cap = cap;
        }
        else{
            elementos = new int[4];
            this.cap = 4;
        }
        // elementos = cap >= 4 ? new int[cap] : new int[4];
    }

    public String toString(){
        var sb = new StringBuilder("");
        sb.append("qtde: ").append(qtde).append(", cap: ").append(cap).append("\n");
        for(var i = 0; i < qtde; i++)
            sb.append(elementos[i]).append(" ");
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}
