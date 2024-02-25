import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.Scanner;

public class WebpageCounter {
    public static int countLine(String urlString) throws MalformedURLException, IOException {
        URL url = new URL(urlString);
        int count = 0;
        try (Scanner input = new Scanner(url.openStream())) {
            while (input.hasNextLine()) {
                input.nextLine();
                count++;
            }
        }
        return count;
    }
}

class TestWebpageCounter {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);
        String urlString = input.next();

        try {
            int count = WebpageCounter.countLine(urlString);
            System.out.println("The webpage has " + count + " lines of codes.");
        } catch (MalformedURLException e) {
            System.out.println("Error: URL must have a protocol such as https://");
        } catch (IOException e) {
            System.out.println("Error: The URL does not exist or does not accept connection.");
        }
    }
}
