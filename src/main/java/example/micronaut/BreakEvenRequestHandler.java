package example.micronaut;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;
import java.util.UUID;

@Introspected
public class BreakEvenRequestHandler extends MicronautRequestHandler<BreakEvenRequest, BreakEvenResponse> {  // <1>

    @Override
    public BreakEvenResponse execute(BreakEvenRequest request) {
        BreakEvenResponse breakEvenResponse = new BreakEvenResponse();
        breakEvenResponse.breakEvenPoint = (int) Math.ceil(request.fixedCosts / (request.price - request.unitCosts));
        return breakEvenResponse;
    }
}
