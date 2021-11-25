package com.company;


import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;

public class PrisKonverteringsTest {
    private static int udregnPris(String pris){
        String prisUdenM = String.valueOf(pris.charAt(1));
        return Integer.parseInt(prisUdenM);
    }
    //Tester på pladen uden M
    @Test
    public void Konvertering(){
        int udregnetPris = udregnPris("M3");
        assertEquals(udregnetPris, 3);
    }
}
