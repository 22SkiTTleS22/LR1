package Main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyClass {

    @Test
    public void testMain() {
        MyClass myClass = new MyClass();
        assertEquals(3, myClass.maxUniqueString("abcc"));
        assertEquals(5, myClass.maxUniqueString("abcabde"));
        assertEquals(3, myClass.maxUniqueString("abc"));
        assertEquals(2, myClass.maxUniqueString("ab"));
        assertEquals(3, myClass.maxUniqueString("abbcdb"));
        assertEquals(0, myClass.maxUniqueString(""));
        assertEquals(1, myClass.maxUniqueString("b"));
        assertEquals(4, myClass.maxUniqueString("abcdbffg"));
    }
}

