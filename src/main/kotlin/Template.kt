package mchpr

import io.ktor.html.Placeholder
import io.ktor.html.Template
import io.ktor.html.insert
import kotlinx.html.*

class LandingTemplate : Template<HTML> {
    val base = BaseTemplate()
    override fun HTML.apply() {
        insert(base) {
            content {
                br {  }
                a("/client") {
                    classes = setOf("generalButton center")
                    i {
                        classes = setOf("fab fa-github")
                    }
                    +" Client"
                }
                br {  }
                a("/server") {
                    classes = setOf("generalButton center")
                    i {
                        classes = setOf("fab fa-github")
                    }
                    +" Server"
                }
                br {  }
            }
        }
    }
}

class BaseTemplate : Template<HTML> {
    val content = Placeholder<FlowContent>()
    override fun HTML.apply() {
        head {
            title {
                +"MCHPR | Minecraft High Performance Redstone"
            }
            link(href = "https://use.fontawesome.com/releases/v5.1.1/css/all.css", rel = "stylesheet")
            link(href = "/static/favicon.ico", rel = "icon")
            link(href = "https://fonts.googleapis.com/css?family=Montserrat&display=swap", rel = "stylesheet")
            style {
                unsafe {
                    raw(getStyle())
                }
            }
        }
        body {
            div {
                id = "main"
                classes = setOf("center")
                h4 {
                    +"Minecraft High Performance Redstone"
                }
                hr { }
                div {
                    id = "content"
                    insert(content)
                }
                hr { }
                p {
                    style = "font-size:0.8em;"
                    a("/github") {
                        +"GitHub"
                    }
                    +" | "
                    a("/discord") {
                        +"Discord"
                    }
                }
            }
        }
    }
}
