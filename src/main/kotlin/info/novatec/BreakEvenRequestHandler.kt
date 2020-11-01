package info.novatec
import io.micronaut.core.annotation.Introspected
import io.micronaut.function.aws.MicronautRequestHandler

@Introspected
class BreakEvenRequestHandler : MicronautRequestHandler<BreakEvenRequest?, BreakEvenResponse?>() {

    override fun execute(input: BreakEvenRequest?): BreakEvenResponse? {
        return if (input != null) {
            val response = BreakEvenResponse()
            response.breakEvenPoint = kotlin.math.ceil(input.fixedCosts / (input.price - input.unitCosts)).toInt()
            return response
        } else {
            null
        }
    }
}