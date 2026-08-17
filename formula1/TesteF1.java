package avaliacao.formula1;

public class TesteF1 {
    public static void main(String[] args) {

        // Criando engenheiros chefes para cada equipe
        Engenheiro engenheiroMercedes = new Engenheiro("Toto Wolff", 53, "Austríaco", "Gestão Esportiva");
        Engenheiro engenheiroAstonMartin = new Engenheiro("Dan Fallows", 51, "Britânico", "Aerodinâmica");
        Engenheiro engenheiroAlpine = new Engenheiro("Bruno Famin", 62, "Francês", "Engenharia Automotiva");

        // Criando patrocinadores
        Patrocinador[] patrocinadoresMercedes = {
                new Patrocinador("Petronas", 60.0),
                new Patrocinador("INEOS", 45.0),
                new Patrocinador("Monster", 25.0)
        };

        Patrocinador[] patrocinadoresAstonMartin = {
                new Patrocinador("Aramco", 90.0),
                new Patrocinador("Cognizant", 40.0),
                new Patrocinador("Peroni", 18.0),
                new Patrocinador("JCB", 22.0)
        };

        Patrocinador[] patrocinadoresAlpine = {
                new Patrocinador("BWT", 50.0),
                new Patrocinador("Castrol", 30.0),
                new Patrocinador("Binance", 35.0)
        };

        // Criando equipes com engenheiros chefes
        Equipe mercedes = new Equipe("Mercedes AMG F1", 2010, patrocinadoresMercedes, engenheiroMercedes);
        Equipe astonMartin = new Equipe("Aston Martin F1 Team", 2021, patrocinadoresAstonMartin, engenheiroAstonMartin);
        Equipe alpine = new Equipe("BWT Alpine F1 Team", 2021, patrocinadoresAlpine, engenheiroAlpine);

        // Criando pilotos (herdam de Pessoa)
        Piloto hamilton = new Piloto("Lewis Hamilton", 39, "Britânico");
        Piloto russell = new Piloto("George Russell", 26, "Britânico");
        Piloto alonso = new Piloto("Fernando Alonso", 42, "Espanhol");
        Piloto stroll = new Piloto("Lance Stroll", 25, "Canadense");
        Piloto gasly = new Piloto("Pierre Gasly", 28, "Francês");
        Piloto ocon = new Piloto("Esteban Ocon", 27, "Francês");

        // Criando carros
        CarroF1 carro44 = new CarroF1(44, 1, mercedes, hamilton);
        CarroF1 carro63 = new CarroF1(63, 3, mercedes, russell);
        CarroF1 carro14 = new CarroF1(14, 2, astonMartin, alonso);
        CarroF1 carro18 = new CarroF1(18, 5, astonMartin, stroll);
        CarroF1 carro10 = new CarroF1(10, 4, alpine, gasly);
        CarroF1 carro31 = new CarroF1(31, 6, alpine, ocon);

        // Exibindo informações
        System.out.println("=== GRID ===\n");

        carro16.exibirInformacoes();
        carro55.exibirInformacoes();
        carro1.exibirInformacoes();
        carro11.exibirInformacoes();
        carro4.exibirInformacoes();
        carro81.exibirInformacoes();

        System.out.println("=== EQUIPES ===");
        System.out.println(ferrari);
        System.out.println("Total de patrocínio: R$ " +
                String.format("%.2f", ferrari.getValorTotalPatrocinio()) + " milhões\n");

        System.out.println(redBull);
        System.out.println("Total de patrocínio: R$ " +
                String.format("%.2f", redBull.getValorTotalPatrocinio()) + " milhões\n");

        System.out.println(mclaren);
        System.out.println("Total de patrocínio: R$ " +
                String.format("%.2f", mclaren.getValorTotalPatrocinio()) + " milhões");
    }
}