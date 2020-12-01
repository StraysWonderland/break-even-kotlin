package example.micronaut;
import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.core.annotation.Introspected;
import javax.validation.constraints.NotBlank;

@Introspected // <1>
public class BreakEvenRequest {

    public double unitCosts = 0.00;
    public double price = 0.00;
    public double fixedCosts = 0.00;

    public BreakEvenRequest() {
    }

}