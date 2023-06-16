import Vetores.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<String>();

        System.out.println(arrayList);

        arrayList.adiciona("Ovo");
        arrayList.adiciona("Farinha");
        arrayList.adiciona("Leite");
        arrayList.adiciona("Acucar");
        arrayList.adiciona("Manteiga");
        arrayList.adiciona("Sal");

        System.out.println(arrayList);

        System.out.println(arrayList.busca(5));

        arrayList.remove(5);

        System.out.println(arrayList);
    }
}