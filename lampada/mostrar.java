package Atividades;

public class mostrar{

    public static void main(String[] args) {
        Lampada lampada = new Lampada(false);

        lampada.atual();
        lampada.interruptor();
        lampada.atual();
    }
}