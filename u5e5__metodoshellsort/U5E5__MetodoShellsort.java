package u5e5__metodoshellsort;

import java.util.ArrayList;

import java.util.List;

public class U5E5__MetodoShellsort {

    
    public static void main(String args[]) {
         List<Integer> lista = new ArrayList<>();
       lista.add(5);
       lista.add(6);
       lista.add(7);
       lista.add(4);
       lista.add(1);
       lista.add(3);
       lista.add(2);
       
         System.out.println("lista original: ");
         for(int j=0;j<lista.size();j++){
          System.out.print(lista.get(j)+" ");
        }
         System.out.println("");
         Shellsort(lista);
    }

    public static void Shellsort(List<Integer> lista) {
        int i, j, k, salto, aux;
        salto = lista.size() / 2;
        while (salto > 0) {
            for (i = salto; i < lista.size(); i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (lista.get(j) <= lista.get(k)) {
                        j = -1;
                    } else {
                        aux = lista.get(j);
                        lista.set(j, lista.get(k));
                        lista.set(k, aux);
                        j =j-salto;
                    }
                }
            }
            salto = salto / 2;
        }
        System.out.println("lista ordenada: ");
         for( j=0;j<lista.size();j++){
          System.out.print(lista.get(j)+" ");
      }
    }
    
}
