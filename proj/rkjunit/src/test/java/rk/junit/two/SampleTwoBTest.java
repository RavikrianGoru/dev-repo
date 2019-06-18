package rk.junit.two;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName ("SampleTwoBTestClass")
public class SampleTwoBTest
{
    @BeforeAll
    static void setUp()
    {
        System.out.println("@BeforeAll rk.junit.two SampleTwoBTest");// Runs before all TC in class
    }

    @BeforeEach
    void beforeEachTC()
    {
        System.out.println("@BeforeEach");// Runs before each TC in class
    }

    @AfterEach
    void afterEachTC()
    {
        System.out.println("@AfterEach");// Runs after each TC in class
    }

    @AfterAll
    static void tear()
    {
        System.out.println("@AfterALL");
    }

    @Tag ("DEV")
    @Test
    void testOne()
    {
        System.out.println("TestOne TC in class");
    }

    @Tag ("DEV")
    @Test
    void testTwo()
    {
        System.out.println("TestTwo TC in class");
    }

    @Tag ("PROD")
    @Test
    @Disabled
    void testProdOne()
    {
        System.out.println("TestProdOne TC for producrion not required in client end.");
    }
}
