/**
 * Mercearia
 */
public class Mercearia {
public static void main(String[] args) {
    
    Troco t = new Troco(8, 2, 20);

    float valorPagar = t.precoUnitario * t.quantidadeComprada;

    float troco = t.dinRecebido - valorPagar; 

    System.out.println("Preço unitário do produto: " + t.precoUnitario + "\nQuantidade comprada: " + t.quantidadeComprada + "\nDinheiro recebido: " + t.dinRecebido + "\nTROCO =  " + troco);
}
}