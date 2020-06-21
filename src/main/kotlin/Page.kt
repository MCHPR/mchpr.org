package mchpr

import io.ktor.application.ApplicationCall
import io.ktor.html.respondHtmlTemplate
import io.ktor.response.respondRedirect

suspend fun pageLanding(call: ApplicationCall) {
    call.respondHtmlTemplate(LandingTemplate()) { }
}

suspend fun pageClient(call: ApplicationCall) {
    call.respondRedirect("https://github.com/MCHPR/MCHPRC", permanent = false)
    // TODO() Make a fancy Client page
}

suspend fun pageServer(call: ApplicationCall) {
    call.respondRedirect("https://github.com/MCHPR/MCHPRS", permanent = false)
    // TODO() Make a fancy Server page
}

suspend fun pageDiscord(call: ApplicationCall) {
    call.respondRedirect("https://discord.com/invite/svK9JU7", permanent = true)
}

suspend fun pageGithub(call: ApplicationCall) {
    call.respondRedirect("https://github.com/MCHPR", permanent = true)
}
