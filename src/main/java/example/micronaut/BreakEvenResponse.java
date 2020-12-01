package example.micronaut;

import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;

@Introspected // <1>
public class BreakEvenResponse {

    @NotBlank // <2>
    @NonNull // <3>
    public Integer breakEvenPoint = 0;
    
    public BreakEvenResponse() {
    }

    @NonNull
    public Integer getBreakEvenPoint() {
        return breakEvenPoint;
    }
}
