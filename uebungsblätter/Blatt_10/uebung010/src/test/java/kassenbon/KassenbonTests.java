package kassenbon;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.fail;

public class KassenbonTests {
  @Test
  public void test() {
    try {
      Class clazz = Class.forName("kassenbon.Kassenbon");
      Class addressClazz = Class.forName("kassenbon.Adresse");
      Class articleClazz = Class.forName("kassenbon.Artikel");
      try {
        clazz.getConstructor(new Class[] {addressClazz});
      } catch (NoSuchMethodException e) {
        fail("Constructor der Klasse Kassenbon nicht gefunden");
      }

      try {
        clazz.getDeclaredMethod("add", new Class[] {articleClazz});
      } catch (NoSuchMethodException e) {
        fail("add methode nicht gefunden");
      }

    } catch (ClassNotFoundException e) {
      fail("Klasse Kasse nicht gefunden");
    }

  }


  @Test
  public void testArticleMethods() {
    try {
      Class clazz = Class.forName("kassenbon.Artikel");
      try {
        clazz.getConstructor(new Class[] {String.class, int.class, double.class});
      } catch (NoSuchMethodException e) {
        fail("Konstruktor der Klasse Artikel nicht gefunden");
      }

      try {
        clazz.getDeclaredMethod("print", new Class[] {});
      } catch (NoSuchMethodException e) {
        fail("Print methode nicht gefunden");
      }
    } catch (ClassNotFoundException e) {
      fail("Klasse Artikel not found");
    }

  }


  @Test
  public void testAdresseMethods() {
    try {
      Class clazz = Class.forName("kassenbon.Adresse");
      try {
        clazz.getConstructor(new Class[] {
            String.class, String.class, String.class,
            String.class, String.class, String.class});
      } catch (NoSuchMethodException e) {
        fail("Constructor of Klasse Adresse nicht gefunden");
      }
      try {
        clazz.getDeclaredMethod("print", new Class[] {});
      } catch (NoSuchMethodException e) {
        fail("print methode nicht gefunden");
      }
    } catch (ClassNotFoundException e) {
      fail("Klasse Adresse not found");
    }
  }

}
