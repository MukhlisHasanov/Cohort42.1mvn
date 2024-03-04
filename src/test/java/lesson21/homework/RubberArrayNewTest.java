package lesson21.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RubberArrayNewTest {

    private RubberArrayNew rubberArrayNew;

    @BeforeEach
    public void init() {
        rubberArrayNew = new RubberArrayNew();
    }

    @Test
    public void testGet() {
        rubberArrayNew.add(12);
        Assertions.assertEquals(12, rubberArrayNew.get(0));
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(0, rubberArrayNew.size());
        rubberArrayNew.add(25);
        Assertions.assertEquals(1, rubberArrayNew.size());
        Assertions.assertEquals(25, rubberArrayNew.get(0));
    }

    @Test
    public void testAddByIndex() {
        rubberArrayNew.add(25);
        rubberArrayNew.add(25);
        rubberArrayNew.add(25);
        rubberArrayNew.add(7, 1);
        Assertions.assertEquals(4, rubberArrayNew.size());
        Assertions.assertEquals(7, rubberArrayNew.get(1));
    }

    @Test
    public void testRemove() {
        rubberArrayNew.add(-1);
        rubberArrayNew.add(3);
        Assertions.assertEquals(2, rubberArrayNew.size());
        rubberArrayNew.remove(1);
        Assertions.assertEquals(1, rubberArrayNew.size());
    }

    @Test
    public void testContains() {
        rubberArrayNew.add(-1);
        rubberArrayNew.add(3);
        Assertions.assertTrue (rubberArrayNew.contains(-1));
        Assertions.assertFalse(rubberArrayNew.contains(5));
    }

    @Test
    public void testIndexOf() {
    rubberArrayNew.add(-1);
    rubberArrayNew.add(3);
    Assertions.assertEquals(1, rubberArrayNew.indexOf(3));
    Assertions.assertEquals(-1, rubberArrayNew.indexOf(5));
    }

    @Test
    public void testToString() {
        rubberArrayNew.add(-1);
        rubberArrayNew.add(3);
        Assertions.assertEquals("[-1,3]", rubberArrayNew.toString() );
    }
}
