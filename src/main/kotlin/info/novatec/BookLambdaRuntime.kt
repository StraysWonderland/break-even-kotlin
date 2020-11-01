package info.novatec
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent
import io.micronaut.function.aws.runtime.AbstractMicronautLambdaRuntime
import java.net.MalformedURLException

class BookLambdaRuntime : AbstractMicronautLambdaRuntime<APIGatewayProxyRequestEvent?, APIGatewayProxyResponseEvent?, BreakEvenRequest?, BreakEvenResponse?>() {

    override fun createRequestHandler(vararg args: String?): RequestHandler<BreakEvenRequest?, BreakEvenResponse?>? {
        return BreakEvenRequestHandler()
    }

    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            try {
                BookLambdaRuntime().run(*args)
            } catch (e: MalformedURLException) {
                e.printStackTrace()
            }
        }
    }
}