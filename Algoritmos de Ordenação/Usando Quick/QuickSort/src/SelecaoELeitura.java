
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SelecaoELeitura {
    public static String selecionarFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione o arquivo CSV do array");
        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv"));
        
        int selecionado = fileChooser.showOpenDialog(null);
        if (selecionado == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile().getAbsolutePath();
        } else {
            System.out.println("Nenhum arquivo selecionado.");
            return null;
        }
    }

    public static int[] lerCSV(String caminhoFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(caminhoFile));
        ArrayList<Integer> list = new ArrayList<>();
        String line;

        br.readLine();

        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line.trim()));
        }
        br.close();

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
