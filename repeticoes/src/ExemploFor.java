public class ExemploFor {
    public static void main(String[] args) {

        /** A variável inicial (carneirinhos) recebe um valor ; A condição é avaliada; Sendo verdadeira, o bloco é executado. A variável então é incrementada. A condição é reavaliada. E o ciclo se repete enquanto a variável for menor ou igual a 20 */
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contanto carneirinhos: " + carneirinhos);
        }

        System.out.println("Joãozinho dormiu...");

        System.out.println();

        /** A estrutura do bloco for pode ser desmembrada na variável contador sendo declarada com o valor inicial fora do laço for e incrementada dentro do bloco caso atenda a condição */
        int ovelhinhas = 1;
        for (; ovelhinhas <= 5;) {
            System.out.println(ovelhinhas + " - ovelhinha(s)");
            ovelhinhas++;
        }

    }
}
