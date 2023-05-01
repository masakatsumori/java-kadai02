import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;

//カラム　＝Column
//ArrayList<ArrayList<Integer>> list; Arraylistの二次元配列

class TestResults02 {

    public static void main(String[] args) {

        final int MAX_NUMS = 6;
        String[][] deta = new String[MAX_NUMS][MAX_NUMS];

        // List<ArrayList<Integer>> list; //Arraylistの二次元配列

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(".", "scores.csv"),
                StandardCharsets.UTF_8)) {

            int index = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                deta[index] = line.split(",");
                index++;
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        // set
        deta[0][0] = "score";
        deta[0][1] = "id";
        deta[0][2] = "name";

        deta[1][0] = "75";
        deta[2][0] = "80";
        deta[3][0] = "54";
        deta[4][0] = "98";
        deta[5][0] = "80";

        deta[1][1] = "A105";
        deta[2][1] = "A102";
        deta[3][1] = "A201";
        deta[4][1] = "A110";
        deta[5][1] = "A330";

        deta[1][2] = "James";
        deta[2][2] = "Linda";
        deta[3][2] = "Gregory";
        deta[4][2] = "Mike";
        deta[5][2] = "Aria";

        for (int j = 0; j < MAX_NUMS; j++) {

            if (deta[j] == null)
                break;
            for (int i = 0; i < deta[i].length; i++) {
                System.out.print(deta[j][i] + "  ");

            }
            System.out.println();

        }

    }

}
