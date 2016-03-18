package com.olivierlafleur.machin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MachinTest {
    @Test
    public void test() {
        Machin machin = new Machin();

        machin.truc();

        assertEquals(3, machin.yoyo());

        Truc truc = new Truc(10);

        System.out.println(truc.bonjour2());
    }

}
