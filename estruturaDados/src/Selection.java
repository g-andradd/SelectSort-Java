public class Selection {

    void sort(int arr[]) {
        //n recebe o tamanho do array em int
        int n = arr.length;

        //percorre todo o array
        for (int i = 0; i < n - 1; i++) {
            //acha o index minimo de i
            int min_idx = i;
            //pega o proximo elemento após o minimo
            for (int j = i + 1; j < n; j++)
                //verifica se o array na posisão j é menor que o menor index do array
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Seta o numero do array no menor index na variavel temporaria temp
            int temp = arr[min_idx];
            //seta o numero no index i na menor posição
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // printando o array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // metodo main que testa a classe
    public static void main(String args[]) {
        Selection ob = new Selection();
        int arr[] = {64, 25, 12, 22, 11};
        ob.sort(arr);
        System.out.println("Array Ordenada");
        ob.printArray(arr);
    }

}

