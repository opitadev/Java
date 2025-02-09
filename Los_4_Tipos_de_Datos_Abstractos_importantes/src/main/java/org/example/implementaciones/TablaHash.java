package org.example.implementaciones;

import org.example.estructuras.NodoB;
import org.example.interfaces.Diccionario;

public class TablaHash<K, V> implements Diccionario<K, V> {

    private static final int size = 19997;
    private static final int mult = 12582917;

    private final NodoB<K, V>[] datos;

    public TablaHash() {
        this.datos = (NodoB<K, V>[]) new NodoB[size];
    }

    @Override
    public V leer(K llave) {
        int hash = hash(llave.hashCode());

        NodoB<K, V> nodo = datos[hash];
        if (nodo == null) return null;

        while (nodo != null) {
            if (nodo.llave.equals(llave)) return nodo.valor;

            nodo = nodo.siguiente;
        }

        return null;
    }

    @Override
    public void insertar(K llave, V valor) {
        borrar(llave);

        int hash = hash(llave.hashCode());
        NodoB<K, V> nodo = new NodoB<>(llave, valor, datos[hash]);
        datos[hash] = nodo;
    }

    @Override
    public void borrar(K llave) {
        int hash = hash(llave.hashCode());
        NodoB<K, V> nodo = datos[hash];

        NodoB<K, V> cabecera = new NodoB<>(null, null, nodo);
        NodoB<K, V> prev = cabecera;

        while (nodo != null) {
            if (nodo.llave.equals(llave)) {
                prev.siguiente = nodo.siguiente;
                break;
            }

            prev = nodo;
            nodo = nodo.siguiente;
        }

        datos[hash] = cabecera.siguiente;
    }

    private int hash(int key) {
        key = Math.abs(key);
        return (int) ((long) key * mult % size);
    }
}
