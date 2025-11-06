package es.upm.grise.profundizacion.cruisecontroller;
    import static org.junit.jupiter.api.Assertions.assertThrows;
    import static org.junit.jupiter.api.Assertions.assertTrue;
    import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.cruisecontrol.CruiseControl;
import es.upm.grise.profundizacion.cruisecontrol.IncorrectSpeedSetException;
import es.upm.grise.profundizacion.cruisecontrol.SpeedSetAboveSpeedLimitException;
class CruiseControlTest {

    @Test
    void constructorTest(){
        CruiseControl cruCon = new CruiseControl();
        assertTrue(cruCon.getSpeedSet() == null&&cruCon.getSpeedLimit() == null);
    }

    @Test
    void setSpeedSetNegativeTest()  throws SpeedSetAboveSpeedLimitException, IncorrectSpeedSetException {
        CruiseControl cruCon = new CruiseControl();
        assertThrows(IncorrectSpeedSetException.class, () -> cruCon.setSpeedSet(-15));
    }

    @Test
    void setSpeedSetAboveLimitTest()  throws SpeedSetAboveSpeedLimitException, IncorrectSpeedSetException {
        CruiseControl cruCon = new CruiseControl();
        cruCon.setSpeedLimit(100);
        assertThrows(SpeedSetAboveSpeedLimitException.class, () -> cruCon.setSpeedSet(101));
    }
	
}
