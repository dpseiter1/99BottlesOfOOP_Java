package bottlesOOP_VaryVerseRequirement;

public class BottleVerse {
	int number;
	
	public BottleVerse(int number) {
		this.number = number;
	}
	
	public String verse(int number) {
    	BottleNumber bottleNumber = BottleNumber.For(number);
    	
        return capitalize(bottleNumber.toString()) + " of beer on the wall, " +
        		bottleNumber.toString() + " of beer.\n" +
        		bottleNumber.action() +
        		bottleNumber.successor().toString() + " of beer on the wall.\n";
	}
	
    public String capitalize(String phrase) {
    	return phrase.substring(0,1).toUpperCase() + phrase.substring(1);
    }	
}
