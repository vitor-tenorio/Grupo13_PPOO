//package simulacao;

/**
 *
 * @author Luiz Merschmann
 */
public class Principal {

    public static void main(String[] args) {
        Simulacao sim = new Simulacao();
        sim.executarSimulacao(100, 4, 100);   // toda vez que mudar aqui mudar em calcularDistanciaRealPercorrida()

        //sim.imprimirRelatorio();
    }
}
