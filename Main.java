import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(Path.of("C:\\Example\\pokemon.txt"), StandardCharsets.UTF_8);

        PrintWriter out = new PrintWriter("C:\\Example\\newpokemon.txt", StandardCharsets.UTF_8);

        String dir = System.getProperty("User111.dir");

    }
}