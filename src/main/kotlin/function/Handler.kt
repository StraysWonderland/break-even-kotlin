package function

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import kotlin.math.ceil


@Controller("/")
class Handler {

    @Consumes(MediaType.APPLICATION_JSON)
    @Post(produces = [MediaType.APPLICATION_JSON])
    fun index(@JsonProperty("price") price: Double,
              @JsonProperty("fixedCosts") fixedCosts: Double,
              @JsonProperty("unitCosts") unitCosts: Double): Int {
        return ceil(fixedCosts / (price - unitCosts)).toInt()
    }
}
