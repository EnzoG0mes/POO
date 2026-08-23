package biblioteca;

public class Livro extends Publicacao {

    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}