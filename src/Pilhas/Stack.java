package Pilhas;

import estrutura.EstruturaEstatica;

public class Stack<T> extends EstruturaEstatica<T> {

    public Stack(){
        super();
    }

    public Stack(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){

        if (this.estaVazia()){
            return null;
        }

        return this.elementos[tamanho-1];
    }

    public T desempilha(){

        if (this.estaVazia()){
            return null;
        }

		/*T elemento = this.elementos[tamanho-1];
		tamanho--;

		return elemento;*/

        return this.elementos[--tamanho];
    }
}
