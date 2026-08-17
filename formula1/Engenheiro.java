package avaliacao.formula1;

public class Engenheiro extends Pessoa {  // HERANÇA: Engenheiro herda de Pessoa
    private String especialidade;  // atributo específico do Engenheiro

    public Engenheiro(String nome, int idade, String nacionalidade, String especialidade) {
        super(nome, idade, nacionalidade);  // atributos herdados de Pessoa
        this.especialidade = especialidade;  // atributo específico do Engenheiro
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        // Sobrescreve o toString() de Pessoa adicionando a especialidade
        return String.format("%s (%d anos, %s) - Especialidade: %s",
                getNome(), getIdade(), getNacionalidade(), especialidade);
    }
}