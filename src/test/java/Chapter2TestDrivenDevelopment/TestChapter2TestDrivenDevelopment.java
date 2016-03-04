package Chapter2TestDrivenDevelopment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/04.
 */

public class TestChapter2TestDrivenDevelopment
{
    ChapterExecises chapterExecises = new ChapterExecises();

    //Positive Test
    @Test
    public void testFloatPositive() throws Exception {

        Assert.assertTrue(chapterExecises.returnFloat(1,125) == 125.0);
    }

    //Negative Test
    @Test
    public void testFloatNegative() throws Exception {

        Assert.assertTrue(chapterExecises.returnFloat(1,125) == 12);
    }

    //Positive Test
    @Test
    public void testObjectPositive() throws Exception{
        Assert.assertSame(chapterExecises.returnObject(), "obj1");
    }

    //Negative Test
    @Test
    public void testObjectNegative() throws Exception{
        Assert.assertSame(chapterExecises.returnObject(), "sameThingDifferent");
    }

    //Positive Test
    @Test
    public void testNullPositive() throws Exception{
        Assert.assertNull(chapterExecises.returnNull(), null);
    }

    //Negative Test
    @Test
    public void testNullNegative() throws Exception{
        Assert.assertNull(chapterExecises.returnNull(), "Not Null");
    }

    //Positive Test
    @Test
    public void testNotNullPositive() throws Exception{
        Assert.assertNotNull(chapterExecises.returnFloat(1, 1));
    }

    //Negative Test
    @Test
    public void testNotNullNegative() throws Exception{
        Assert.assertNotNull(chapterExecises.returnNull());
    }

    //Positive Test
    @Test
    public void testListPositive() throws Exception{
        List list2 = new ArrayList();

        list2.add("Thabo");

        Assert.assertEquals(list2,chapterExecises.returnList());
    }

    //Negative Test
    @Test
    public void testListNegative() throws Exception{
        List list3 = new ArrayList();

        list3.add("Ephraim");

        Assert.assertEquals(list3, chapterExecises.returnList());
    }

}
