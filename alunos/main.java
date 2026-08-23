package alunos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        String nome = scanner.nextLine();

        Estudante estudante = new Estudante(nome);

        System.out.println("Nome do estudante: " + estudante.getNome());
        estudante.insereNotas();

        System.out.println("Notas de " + estudante.getNome() + ": " + Arrays.toString(estudante.getNotas()));
        System.out.println("Média de " + estudante.getNome() + ": " + estudante.calculaMedia());
        System.out.println("Menor nota de " + estudante.getNome() + ": " + estudante.menorNota());
        scanner.close();
    }
}