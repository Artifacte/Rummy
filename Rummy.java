import java.util.ArrayList;
import java.util.List;

public class Rummy {
        
        public static final int PACKS = 3;
        public static final int CARDS_IN_PACK = 53;
        public static final int CARDS_IN_SUIT = 13;
        public static final String CARD_NAMES = "A23456789TJQK";
        public static final String CARD_SUITS = "CDHS";
        
	public int findMinimumDraws(List<String> hand){
            List<Integer> cardsInHand = new ArrayList<>();
            for (String card : hand){
                cardsInHand.add(getNumberForCard(card));
            }
            return 0;
	}
	
	private List<Set> getAllPossible3LengthPermutations(List<Integer> hand){
		return null;
	}
	
	private List<Set> getAllPossible4LengthPermutations(List<Integer> hand){
		return null;
	}
	
	private List<Set> getAllPossible5LengthPermutations(List<Integer> hand){
		return null;
	}
	
	private int getNumberForCard(String card){
            int cardNumber = 0;
            String c = card.substring(0,1);
            cardNumber += (CARD_NAMES.indexOf(c) + 1);
            c = card.substring(1,2);
            cardNumber += (CARD_SUITS.indexOf(c) * 13);
            return cardNumber;
	}
	
	private int findUnusedCards(List<Integer> leftCards ,boolean areAtleastTwoSequencesFound , boolean isTripletorQuadFound ){
		
		return 0;
	
	}
}
	
