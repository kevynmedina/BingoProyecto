import java.util.*;

public class Tablero {
    private Casilla[][] tablero;

    public Tablero() {
        tablero = new Casilla[5][5];
    }

    // Llena el tablero con números aleatorios únicos por columna
    public void llenarTablero() {
        Random random = new Random();
        tablero[2][2] = new Casilla(500, false);
        // Crea un conjunto de números únicos por columna
        Set<Integer> bColumn = new HashSet<>();
        Set<Integer> iColumn = new HashSet<>();
        Set<Integer> nColumn = new HashSet<>();
        Set<Integer> gColumn = new HashSet<>();
        Set<Integer> oColumn = new HashSet<>();

        // Llena las columnas con números aleatorios únicos dentro del rango
        while (bColumn.size() < 5) {
            bColumn.add(random.nextInt(15) + 1); // Números entre 1 y 15
        }
        while (iColumn.size() < 5) {
            iColumn.add(random.nextInt(15) + 16); // Números entre 16 y 30
        }
        while (nColumn.size() < 5) {
            nColumn.add(random.nextInt(15) + 31); // Números entre 31 y 45
        }
        while (gColumn.size() < 5) {
            gColumn.add(random.nextInt(15) + 46); // Números entre 46 y 60
        }
        while (oColumn.size() < 5) {
            oColumn.add(random.nextInt(15) + 61); // Números entre 61 y 75
        }

        // Convertir los conjuntos a listas para usar en el tablero
        List<Integer> bList = new ArrayList<>(bColumn);
        List<Integer> iList = new ArrayList<>(iColumn);
        List<Integer> nList = new ArrayList<>(nColumn);
        List<Integer> gList = new ArrayList<>(gColumn);
        List<Integer> oList = new ArrayList<>(oColumn);

        // Coloca los números en las casillas del tablero, asegurando que no se repitan por columna
        for (int i = 0; i < 5; i++) {
            // Columna B
            tablero[i][0] = new Casilla(bList.get(i), false);

            // Columna I
            tablero[i][1] = new Casilla(iList.get(i), false);

            // Columna N
            // Casilla central en la columna N se deja libre
            if (i == 2) {
                  // Casilla libre en el centro
            } else {
                tablero[i][2] = new Casilla(nList.get(i), false);
            }

            // Columna G
            tablero[i][3] = new Casilla(gList.get(i), false);

            // Columna O
            tablero[i][4] = new Casilla(oList.get(i), false);
        }

    }

    // Marca un número en el tablero
    public void marcarNumero(int numero) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tablero[i][j].getNumero() == numero) {
                    tablero[i][j].marcar();
                    return;
                }
            }
        }
    }

    public void mostrarTablero() {
        // Imprimir encabezado de las columnas
        System.out.println(" B   I   N   G   O");

        // Recorrer y mostrar cada fila del tablero
        for (int i = 0; i < 5; i++) {
            // Mostrar los valores de cada casilla
            for (int j = 0; j < 5; j++) {
                Casilla casilla = tablero[i][j];
                if (casilla.esLibre()) {
                    System.out.print("  * ");  // Usamos '*' para la casilla libre
                } else {
                    System.out.printf("%3d ", casilla.getNumero());  // Imprime el número de la casilla
                }
            }
            System.out.println();  // Salto de línea para la siguiente fila
        }
    }


    public Casilla[][] getTablero() {
        return tablero;
    }

    public void agregarNumeroEnCasilla(int fila, int columna, int numero, boolean esLibre) {
        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
            tablero[fila][columna] = new Casilla(numero, esLibre);
        } else {
            System.out.println("Índices de fila o columna no válidos.");
        }
    }
}
