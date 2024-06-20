public class ExemploBreakContinue {
    public static void main(String[] args) {

        // break => interrompe o laço quando atende a uma condição interna do bloco.
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
            System.out.println(numero);

        }
        // O resultado acima mostra:
        //1
        //2

        System.out.println();

        // continue => desconsidera/pula uma iteração quando atende a uma condição interna do bloco e continua a executar até que a condição do laço se torne falsa. Desta forma, sairá do laço.
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;
            System.out.println(numero);
        }
        
        // O resultado acima  mostra:
        // 1
        // 2
        // 4
        // 5

        System.out.println();

        // Pode ser usado para exibir números pares ou ímpares, por exemplo.
        // Abaixo são exibidos apenas os números pares entre 1 a 10.
        for (int numero = 1; numero <= 10; numero++) {
            if (numero % 2 != 0)
                continue;
            System.out.print(numero + " ");
        }
        
        // Resultado acima: 2 4 6 8 10

        System.out.println();

    }
}
