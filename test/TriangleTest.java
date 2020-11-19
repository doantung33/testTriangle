import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testEquilateralsTriangle(){
        int canhA =2;
        int canhB= 2;
        int canhC= 2;
        String expected = "Tam giác đều";

        String result = Triangle.triangleType(canhA,canhB,canhC);
        assertEquals(expected,result);

    }
    @Test
    void testIsoscelesTriangle(){
        int canhA =2;
        int canhB =2;
        int canhC =3;
        String expected = "Tam giác cân";
        String result = Triangle.triangleType(canhA,canhB, canhC);
        assertEquals(expected,result);
    }
    @Test
    void testTriangle (){
        int canhA =3;
        int canhB= 4;
        int canhC= 5;
        String expected = "Tam giác thường";
        String result = Triangle.triangleType(canhA,canhB,canhC);
        assertEquals(expected,result);
    }
    @Test
    void testNotTriangle (){
        int canhA =2;
        int canhB= 4;
        int canhC= 9;
        String expected = "Không phải tam giác";
        String result = Triangle.triangleType(canhA,canhB,canhC);
        assertEquals(expected,result);
    }

}