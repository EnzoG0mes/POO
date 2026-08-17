package avaliacao.formula1;

public class Piloto extends Pessoa {  // HERANÇA: Piloto herda atributos e métodos de Pessoa

    // Piloto herda: nome, idade, nacionalidade da classe Pessoa
    // Não precisa declarar essas variáveis novamente

    public Piloto(String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);  // chama o construtor da superclasse Pessoa
    }

    // Piloto herda os getters e setters de Pessoa
    // Não precisa reescrever getNome(), getIdade(), getNacionalidade()

    // toString() também é herdado, então podemos usar o da classe Pessoa
}