package homeWork.homeWork10.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        File dir = new File("src/homeWork/homeWork10/task2/files");
        File output = new File("src/homeWork/homeWork10/task2/result.txt");

        for (File file : Objects.requireNonNull(dir.listFiles())) {
            Files.writeString(output.toPath(), Files.readString(Paths.get(dir + "/" + file.getName())),
                    StandardOpenOption.APPEND);
        }
    }
}
