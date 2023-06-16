package Filas;

import estrutura.EstruturaEstatica;

public class Queue<T> extends EstruturaEstatica<T> {

    public Queue(){
        super();
    }

    public Queue(int capacidade){
        super(capacidade);
    }

    public void enfileira(T elemento){
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++;

        //this.elementos[this.tamanho++] = elemento;

        this.adiciona(elemento);
    }

    public T espiar(){

        if (this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileira(){

        final int POS = 0;

        if (this.estaVazia()){
            return null;
        }

        T elementoASerRemovido = this.elementos[POS];

        this.remove(POS);

        return elementoASerRemovido;

    }
}
