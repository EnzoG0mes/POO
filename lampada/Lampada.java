package Atividades;

// Representa uma lâmpada com comportamento básico (ligar/desligar).
// É o molde para criar objetos do tipo Lampada.
public class Lampada {

    // Armazena o estado da lâmpada: true (ligada) ou false (desligada).
    // Cada objeto terá seu próprio valor.
    private boolean estado;

    // Inicializa o objeto no momento da criação.
    // Recebe o estado inicial da lâmpada como parâmetro.
    public Lampada (boolean estado) {
        this.estado = estado;
    }

    // Exibe o estado atual da lâmpada.
    // Apenas mostra informação, sem alterar o valor do atributo.
    public void atual(){
        if (estado){
            System.out.println("A lâmpada está ligada.");
        }
        else{
            System.out.println("A lâmpada está desligada.");
        }
    }

    // Funciona como um interruptor: alterna o estado da lâmpada.
    // Se estiver ligada, desliga; se estiver desligada, liga.
    public void interruptor() {
        if (estado) {
            estado = false;
            System.out.println("Você desligou a lâmpada.");
        } else {
            estado = true;
            System.out.println("Você ligou a lâmpada.");
        }
    }

    // Permite alterar diretamente o estado da lâmpada.
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    // Retorna o estado atual da lâmpada.
    public boolean getEstado(){
        return estado;
    }

    // Usada para executar o programa.
    // Contém o metodo main, que é o ponto de entrada da aplicação.
    public static class Mostrar {
        public static void main(String[] args) {
            Lampada lampada = new Lampada(false);
            lampada.atual();
            lampada.interruptor();
            lampada.atual();
        }
    }
}