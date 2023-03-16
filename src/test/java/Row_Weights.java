import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class Row_Weights
{
    @Test
    public void Basic_Tests()
    {
        assertArrayEquals(new int[]{80,0}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{80}));
        assertArrayEquals(new int[]{100,50}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{120,140}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{50,60,70,80}));
    }
    @Test
    public void Odd_Vector_Length()
    {
        assertArrayEquals(new int[]{62,27}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{13,27,49}));
        assertArrayEquals(new int[]{236,92}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{70,58,75,34,91}));
        assertArrayEquals(new int[]{211,164}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{29,83,67,53,19,28,96}));
    }
    @Test
    public void Even_Vector_Length()
    {
        assertArrayEquals(new int[]{100,50}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{150,151}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{100,51,50,100}));
        assertArrayEquals(new int[]{207,235}, org.example.kyu_7.Row_Weights.rowWeights(new int[]{39,84,74,18,59,72,35,61}));
    }
}