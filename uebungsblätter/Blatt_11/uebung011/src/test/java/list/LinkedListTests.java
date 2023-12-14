package list;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.fail;
public class LinkedListTests {

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  @Test(timeout = 1000)
  public void testRemoveFirst() {
    LinkedList ll = new LinkedList();
    ll.append(3);
    ll.append(1);
    ll.append(7);

    try {
      Assert.assertEquals(3, ll.removeFirst());
      Assert.assertEquals(2, ll.getSize());
      Assert.assertEquals(1, ll.removeFirst());
      Assert.assertEquals(1, ll.getSize());
      Assert.assertEquals(7, ll.removeFirst());
      Assert.assertEquals(0, ll.getSize());
    } catch (Exception e) {
      Assert.fail("Exception wurde geworfen obwohl noch Elemente in der liste sein sollten");
    }

    try {
      ll.removeFirst();
      exception.expect(Class.forName("list.ListException").asSubclass(Throwable.class)); //
    } catch(ClassNotFoundException e) {
      Assert.fail("Klasse ListException wurde nicht gefunden");
    }
    catch (Exception e) {}

  }

  @Test(timeout = 1000)
  public void testRemoveAll() {
    LinkedList ll = new LinkedList();
    ll.append(3);
    ll.append(1);
    ll.append(7);

    try {
      ll.removeAll();
      Assert.assertEquals(0, ll.getSize());
    } catch (Exception e) {
      Assert.fail("Exception wurde geworfen obwohl dies nicht sein darf");
    }
  }
}
