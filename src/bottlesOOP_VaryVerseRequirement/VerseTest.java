package bottlesOOP_VaryVerseRequirement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VerseTest {
    @Test
    public void testVerses() {
        String expected = "This is verse 99.\n" +
                "\n" +
                "This is verse 98.\n" +
                "\n" +
                "This is verse 97.\n";
        assertEquals(expected, new CountdownSong(new VerseFake()).verses(99, 97));
    }
    
    @Test
    public void testVerse() {
    	String expected = "This is verse 500.\n";
    	assertEquals(expected, new CountdownSong(new VerseFake()).verse(500));
    }
    
    @Test
    public void testSong() {
    	String expected = "This is verse 47.\n" +
                "\n" +
                "This is verse 46.\n" +
                "\n" +
                "This is verse 45.\n" +
		        "\n" +
		        "This is verse 44.\n" +
		        "\n" +
		        "This is verse 43.\n";
        assertEquals(expected, new CountdownSong(new VerseFake(),47,43).song());
    }
}

