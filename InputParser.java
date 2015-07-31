import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class InputParser {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter the 13 cards in hand: (e.g. 8H) ");
            String file = reader.nextLine();
            BufferedReader br = new BufferedReader(new FileReader(".\\src\\" + file));
            List<String> cardsInHand = new ArrayList<>();
            for (int i = 0; i < 13; i++){
                String s = br.readLine();
                cardsInHand.add(s);
            }
            Rummy rummyHand = new Rummy();
            System.out.println(rummyHand.findMinimumDraws(cardsInHand));
            reader.close();
        }
    }    
}
