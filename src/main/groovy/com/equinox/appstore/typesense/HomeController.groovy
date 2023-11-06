package com.equinox.appstore.typesense
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class HomeController {

    @Get
    Map<String, Object> index() {
        [message: "Hello World"]
    }
}