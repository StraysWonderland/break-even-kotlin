package info.novatec

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class BreakEvenRequestHandlerTest {

    @Test
    fun testHandler() {
        val bookRequestHandler = BreakEvenRequestHandler()
        val breakEvenRequest = BreakEvenRequest()
        breakEvenRequest.price = 10.0
        breakEvenRequest.fixedCosts = 100.0
        breakEvenRequest.unitCosts = 20.0
        val bookSaved = bookRequestHandler.execute(breakEvenRequest)
        Assertions.assertNotNull(bookSaved)
        var breakEvenPoint = kotlin.math.ceil(breakEvenRequest.fixedCosts / (breakEvenRequest.price - breakEvenRequest.unitCosts)).toInt()
        Assertions.assertEquals(breakEvenPoint, bookSaved!!.breakEvenPoint)
        bookRequestHandler.applicationContext.close()
    }
}