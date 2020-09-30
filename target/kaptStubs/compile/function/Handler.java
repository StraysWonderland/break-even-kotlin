package function;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lfunction/Handler;", "", "()V", "index", "", "price", "", "fixedCosts", "unitCosts", "function"})
@io.micronaut.http.annotation.Controller(value = "/")
public final class Handler {
    
    @io.micronaut.http.annotation.Post(produces = {"application/json"})
    @io.micronaut.http.annotation.Consumes(value = {"application/json"})
    public final int index(@com.fasterxml.jackson.annotation.JsonProperty(value = "price")
    double price, @com.fasterxml.jackson.annotation.JsonProperty(value = "fixedCosts")
    double fixedCosts, @com.fasterxml.jackson.annotation.JsonProperty(value = "unitCosts")
    double unitCosts) {
        return 0;
    }
    
    public Handler() {
        super();
    }
}