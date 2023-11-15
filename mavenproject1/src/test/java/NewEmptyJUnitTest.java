/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.mavenproject1.Operations;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Ingenieria
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void NextNumber_NextNumberGTown_AddedANumber() {
    
        int userNumber = 10;
        int expectedResult = 11; 
        
        int result = Operations.NextNumber(userNumber);
        
        assertEquals(11,result);
    }
    
       @Test
    public void IsDivisible_ToIntegerNumbers_IsDivisible() {
    
        int firstNumber = 5;
        int secondNumber = 5;
        
        boolean methodResult = Operations.IsDivisible(firstNumber, secondNumber);
        
        assertTrue(methodResult);
    }
    
    @Test
    public void testConvertirCentimetrosAYardas() {
        int cm = 100;
        double expectedYards = 1.09361; // The expected value may vary based on precision.
        double yards = Operations.ConvertirCentimetrosAYardas(cm);
        assertEquals(expectedYards, yards, 0.001); // Specify a delta for double comparisons.
    }

    @Test
    public void testConvertirCentimetrosAMetros() {
        int cm = 100;
        double expectedMeters = 1.0;
        double meters = Operations.ConvertirCentimetrosAMetros(cm);
        assertEquals(expectedMeters, meters, 0.001);
    }

    @Test
    public void testConvertirCentimetrosAPies() {
        int cm = 100;
        double expectedFeet = 3.28084; // The expected value may vary based on precision.
        double feet = Operations.ConvertirCentimetrosAPies(cm);
        assertEquals(expectedFeet, feet, 0.001);
    }

    @Test
    public void testConvertirCentimetrosAPulgadas() {
        int cm = 100;
        double expectedInches = 39.37008; // The expected value may vary based on precision.
        double inches = Operations.ConvertirCentimetrosAPulgadas(cm);
        assertEquals(expectedInches, inches, 0.001);
    }

     @Test
    public void testCalcularPorcentajeHombres() {
        int totalHombres = 30;
        int totalMujeres = 20;

        double expectedPorcentajeHombres = 60.0; // Ajusta el valor esperado según tus datos.

        double porcentajeHombres = Operations.CalcularPorcentajeHombres(totalHombres, totalMujeres);

        assertEquals(expectedPorcentajeHombres, porcentajeHombres, 0.001);
    }
    
    @Test
    public void testCalcularPorcentajeMujeres() {
        int totalHombres = 30;
        int totalMujeres = 20;

        double expectedPorcentajeMujeres = 40.0; // Ajusta el valor esperado según tus datos.

        double porcentajeMujeres = Operations.CalcularPorcentajeMujeres(totalHombres, totalMujeres);

        assertEquals(expectedPorcentajeMujeres, porcentajeMujeres, 0.001);
    }
}
