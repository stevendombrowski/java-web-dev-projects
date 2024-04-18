package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void trueTest1(){assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}
    @Test
    public void trueTest2(){assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));}
    @Test
    public void trueTest3(){assertTrue((BalancedBrackets.hasBalancedBrackets("[]LaunchCode")));}
    @Test
    public void trueTest4(){assertTrue((BalancedBrackets.hasBalancedBrackets("")));}
    @Test
    public void trueTest5(){assertTrue((BalancedBrackets.hasBalancedBrackets("[]")));}

//    False tests below
    @Test
    public void falseTest1(){assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}
    @Test
    public void falseTest2(){assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}
    @Test
    public void falseTest3(){assertFalse(BalancedBrackets.hasBalancedBrackets("["));}
    @Test
    public void falseTest4(){assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}

}