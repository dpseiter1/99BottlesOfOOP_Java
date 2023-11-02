package bottlesOOP_VaryVerseRequirement;

public class Bottles {
	private VerseTemplate verseTemplate = new BottleVerse(99); // = new VerseTemplate(99);
	
	public Bottles() {
	}
	
	public Bottles(VerseTemplate verseTemplate) {
		this.verseTemplate = verseTemplate;	
	}
	
    public String song() {
        return this.verses(99, 0);
    }

    public String verses(int upper, int lower) {
        StringBuilder result = new StringBuilder();
        for (int i = upper; i >= lower; i--) {
            result.append(this.verse(i));
            if (i != lower) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public String verse(int number) {
//    	return this.verseTemplate.lyrics(number);
    	this.verseTemplate.setNumber(number);
    	return verseTemplate.lyrics();
    }
}
