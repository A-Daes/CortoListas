//Modificado por: Diego Alvarez

public interface INodo<E> {
	
    public void setSiguiente(Nodo nodo);
    public Nodo getSiguiente();    
    public E getValor();
    public void setValor(E valor);
    
}
