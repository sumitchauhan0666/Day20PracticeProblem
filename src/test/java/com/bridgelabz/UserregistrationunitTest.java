package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

class UserregistrationunitTest {
    Userregistrationunit obj=new Userregistrationunit();

    @org.junit.jupiter.api.BeforeEach
    void m4() {

        System.out.println("Beforeeach");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void nameHappyMatch() {
       String result= obj.NameMatch("Ram");
       String expectedResult="Happy";
        assertEquals(expectedResult,result);
        System.out.println("Happy");
    }
    @org.junit.jupiter.api.Test
    void nameSadMatch() {
        String result= obj.NameMatch("yam");
        String expectedResult="Sad";
        assertEquals(expectedResult,result);
        System.out.println("Sad");
    }
    @org.junit.jupiter.api.Test
    void emailHappyMatch() {
        String result= obj.EmailMatch("samyam@gmlm.com");
        String expectedResult="Happy";
        assertEquals(expectedResult,result);
        System.out.println("Happy");
    }
    @org.junit.jupiter.api.Test
    void emailSadMatch() {
        String result= obj.EmailMatch("samyam@yahoo...com");
        String expectedResult="Sad";
        assertEquals(expectedResult,result);
        System.out.println("Sad");
    }


    @org.junit.jupiter.api.Test
    void mobileHappyMatch() {
        String result=obj.MobileMatch("91 8989878790");
        String expectedresult="Happy";
        assertEquals(expectedresult,result);
        System.out.println("Happy");
    }
    @org.junit.jupiter.api.Test
    void mobileSadMatch() {
        String result=obj.MobileMatch("910008989878790");
        String expectedresult="Sad";
        assertEquals(expectedresult,result);
        System.out.println("Sad");
    }
}