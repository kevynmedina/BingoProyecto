import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tombola {
    private Set<Integer> numerosExtraidos;  // Conjunto para almacenar los números extraídos
    private Set<Integer> numerosRestantes;  // Conjunto para almacenar los números restantes
    private Random random;  // Generador de números aleatorios

    // Constructor
    public Tombola() {
        numerosExtraidos = new HashSet<>();
        numerosRestantes = new HashSet<>();
        random = new Random();
        llenarNumerosRestantes();  // Llenamos el conjunto de números restantes al inicio
    }

    // Método para llenar los números restantes (1 a 75)
    private void llenarNumerosRestantes() {
        for (int i = 1; i <= 75; i++) {
            numerosRestantes.add(i);
        }
    }

    // Método para sacar un número aleatorio entre 1 y 75 sin repetir
    public int sacarNumero() {
        if (numerosRestantes.isEmpty()) {
            throw new IllegalStateException("Todos los números ya han sido extraídos.");
        }

        int numero = random.nextInt(numerosRestantes.size());  // Genera un índice aleatorio
        Integer[] numerosRestantesArray = numerosRestantes.toArray(new Integer[0]);
        numero = numerosRestantesArray[numero];  // Obtiene el número aleatorio

        numerosRestantes.remove(numero);  // Remueve el número de los disponibles
        numerosExtraidos.add(numero);     // Añade el número extraído al conjunto de números extraídos
        return numero;
    }

    // Método para obtener el historial de números extraídos
    public Set<Integer> getHistorial() {
        return new HashSet<>(numerosExtraidos);
    }

    // Método para verificar si todos los números han sido extraídos
    public boolean todosExtraidos() {
        return numerosRestantes.isEmpty();
    }

    // Método para resetear el historial de números extraídos
    public void resetear() {
        numerosRestantes.clear();          // Limpiar los números restantes
        llenarNumerosRestantes();         // Rellenamos nuevamente los números del 1 al 75
        numerosExtraidos.clear();          // Limpiar el historial de números extraídos
    }

    // Método para restaurar los números extraídos a los números restantes
    public void restaurarNumerosExtraidos() {
        // Restaura los números extraídos a los números restantes
        numerosRestantes.addAll(numerosExtraidos);
        numerosExtraidos.clear();  // Limpia el historial de números extraídos
    }
}
