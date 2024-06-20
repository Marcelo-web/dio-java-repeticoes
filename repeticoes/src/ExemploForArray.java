public class ExemploForArray {
    public static void main(String[] args) {
        // Array = conjunto de elementos indexados pertencentes a um tipo correspondente.
        // Os arrays começam com índice zero (0).
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Percorrendo os elementos do array usando um contador pelo laço for, enquanto o mesmo for menor que o tamanho do array (quantidade de elementos).
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno de índice x=" + x + " é " + alunos[x]);
        }

        System.out.println();

        // Uso de forEach
        // Relacionado a um cenário que contenha array ou coleção para que seja feita a iteração pelos elementos.
        // Não são usados índices para que haja a iteração.
        // A cada execução a variável aluno recebe um novo valor da coleção. 
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
