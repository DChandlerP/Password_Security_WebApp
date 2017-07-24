package helper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by davidprince on 7/23/17.
 */

// https://stackoverflow.com/questions/16100175/store-text-file-content-line-by-line-into-array
public class TxtToArray {
    public static void main(String[] args) {
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get("/Users/davidprince/Desktop/Password Security WebApp/Password Security WebApp/src/main/java/helper/passwords.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] a = list.toArray(new String[list.size()]);
    }
}
