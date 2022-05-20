package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductTest {

    double productCost = 5;
    int productQuantity = 7;
    String productName = "Balloons";
    
    @Test
    public void printProduct( ){
        System.out.println(this.productName + " cost "  + this.productCost + " and " + this.productQuantity + " were purchased." );

        assertEquals("Balloons cost 5.0 and 7 were purchased.", this.productName + " cost "  + this.productCost + " and " + this.productQuantity + " were purchased." );
    }
}
