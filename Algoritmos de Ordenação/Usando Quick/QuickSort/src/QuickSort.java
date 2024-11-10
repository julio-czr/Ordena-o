public class QuickSort{

    public static void quickSort(int[] array){
        int base = 0;
        int topo = array.length - 1;
        quickSort(array,base,topo);
    }

    public static void quickSort(int[] array,int base, int topo) {
        if (base < topo) {
            int pi = parte(array, base, topo);

            quickSort(array, base, pi - 1);
            quickSort(array, pi + 1, topo);
        }
    }
    
    public static int parte(int[] array, int base, int topo) {
        int pivo = array[topo]; 
        int i = (base - 1); 

        for (int j = base; j < topo; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        array[topo] = array[i + 1];
        array[i + 1] = pivo;

        return i + 1;  
    }

    
}