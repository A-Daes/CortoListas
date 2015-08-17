/*Escrito por: Diego Alvarez
* con la intencion de que sea modificable por todos aquellos que la puedan leer
*/
public class NodoSimple<E> implements INodo<E> extends Nodo<E> {
    E Valor;

public NodoSimple(E valor){
    this.Valor = valor;
}
}
