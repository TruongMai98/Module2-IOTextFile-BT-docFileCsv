import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public void readFile(String filePath) {
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(parseCsvLine(line));
                print(parseCsvLine(line));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
//            for (String a : result) {
//                System.out.print(a);
//            }
        }
        return result;
    }

    public void print(List<String> country) {
        System.out.println(
                "[id = " +
                        country.get(0) +
                        " code = " +
                        country.get(1) +
                        " country = " +
                        country.get(2) +
                        "]");
    }
}
