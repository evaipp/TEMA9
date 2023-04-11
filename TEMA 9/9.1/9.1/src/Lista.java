import java.util.Arrays;

public class Lista implements Cola {
    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];
    }

    void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertarFinal(Lista otrLista) {
        int tamIni = tabla.length; // tamaño inicial de la tabla
        tabla = Arrays.copyOf(tabla, tabla.length + otrLista.tabla.length);
        System.arraycopy(otrLista.tabla, 0, tabla, tamIni, otrLista.tabla.length);
    }

    // el primer parametro es el indice de la posicion en la que se va a insertar el
    // valor del segundo parametro
    void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion);
        tabla[posicion] = nuevo;
    }

    // se elimina el elemento correspondiente al indice y se devuelve
    Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice; i < tabla.length - 1; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;

    }

    Integer get (int indice){
        Integer resultado= null;
        if (indice >= 0 && indice < tabla.length){ //inidice valido
            resultado = tabla[indice];
        }return resultado;
    }
    int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) { // no vale tabla [i] == claveBusqueda
                indice = i;
            }
        }
        return indice;
    }

    public int numeroElementos() {
        return tabla.length;
    }

    public void mostrar() {
        System.out.println("Lista: " + Arrays.toString(tabla));
    }

    public void eliminarFinal(Lista l2) {
    }

    @Override
    public void encolar(Integer o) {
  
            insertarFinal(o);
        }
    

    @Override
    public Integer desencolar() {
         return eliminar(0);
        }
    }
