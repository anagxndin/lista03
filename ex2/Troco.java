public class Troco {
    float precoUnitario;
    int quantidadeComprada;
    float dinRecebido;


    
    public Troco(float precoUnitario, int quantidadeComprada, float dinRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidadeComprada = quantidadeComprada;
        this.dinRecebido = dinRecebido;
    }
    public float getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
    public float getDinRecebido() {
        return dinRecebido;
    }
    public void setDinRecebido(float dinRecebido) {
        this.dinRecebido = dinRecebido;
    }

    
}
