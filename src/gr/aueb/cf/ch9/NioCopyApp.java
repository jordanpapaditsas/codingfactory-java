package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {

    public static void main(String[] args) {
        byte[] videoBytes;
        Path sourcePath = Paths.get("C:/tmp/jack.png");
        Path targetPath = Paths.get("C:/tmp/jack2.png");

        try {
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, videoBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
