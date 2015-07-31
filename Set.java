import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Set {

	List<Integer> set= new ArrayList<>();
        Set(List<Integer> set){
            this.set = set;
        }
        public int getSize(){
            return set.size();
        }
        
	public boolean isNaturalSequence(){
                Collections.sort(set);
                boolean ConsecutiveCards = true;
                boolean sameCards = true;
                for (int i = 0; i < set.size() - 1; i++ ) {
                    if (!areConsecutiveCards(set.get(i+1), set.get(i)) || !inSameSuits(set.get(i+1), set.get(i))) {
                        ConsecutiveCards = false;
                    }
                    
                    if (!areSameCards(set.get(i+1), set.get(i))) {
                        sameCards = false;
                    }
                }
                
                if (ConsecutiveCards || sameCards) {
                    return true;
                }
                return false;
	}
        
	private boolean areConsecutiveCards(int card1, int card2) {
            return (card1 - card2) == 1;
        }
        
        private boolean inSameSuits(int card1, int card2) {
            return (((card1 - 1) % 13) == ((card2 - 1) % 13));
        }
        
        private boolean areSameCards(int card1, int card2) {
            return card1 == card2;
        }
        
	public boolean isSequence(){
                Collections.sort(set);
                boolean ConsecutiveCards = true;
                for (int i = 0; i < set.size() - 1; i++) {
                    if (isJokerCard(set.get(i)) || isJokerCard(set.get(i+1))) {
                        break;
                    }
                    if (!areConsecutiveCards(set.get(i+1), set.get(i)) || !inSameSuits(set.get(i+1), set.get(i))) {
                        ConsecutiveCards = false;
                    }
                }
                return ConsecutiveCards;
	}
	
        private boolean isJokerCard(int card) {
            return card == 53;
        }
        
	public boolean isTriplet(){
		return true;
	}
	
	public boolean isQuadruple(){
		return true;
	}
	
}
