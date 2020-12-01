package example.micronaut;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BreakEvenRequestRequestHandlerTest {

    private static BreakEvenRequestHandler breakEvenRequestHandler;

    @BeforeAll
    public static void setupServer() {
        breakEvenRequestHandler = new BreakEvenRequestHandler(); // <1>
    }

    @AfterAll
    public static void stopServer() {
        if (breakEvenRequestHandler != null) {
            breakEvenRequestHandler.getApplicationContext().close(); // <2>
        }
    }

    @Test
    public void testHandler() {
        BreakEvenRequest breakEvenRequest = new BreakEvenRequest();
        breakEvenRequest.price = 20.00;
        breakEvenRequest.unitCosts = 10.00;
        breakEvenRequest.fixedCosts = 100.00;
        BreakEvenResponse breakEvenResponse = breakEvenRequestHandler.execute(breakEvenRequest);  // <3>
        assertNotNull(breakEvenResponse);
        int breakEvenPoint = (int) Math.ceil(breakEvenRequest.fixedCosts / (breakEvenRequest.price - breakEvenRequest.unitCosts));
        assertEquals(breakEvenPoint, breakEvenResponse.breakEvenPoint);
    }
}
