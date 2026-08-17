package avaliacao.formula1;

public class CarroF1 {
    private int numero;
    private int posicao;
    private Equipe equipe;
    private Piloto piloto;

    public CarroF1(int numero, int posicao, Equipe equipe, Piloto piloto) {
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
    }

    public int getNumero() {
        return numero;
    }

    public int getPosicao() {
        return posicao;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void exibirInformacoes() {
        System.out.println("=== CARRO #" + numero + " ===");
        System.out.println("Posição atual: " + posicao + "º lugar");
        System.out.println("Equipe: " + equipe.getNome());
        System.out.println("Piloto: " + piloto);
        System.out.println("Patrocinadores da equipe:");
        for (Patrocinador p : equipe.getPatrocinadores()) {
            System.out.println("  - " + p);
        }
        System.out.println("Valor total de patrocínio: R$ " +
                String.format("%.2f", equipe.getValorTotalPatrocinio()) + " milhões");
        System.out.println();
    }
}