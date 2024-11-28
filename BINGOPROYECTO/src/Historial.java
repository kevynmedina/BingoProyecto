import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Historial extends Tombola {
    private List<Integer> historialDetalles;  // Lista para almacenar el historial de los números extraídos

    // Constructor
    public Historial() {
        super();  // Llama al constructor de la clase base Tombola
        historialDetalles = new ArrayList<>();
    }

    // Sobrescribir el método sacarNumero para guardar un historial detallado
    @Override
    public int sacarNumero() {
        int numeroExtraido = super.sacarNumero();  // Llama al método de la clase base Tombola
        historialDetalles.add(numeroExtraido);     // Guarda el número extraído en el historial detallado
        return numeroExtraido;
    }

    // Método para obtener el historial completo (en detalle)
    public List<Integer> getHistorialDetalles() {
        return historialDetalles;
    }

    // Método para mostrar el historial de manera más detallada
    public void imprimirHistorial() {
        System.out.println("Historial detallado de números extraídos:");
        for (int numero : historialDetalles) {
            System.out.println("Número extraído: " + numero);
        }
    }

    // Método para mostrar el número de veces que un número fue extraído
    public void mostrarConteoHistorial() {
        Set<Integer> numerosUnicos = new HashSet<>(historialDetalles);
        System.out.println("\nConteo de números extraídos:");
        for (int numero : numerosUnicos) {
            long count = historialDetalles.stream().filter(n -> n == numero).count();
            System.out.println("Número " + numero + " extraído " + count + " veces.");
        }
    }

    // Método para resetear el historial
    public void resetearHistorial() {
        historialDetalles.clear();  // Limpiar el historial de números extraídos
    }
}
