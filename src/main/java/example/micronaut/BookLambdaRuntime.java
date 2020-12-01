package example.micronaut;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import io.micronaut.function.aws.runtime.AbstractMicronautLambdaRuntime;
import java.net.MalformedURLException;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import edu.umd.cs.findbugs.annotations.Nullable;

public class BookLambdaRuntime extends AbstractMicronautLambdaRuntime<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent, BreakEvenRequest, BreakEvenResponse> {

    public static void main(String[] args) {
        try {
            new BookLambdaRuntime().run(args);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    @Nullable
    protected RequestHandler<BreakEvenRequest, BreakEvenResponse> createRequestHandler(String... args) {
        return new BreakEvenRequestHandler();
    }
}
