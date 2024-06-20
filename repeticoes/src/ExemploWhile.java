import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        /**
         * While
         * 
         * - Enquanto uma condição for atendida(verdadeira), o bloco é executado. Quando a condição deixa de ser atendida(falsa), sai do bloco e continua o fluxo de execução após o laço.
         * - Neste laço, primeiro a condição é avaliada; para depois executar o código do bloco(se a mesma for atendida)
         * - Caso de início a condição não seja atendida, o laço não é executado.
         * - A variável do contador dentro do while deve ser sempre atualizada para que possa ser avaliada durante a condição e o laço não seja infinito.
         * - Se um laço while receber como condição um valor true literal, deve ter uma condição de parada, como o uso da palavra reservada break para interromper o laço e não gerar um laço infinito.
         */

         // Exemplo de estudo
         /*
          * Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.
          */

         double mesada = 50.00;
         double valorParcialGasto = 0.0;
         while (mesada > 0) {
             double valorDoce = valorAleatorio();
             if (valorDoce > mesada)
                 valorDoce = mesada;

             System.out.println("Doce de valor: " + valorDoce + " Adicionado ao carrinho.");
             mesada -= valorDoce;
             valorParcialGasto += valorDoce;
             System.out.println("Valor parcial gasto: " + String.format("%.2f", valorParcialGasto));
         }
         System.out.println("Mesada: " + mesada);
         System.out.println("Joãozinho gastou toda a sua mesada em doces.");
    }

    public static double valorAleatorio() {
        double valor = ThreadLocalRandom.current().nextDouble(2, 8);
        String valorFormatado = String.format("%.2f", valor).replace(",", ".");
        return Double.valueOf(valorFormatado);
    }
}
