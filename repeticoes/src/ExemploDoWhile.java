import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        /**
         * Do While
         * 
         * Primeiro é executado o bloco de código (pelo menos uma vez) para depois ser testada a condição. O ciclo é feito enquanto a condição for verdadeira. Caso contrário, não permanecerá no laço e seguirá o fluxo de execução.
         * 
         * Exemplo
         * Joãozinho resolveu ligar para o seu amigo, dizendo que hoje se entupiu de comer docinhos. A proposta é: Enquanto ele ficar discando, ele vai ficar aguardando seu colega atender. Quando o seu colega atender, o controle de fluxo é interrompido e ele parte para a etapa de conversação.
         *  
         */
        
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando...");

        } while (tocando());
        
        System.out.println("Alô !!!");
    }

    public static boolean tocando() {
        // Um número aleatório é gerado entre 0 (inclusive) até 3 (exclusivo).
        int numeroAleatorio = new Random().nextInt(3);

        // Caso o número seja igual a 1, significa que ele atendeu.
        boolean atendeu =  numeroAleatorio == 1;
        System.out.println("Atendeu? " + (atendeu ? "Sim" : "Não"));

        // Se atendeu, não está mais tocando o telefone.
        return !atendeu;
    }
}
