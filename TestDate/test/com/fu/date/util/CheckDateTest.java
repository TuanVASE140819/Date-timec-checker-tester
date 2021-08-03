/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.date.util;

import com.fu.date.CheckDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckDateTest {

    @Test
    public void UTCID01() {
        assertEquals(true, CheckDate.CheckDate("29", "2", "2000"));

    }
     @Test
    public void UTCID02() {
        assertEquals(false, CheckDate.CheckDate("29", "2", "2009"));

    }
//    @Test
//    public void UTCID03() {
//        assertEquals(false, CheckDate.CheckDate("31", "2", "2020"));
//
//    }
//    @Test
//    public void UTCID04() {
//        assertEquals(true, CheckDate.CheckDate("30", "4", "2020"));
//
//    }
//    @Test
//    public void UTCID05() {
//        assertEquals(true, CheckDate.CheckDate("28", "2", "2022"));
//
//    }
//    @Test(expected = NullPointerException.class)
//    public void UTCID06() {
//         CheckDate.CheckDate("", "12", "2028");
//
//    }
//    @Test
//    public void UTCID07() {
//        assertEquals(false, CheckDate.CheckDate("0", "3", "2009"));
//
//    }
//    @Test
//    public void UTCID08() {
//        assertEquals(true, CheckDate.CheckDate("30", "4", "2022"));
//
//    }
//    @Test
//    public void UTCID09() {
//        assertEquals(false, CheckDate.CheckDate("31", "4", "2000"));
//
//    }
//    @Test
//    public void UTCID10() {
//        assertEquals(true, CheckDate.CheckDate("30", "12", "2100"));
//
//    }
}
