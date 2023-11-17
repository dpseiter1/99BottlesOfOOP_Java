package bottlesOOP_VaryVerseRequirement;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;


public class BottleVerseTest {
	@Test
    public void verseGeneralUpperBound() {
        String expected = "99 bottles of beer on the wall, " +
                "99 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "98 bottles of beer on the wall.\n";
        assertEquals(expected, new BottleVerse(99).lyrics());
    }
	
    @Test
    public void verseGeneralLowerBound() {
        String expected = "3 bottles of beer on the wall, " +
                "3 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "2 bottles of beer on the wall.\n";
        assertEquals(expected, new BottleVerse(3).lyrics());
    }
    
	@Test
    public void testVerse7() {
        String expected = "7 bottles of beer on the wall, " +
                "7 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 six-pack of beer on the wall.\n";
        assertEquals(expected, new BottleVerse(7).lyrics());
    }    
	
	@Test
    public void testVerse6() {
        String expected = "1 six-pack of beer on the wall, " +
                "1 six-pack of beer.\n" +
                "Take one down and pass it around, " +
                "5 bottles of beer on the wall.\n";
        assertEquals(expected, new BottleVerse(6).lyrics());
    }
    
    @Test
    public void testVerse2() {
        String expected = "2 bottles of beer on the wall, " +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n";
        assertEquals(expected, new BottleVerse(2).lyrics());
    }

    @Test
    public void testVerse1() {
        String expected = "1 bottle of beer on the wall, " +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n";
        assertEquals(expected, new BottleVerse(1).lyrics());
    }

    @Test
    public void testVerse0() {
        String expected = "No more bottles of beer on the wall, " +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n";
        assertEquals(expected, new BottleVerse(0).lyrics());
    }
}
