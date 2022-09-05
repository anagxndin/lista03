public class IdadeMedia {

    public static void main(String[] args) {
        
        Idades pessoa1 = new Idades("Maria Silva", 19);

        Idades pessoa2 = new Idades("João Melo", 20);

        float IdadeMedia = (pessoa1.getIdade() + pessoa2.getIdade())/2;

        System.out.println("Dados da primeira pessoa: \nNome: " + pessoa1.nome + "\nIdade: " + pessoa1.idade + "\nDados da segunda pessoa: \nNome: " + pessoa2.nome + "\nIdade: " + pessoa2.idade + "\nA idade média de " + pessoa1.nome + " e " + pessoa2.nome + " é de " + IdadeMedia);
    }
    
}
