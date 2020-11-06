import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
  @Test
  public void testNothing() {
    //assertEquals(5,2+5);
  }

  @Test
  public void testSomeStuff() {
    //Das Ergebnis der Addition von 2 und 3 ist 5.
    assertEquals(5 , 2 + 3);
    
    //Das Neuanlegen eines Strings liefert ein Objekt ungleich Null
    String s1 = "s";
    assertNotNull(s1);

    //3 * 7 ist größer als 4 * 5
    assertTrue(3*7 > 4*5);
  }
}