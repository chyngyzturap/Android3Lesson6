package com.pharos.android3lesson6.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MathTest {
    private Math math;

    @Before
    public void setUp(){
        math = new Math();
        System.out.println("BEFORE");
    }

    @After
    public void clear() {
        math = null;
        System.out.println("AFTER");
    }

    @Test
    public void add() {
        assertEquals(6, math.add(4,2));
        System.out.println("ADD");
    }

    @Test
    public void sub() {
        assertEquals(2, math.sub(4,2));
        System.out.println("SUB");
    }

    @Test
    public void mul() {
        assertEquals(8, math.mul(4,2));
        System.out.println("MUL");
    }

    @Test
    public void div() {
        assertEquals(2, math.div(4,2));
        System.out.println("DIV");
    }

    @Test
    public void reverseWords() {
        assertEquals("Two One", math.reverseWords("One Two"));
    }
}