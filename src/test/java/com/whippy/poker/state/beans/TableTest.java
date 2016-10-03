//J-
package com.whippy.poker.state.beans;

import static org.junit.Assert.fail;
import org.junit.Test;


public class TableTest {

        //~ ----------------------------------------------------------------------------------------------------------------
        //~ Methods
        //~ ----------------------------------------------------------------------------------------------------------------

        @Test
        public void testInvalidSeat() {
                Table table = new Table(10);
                try {
                        table.getSeat(10);
                        fail("Seat should not exist");
                } catch (IllegalArgumentException e) {
                        //expected
                }
        }

}
//J+
