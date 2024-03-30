import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReaderFile {
    private String fileName = "input.txt";

    public ArrayList<String> readFile() {
        ArrayList<String> fructs = new ArrayList<>();

        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fileReader);
            String str = bReader.readLine();
            while(str != null) {
                String[] fructStrings = str.split(" ");
                for (int i = 0; i < fructStrings.length; ++i) {
                    if (fructStrings[i].length() > 1) 
                    fructs.add(fructStrings[i]);
                }
                str = bReader.readLine();
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.println("Ошибка при чтении файла!");
        } finally {
            return fructs;
        }

    }

}
