package javaPractice02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SquarelotronTest {
    int size = 5;
    Squarelotron s;
     
    @Before
    public void setUp() throws Exception {
	s = new Squarelotron(size);
    }
    
    @Test
    public void testSquarelotron() {
	assertEquals(size, s.size);
	assertEquals(1, s.squarelotron[0][0]);
	assertEquals(size * size, s.squarelotron[size -1][size -1]);
    }
    
    @Test
    public void testUpsideDownFlip() {
	
	Squarelotron a = s.upsideDownFlip(1);
	assertEquals(1, a.squarelotron[4][0]);
	assertEquals(17, a.squarelotron[3][1]);
	assertEquals(10, a.squarelotron[3][4]);

    }
    

    @Test
    public void testMainDiagonalFlip() {
	Squarelotron r = s.mainDiagonalFlip(2);
	assertEquals(9, r.squarelotron[3][1]);
	assertEquals(5, r.squarelotron[0][4]);
	Squarelotron b = s.mainDiagonalFlip(1);
	assertEquals(15, b.squarelotron[4][2]);
    }

    @Test
    public void testRotateRight() {
	Squarelotron t = new Squarelotron(5);
	t.rotateRight(1);
	assertEquals(21, t.squarelotron[0][0]);
	assertEquals(17, t.squarelotron[1][1]);
	Squarelotron u = t.upsideDownFlip(1);
	assertEquals(1, u.squarelotron[4][4]);
	assertEquals(17, t.squarelotron[1][1]);
    }
    @Test
    public void testRotaterightNeg() {
	Squarelotron t = new Squarelotron(5);
	t.rotateRight(-1);
	assertEquals(10, t.squarelotron[0][1]);
	Squarelotron u = t.mainDiagonalFlip(1);
	assertEquals(25, u.squarelotron[4][0]);
	assertEquals(7, u.squarelotron[3][1]);
	assertEquals(10, t.squarelotron[0][1]);
    }
    @Test
    public void testRotateRightLargeNum() {
	Squarelotron t = new Squarelotron(5);
	t.rotateRight(6);
	assertEquals(14, t.squarelotron[2][1]);
	assertEquals(6, t.squarelotron[3][4]);
	Squarelotron u = t.upsideDownFlip(2);
	assertEquals(18, u.squarelotron[3][2]);
	u.rotateRight(-6);
	assertEquals(8, u.squarelotron[3][2]);
	assertEquals(14, t.squarelotron[2][1]);
    }
    
    
    

}







