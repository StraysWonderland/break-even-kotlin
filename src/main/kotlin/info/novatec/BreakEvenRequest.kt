package info.novatec
import io.micronaut.core.annotation.Introspected

@Introspected
class BreakEvenRequest {
    var price: Double = 0.0
    var unitCosts: Double = 0.0
    var fixedCosts: Double = 0.0
}