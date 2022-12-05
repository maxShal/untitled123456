package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.example.StringProcessor.StringCopy;
import static org.example.StringProcessor.quantity;
import static org.example.StringProcessor.StringChange;
import static org.example.StringProcessor.StringDelete;

public class StringProcessorTest
{
    @Test
    public void StringCopytest()
    {
        assertEquals("aaa",StringCopy("a",3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void StringCopyexeptiontest()
    {
        StringCopy(null,2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void StringCopyexeptiontest2()
    {
        StringCopy("null",-1);
    }
    @Test
    public void Stringquantitytest()
    {
        assertEquals(4,quantity("erererer","e"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void Stringquantitytest1()
    {
        quantity("sss",null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void Stringquantitytest2()
    {
        quantity(null,"sss");
    }
    @Test(expected = IllegalArgumentException.class)
    public void Stringquantitytest3()
    {
        quantity(null,null);
    }
    @Test
    public void StringChangeTest()
    {
        assertEquals("один",StringChange("1"));
    }
    @Test
    public void StringChangeTest2()
    {
        assertEquals("одинодиндватри4",StringChange("11234"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void StringCopytest1()
    {
        StringChange(null);
    }
    @Test
    public void StringDeleteTest()
    {
        assertEquals("13",StringDelete(new StringBuilder("1234")));
        assertEquals("",StringDelete(new StringBuilder("")));
        assertEquals("1",StringDelete(new StringBuilder("1")));
        assertEquals("1",StringDelete(new StringBuilder("12")));
        assertEquals("13",StringDelete(new StringBuilder("123")));
    }
    @Test(expected = IllegalArgumentException.class)
    public void StringDeletetest1()
    {
        StringDelete(null);
    }
}