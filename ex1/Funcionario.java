

/**
 * Funcionario
 */
public class Funcionario {

    String nome;
    float ValorPorHora;
    float HorasTrabalhadas;


    
    public Funcionario(String nome, float valorPorHora, float horasTrabalhadas) {
        this.nome = nome;
        ValorPorHora = valorPorHora;
        HorasTrabalhadas = horasTrabalhadas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorPorHora() {
        return ValorPorHora;
    }
    public void setValorPorHora(float valorPorHora) {
        ValorPorHora = valorPorHora;
    }
    public float getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }
    public void setHorasTrabalhadas(float horasTrabalhadas) {
        HorasTrabalhadas = horasTrabalhadas;
    }

    

}