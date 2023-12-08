package bottlesOOP_VaryVerseRequirement;

public class CountdownSong {
	private VerseTemplate verseTemplate = new BottleVerse(99); // = new VerseTemplate(99);
	int max = 999999;
	int min = 0;

	public CountdownSong(VerseTemplate verseTemplate) {
		this.verseTemplate = verseTemplate;	
	}
	
	public CountdownSong(VerseTemplate verseTemplate, int max, int min) {
		this.verseTemplate = verseTemplate;	
		this.max = max;
		this.min = min;
	}
	
    public String song() {
        return this.verses(max, min); // changed from 99 when apparent songs may not always have 100 verses
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
    	return verseTemplate.lyrics(number);
    }
}
