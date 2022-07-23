/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALA I
 */
public class EstudiantePresencialTest {
    public EstudiantePresencialTest() {
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
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testEstablecerNumeroCreditos() throws NoSuchFieldException, 
            IllegalArgumentException, 
            IllegalAccessException {
        System.out.println("establecerNumeroCreditos");
        int numero = 120;
        EstudiantePresencial instance = new EstudiantePresencial();
        instance.establecerNumeroCreditos(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 120);
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testEstablecerCostoCredito() throws NoSuchFieldException, 
            IllegalArgumentException, 
            IllegalAccessException {
        System.out.println("establecerCostoCredito");
        double costo = 60.0;
        EstudiantePresencial instance = new EstudiantePresencial();
        instance.establecerCostoCredito(costo);
        Field field = instance.getClass().getDeclaredField("costoCredito");
        field.setAccessible(true);
        assertEquals(field.get(instance), 60.0);
    }

    /**
     * Test of calcularMatriculaPresencial method, of class EstudiantePresencial.
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testCalcularMatriculaPresencial() throws NoSuchFieldException, 
            IllegalArgumentException, 
            IllegalAccessException {
        System.out.println("calcularMatriculaPresencial");
        EstudiantePresencial instance = new EstudiantePresencial();
        instance.calcularMatriculaPresencial();
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 0);
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos(){
        System.out.println("obtenerNumeroCreditos");
        int numeroCreditos = 120;
        EstudiantePresencial instance = new EstudiantePresencial();
        instance.establecerNumeroCreditos(numeroCreditos);
        assertEquals(instance.obtenerNumeroCreditos(), 120);
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito(){
        System.out.println("obtenerCostoCredito");
        EstudiantePresencial instance = new EstudiantePresencial();
        double costoCredito = 60;
        instance.obtenerCostoCredito();
        assertEquals(costoCredito, instance.obtenerCostoCredito(), 60.0);
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial(){
        System.out.println("obtenerMatriculaPresencial");
        EstudiantePresencial instance = new EstudiantePresencial();
        double matriculaPresencial = 3400;
        instance.calcularMatriculaPresencial();
        assertEquals(matriculaPresencial,instance.obtenerMatriculaPresencial(), 3400);
    }
    
}
