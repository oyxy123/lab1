package diana.stelmakh;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

//@RunWith(Spring)
public class MatrixTest1 {
    private Integer[][] bigMatrix = new Integer[][]{{ -11,   25,   63,   94,    75,  -16,    57},
                                                    { 129,  150,  511, -612, -1763,  414,   165},
                                                    {-117, 1458, -169, 2540,   251, -272,   223},
                                                    { -25,  216, -207,  298,   219,  230, -3341},
                                                    { 543, 3544,  385,  316,   387,  358,  -349},
                                                    {-461, -462,  473,  414,   145, -546,   747},
                                                    { 489,  510,   61,  -52,    43, -754,   155}};
    private Integer[][] emptyMatrix = new Integer[][]{};
    private Integer[][] edgeMatrix = new Integer[][]{{0,  0,  0,  0,  0},
                                                     {0,  0,  0,  0,  0},
                                                     {0,  0,  0,  0,  0},
                                                     {0,  0,  0,  0,  0},
                                                     {0,  0,  0,  0,  0}};

    private Integer[][] normalMatrix = new Integer[][]{{   -1,   2,  44,   76, -102},
                                                       {-122,   0,  23,  111,   -1},
                                                       {   5,  76,  1,  -56,   11},
                                                       {  64, 123,  65,   90,  -43},
                                                       {  69,   6, -23,   54,   75}};

    @Test
    public void getAverageBigMatrix(){
        Matrix matrix = new Matrix();
        assertEquals(133, matrix.getAverage(bigMatrix), 0.5);
    }
//
//    @Test
//    public void getAverageEmptyMatrix(){
//        Matrix matrix = new Matrix();
//        boolean isNan = Double.isNaN(matrix.getAverage(emptyMatrix));
//        assertTrue(isNan);
//    }
//
//
//    @Test
//    public void getAverageEdgeMatrix(){
//        Matrix matrix = new Matrix();
//        assertEquals(0, matrix.getAverage(edgeMatrix), 0.5);
//    }
//
//    @Test
//    public void getAverageNormalMatrix(){
//        Matrix matrix = new Matrix();
//        assertEquals(21.8, matrix.getAverage(normalMatrix), 0.5);
//    }
//
//
//    @Test
//    public void sortDescendingBigMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{ 94,   75,  63,  57,   25,  -11,   -16},
//                                          { 511,  414, 165, 150,  129, -612, -1763},
//                                          {2540, 1458, 251, 223, -117, -169,  -272},
//                                          { 298,  230, 219, 216,  -25, -207, -3341},
//                                          {3544,  543, 387, 385,  358,  316,  -349},
//                                          { 747,  473, 414, 145, -461, -462,  -546},
//                                          { 510,  489, 155,  61,   43,  -52,  -754}}, matrix.sortMatrixDescending(bigMatrix));
//    }
//
//    @Test
//    public void sortDescendingEdgeMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{0,  0,  0,  0,  0},
//                                           {0,  0,  0,  0,  0},
//                                           {0,  0,  0,  0,  0},
//                                           {0,  0,  0,  0,  0},
//                                           {0,  0,  0,  0,  0}}, matrix.sortMatrixDescending(edgeMatrix));
//    }
//
//
//    @Test
//    public void sortDescendingEmptyMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {}, matrix.sortMatrixDescending(emptyMatrix));
//    }
//
//    @Test
//    public void sortDescendingNormalMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{ 76,  44,   2,  -1, -102},
//                                           {111,  23,   0,  -1, -122},
//                                           { 76,  11,   5,   1,  -56},
//                                           { 123, 90,  65,  64,  -43},
//                                           { 75,  69,  54,   6,  -23}}, matrix.sortMatrixDescending(normalMatrix));
//    }
//
//    @Test
//    public void sortAscendingBigMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{  -16,  -11,   25,  57,  63,   75,   94},
//                                           {-1763, -612,  129, 150, 165,  414,  511},
//                                           { -272, -169, -117, 223, 251, 1458, 2540},
//                                           {-3341, -207,  -25, 216, 219,  230,  298},
//                                           { -349,  316,  358, 385, 387,  543, 3544},
//                                           { -546, -462, -461, 145, 414,  473,  747},
//                                           { -754,  -52,   43,  61, 155,  489,  510}}, matrix.sortMatrixAscending(bigMatrix));
//    }
//
//    @Test
//    public void sortAscendingEdgeMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{0,  0,  0,  0,  0},
//                                           {0,  0,  0,  0,  0},
//                                           {0,  0,  0,  0,  0},
//                                           {0,  0,  0,  0,  0},
//                                           {0,  0,  0,  0,  0}}, matrix.sortMatrixAscending(edgeMatrix));
//    }
//
//
//    @Test
//    public void sortAscendingEmptyMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {}, matrix.sortMatrixAscending(emptyMatrix));
//    }
//
//    @Test
//    public void sortAscendingNormalMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{-102, -1,  2, 44,  76},
//                                           {-122, -1,  0, 23, 111},
//                                           { -56,  1,  5, 11,  76},
//                                           { -43, 64, 65, 90, 123},
//                                           {-23,   6, 54, 69,  75}}, matrix.sortMatrixAscending(normalMatrix));
//    }
//
//    @Test
//    public void doTaskBigMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{ 94,   75,  63,  57,   25,  -11,   -16},
//                                           { 511,  414, 165, 150,  129, -612, -1763},
//                                           {2540, 1458, 251, 223, -117, -169,  -272},
//                                           { 298,  230, 219, 216,  -25, -207, -3341},
//                                           {3544,  543, 387, 385,  358,  316,  -349},
//                                           { 747,  473, 414, 145, -461, -462,  -546},
//                                           { 510,  489, 155,  61,   43,  -52,  -754}}, matrix.doTheTask(bigMatrix));
//}
//
//    @Test
//    public void doTaskEdgeMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{0,  0,  0,  0,  0},
//                {0,  0,  0,  0,  0},
//                {0,  0,  0,  0,  0},
//                {0,  0,  0,  0,  0},
//                {0,  0,  0,  0,  0}}, matrix.doTheTask(edgeMatrix));
//    }
//
//
//    @Test(expected = Exception.class)
//    public void doTaskEmptyMatrix(){
//        Matrix matrix = new Matrix();
//        matrix.doTheTask(emptyMatrix);
//    }
//
//    @Test
//    public void doTaskNormalMatrix(){
//        Matrix matrix = new Matrix();
//        assertArrayEquals(new Integer[][] {{-102, -1,  2, 44,  76},
//                                           {-122, -1,  0, 23, 111},
//                                           { -56,  1,  5, 11,  76},
//                                           { -43, 64, 65, 90, 123},
//                                           {-23,   6, 54, 69,  75}}, matrix.doTheTask(normalMatrix));
//
//    }
}