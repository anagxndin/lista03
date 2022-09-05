package ex8;

/**
 * Funcionario
 */
public class Funcionario {

    String nome;
    double salarioBruto;
    double imposto;
    
    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public double getImposto() {
        return imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }


    public double buscasSalarioLiquido(){
        return imposto;  
    }

    public void aumentarSalario(double porcentagem){

    }

}