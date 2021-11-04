package digital.house.flyweight;

import digital.house.flyweight.dto.FlorestaDTO;

public class Application {

    public static void main(String[] args) {
        final FlorestaDTO floresta = new FlorestaDTO();

        for (int i = 0; i < 1000000; i++) {
            floresta.plantarArvore("ORNAMENTAIS", 200, 400, "verde");
            floresta.plantarArvore("FRUTÍFERAS", 500, 300, "vermelho");
            floresta.plantarArvore("FRUTÍFERAS", 100, 200, "azul");
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }

}
