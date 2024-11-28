import java.util.ArrayList;

public class Patron {
    protected ArrayList<int[]> casillas;  // Lista de casillas del patrón (cada casilla es una coordenada [fila, columna])

    // Constructor
    public Patron() {
        casillas = new ArrayList<>();
    }

    // Método para agregar casillas al patrón
    public void agregarCasilla(int fila, int columna) {
        casillas.add(new int[]{fila, columna});
    }

    // metodo para verificar si el patron esta completo
    public boolean verificarPatron(Tablero tablero) {
        for (int[] casilla : casillas) {
            int fila = casilla[0];
            int columna = casilla[1];

            // Obtener la casilla correspondiente en el tablero
            Casilla casillaTablero = tablero.getTablero()[fila][columna];

            // Verificar si la casilla está marcada
            if (casillaTablero == null || !casillaTablero.esMarcada()) {
                return false;  // Si alguna casilla no está marcada, el patrón no está completo
            }
        }
        return true;  // Si todas las casillas están marcadas, el patrón está completo
    }

    // Método para obtener las casillas del patrón (útil para depuración o visualización)
    public ArrayList<int[]> getCasillas() {
        return casillas;
    }

    // Método para imprimir el patrón en la consola
    public void imprimirPatron() {
        System.out.println("Patrón:");
        for (int[] casilla : casillas) {
            System.out.println("Fila: " + casilla[0] + ", Columna: " + casilla[1]);
        }
    }


}
