package avaliacao.formula1;

import java.util.Arrays;

public class Equipe {
    private String nome;
    private int anoFundacao;
    private Patrocinador[] patrocinadores;
    private Engenheiro engenheiroChefe;  // NOVO: equipe tem um engenheiro chefe

    public Equipe(String nome, int anoFundacao, Patrocinador[] patrocinadores, Engenheiro engenheiroChefe) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.patrocinadores = patrocinadores;
        this.engenheiroChefe = engenheiroChefe;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public Patrocinador[] getPatrocinadores() {
        return patrocinadores;
    }

    public Engenheiro getEngenheiroChefe() {  // NOVO getter
        return engenheiroChefe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public void setPatrocinadores(Patrocinador[] patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public void setEngenheiroChefe(Engenheiro engenheiroChefe) {  // NOVO setter
        this.engenheiroChefe = engenheiroChefe;
    }

    public double getValorTotalPatrocinio() {
        double total = 0;
        for (Patrocinador p : patrocinadores) {
            total += p.getValorPatrocinio();
        }
        return total;
    }

    public String toString() {
        return String.format("%s (Fundada em %d) - Engenheiro Chefe: %s - Patrocinadores: %s",
                nome, anoFundacao, engenheiroChefe.getNome(), Arrays.toString(patrocinadores));
    }
}