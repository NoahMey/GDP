import org.junit.Test;

public class HelloTest extends junit.framework.TestCase
{
  
  @Test
  public void testHello()
  {
    assertEquals("Hello, world!", Hello.hello());
  }

}
