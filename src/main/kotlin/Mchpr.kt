package mchpr

import io.ktor.application.call
import io.ktor.http.content.resource
import io.ktor.http.content.static
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    val mchpr = embeddedServer(Netty, 8080) {
        routing {
            static("/static") {
                resource("favicon.ico")
            }
            get("/") {
                pageLanding(call)
            }
            get("/client") {
                pageClient(call)
            }
            get("/server") {
                pageServer(call)
            }
            get("/discord") {
                pageDiscord(call)
            }
            get("/github") {
                pageGithub(call)
            }
        }
    }
    mchpr.start(wait = true)
}
