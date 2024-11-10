
import java.io.IOException;

public class OrdenacaoApp {
    public static void main(String[] args) {

        String caminhoFile = SelecaoELeitura.selecionarFile();
        try{
            int[] array = SelecaoELeitura.lerCSV(caminhoFile) ;
    
            long startTime = System.nanoTime();
            BubbleSort.bubbleSort(array);
            long stopTime = System.nanoTime();
        
            System.out.println("\nArray ordenado:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        
            long tempo = (stopTime - startTime);
            System.out.println("\nTempo de execução em nanosegundos: " + tempo);

        }catch (IOException e) {
            System.err.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }
        
    }
    
}

