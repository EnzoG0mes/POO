package alunos;

import java.util.Scanner;

public class Estudante {

    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    public void insereNotas() {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + " nota: ");
            notas[i] = teclado.nextDouble();
        }
    }

    public double calculaMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public double calculaMedia(int[] pesos) {
        double soma = 0;
        double somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return soma / somaPesos;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public double menorNota() {
        double menor = notas[0];

        for (double nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }

        return menor;
    }
}

