package biblioteca;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro("O Senhor dos Anéis");
        Periodico periodico = new Periodico("Revista Ciência Hoje", 42);

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Disponível: " + (livro.isDisponivel() ? "Sim" : "Não"));

        livro.emprestar();
        System.out.println("Disponível após empréstimo: " + (livro.isDisponivel() ? "Sim" : "Não"));

        livro.devolver();
        System.out.println("Disponível após devolução: " + (livro.isDisponivel() ? "Sim" : "Não"));
        System.out.println();

        System.out.println("Periódico: " + periodico.getTitulo());
        System.out.println("Volume: " + periodico.getVolume());
    }
}