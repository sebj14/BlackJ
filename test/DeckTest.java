/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ShuffleCards method, of class Deck.
     */
    @Test
    public void testShuffleCards() {
        System.out.println("ShuffleCards");
        Deck instance = new Deck();
        instance.ShuffleCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInto method, of class Deck.
     */
    @Test
    public void testIsInto() {
        System.out.println("isInto");
        int j = 0;
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.isInto(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnextCard method, of class Deck.
     */
    @Test
    public void testGetnextCard() {
        System.out.println("getnextCard");
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.getnextCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ResetCards method, of class Deck.
     */
    @Test
    public void testResetCards() {
        System.out.println("ResetCards");
        Deck instance = new Deck();
        instance.ResetCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardsArray method, of class Deck.
     */
    @Test
    public void testGetCardsArray() {
        System.out.println("getCardsArray");
        Deck instance = new Deck();
        Card[] expResult = null;
        Card[] result = instance.getCardsArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCardsArray method, of class Deck.
     */
    @Test
    public void testSetCardsArray() {
        System.out.println("setCardsArray");
        Card[] cardsArray = null;
        Deck instance = new Deck();
        instance.setCardsArray(cardsArray);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShuffeledCards method, of class Deck.
     */
    @Test
    public void testGetShuffeledCards() {
        System.out.println("getShuffeledCards");
        Deck instance = new Deck();
        int[] expResult = null;
        int[] result = instance.getShuffeledCards();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShuffeledCards method, of class Deck.
     */
    @Test
    public void testSetShuffeledCards() {
        System.out.println("setShuffeledCards");
        int[] shuffeledCards = null;
        Deck instance = new Deck();
        instance.setShuffeledCards(shuffeledCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTopDeck method, of class Deck.
     */
    @Test
    public void testGetTopDeck() {
        System.out.println("getTopDeck");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.getTopDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTopDeck method, of class Deck.
     */
    @Test
    public void testSetTopDeck() {
        System.out.println("setTopDeck");
        int topDeck = 0;
        Deck instance = new Deck();
        instance.setTopDeck(topDeck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrintShuffeledCards method, of class Deck.
     */
    @Test
    public void testPrintShuffeledCards() {
        System.out.println("PrintShuffeledCards");
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.PrintShuffeledCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
