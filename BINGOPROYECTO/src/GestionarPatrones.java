public class GestionarPatrones {

    // Crear un patrón de línea horizontal (sin usar bucles)
    public static Patron crear5InARowHorizontal(int fila) {
        Patron patron = new Patron();
        patron.agregarCasilla(fila, 0);
        patron.agregarCasilla(fila, 1);
        patron.agregarCasilla(fila, 2);
        patron.agregarCasilla(fila, 3);
        patron.agregarCasilla(fila, 4);
        return patron;
    }

    // Crear un patrón de línea vertical (sin usar bucles)
    public static Patron crear5InARowVertical(int columna) {
        Patron patron = new Patron();
        patron.agregarCasilla(0, columna);
        patron.agregarCasilla(1, columna);
        patron.agregarCasilla(2, columna);
        patron.agregarCasilla(3, columna);
        patron.agregarCasilla(4, columna);
        return patron;
    }

    // Crear un patrón de diagonal (de arriba izquierda a abajo derecha)
    public static Patron crearDiagonal() {
        Patron patron = new Patron();
        patron.agregarCasilla(0, 0);
        patron.agregarCasilla(1, 1);
        patron.agregarCasilla(2, 2);
        patron.agregarCasilla(3, 3);
        patron.agregarCasilla(4, 4);
        return patron;
    }

    // Crear un patrón de diagonal inversa (de arriba derecha a abajo izquierda)
    public static Patron crearDiagonalInversa() {
        Patron patron = new Patron();
        patron.agregarCasilla(0, 4);
        patron.agregarCasilla(1, 3);
        patron.agregarCasilla(2, 2);
        patron.agregarCasilla(3, 1);
        patron.agregarCasilla(4, 0);
        return patron;
    }

    // Crear un patrón de 8 diamond
    public static Patron crearDiamond() {
        Patron patron = new Patron();
        patron.agregarCasilla(0, 2);
        patron.agregarCasilla(1, 1);
        patron.agregarCasilla(2, 3);
        patron.agregarCasilla(1, 3);
        patron.agregarCasilla(2, 0);
        patron.agregarCasilla(2, 4);

        patron.agregarCasilla(3, 3);
        patron.agregarCasilla(4, 2);



        return patron;
    }
    // Crear un patrón de 8 Small Center Box
    public static Patron crearSmallCenterBox() {
        Patron patron = new Patron();
        patron.agregarCasilla(1, 1);
        patron.agregarCasilla(1, 2);
        patron.agregarCasilla(1, 3);

        patron.agregarCasilla(2, 1);
        patron.agregarCasilla(2, 3);

        patron.agregarCasilla(3, 1);
        patron.agregarCasilla(3, 2);
        patron.agregarCasilla(3, 3);



        return patron;
    }
    // Crear un patrón de 6 Pack Vertical
    public static Patron crear6PackVertical(int fila, int columna) {
        Patron patron = new Patron();
        patron.agregarCasilla(fila,columna);
        patron.agregarCasilla(1+fila, columna);
        patron.agregarCasilla(2+fila, columna);
        patron.agregarCasilla(fila, 1+columna);
        patron.agregarCasilla(1+fila, 1+columna);
        patron.agregarCasilla(2+fila, 1+columna);
        return patron;
    }
//
    public static Patron crear6PackHorizontal(int fila,int columna) {
        Patron patron = new Patron();
        patron.agregarCasilla(fila, columna);
        patron.agregarCasilla(fila, 1+columna);
        patron.agregarCasilla(fila, 2+columna);
        patron.agregarCasilla(1+fila, columna);
        patron.agregarCasilla(1+fila, 1+columna);
        patron.agregarCasilla(1+fila, 2+columna);




        return patron;
    }
}
