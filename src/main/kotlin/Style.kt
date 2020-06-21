package mchpr

import kotlinx.css.*
import kotlinx.css.properties.BoxShadow
import kotlinx.css.properties.TextDecoration

fun getStyle(): String =
    CSSBuilder().apply {
        body {
            marginTop = 50.px
            backgroundColor = Color("#222222")
            color = Color("#444444")
            fontFamily = "'Montserrat', sans-serif"
        }
        i {
            color = Color("#212121")
        }
        span {
            color = Color("#e57373")
        }
        hr {
            width = LinearDimension("80%")
            border = "0px"
            borderTop = "1px solid #e0e0e0"
        }
        h4 {
            textAlign = TextAlign.center
        }
        p {
            width = LinearDimension("100%")
            textAlign = TextAlign.center
        }
        a {
            textDecoration = TextDecoration.none
            color = Color("#e57373")
        }
        ".center" {
            margin = "auto"
            width = LinearDimension.fitContent
        }
        ".middleAlign" {
            verticalAlign = VerticalAlign.middle
        }
        ".generalButton" {
            color = Color.initial
            backgroundColor = Color("#e57373")
            border = "none"
            borderRadius = 3.px
            padding = "10px"
            minWidth = 160.px
            verticalAlign = VerticalAlign.middle
            textAlign = TextAlign.center
            fontWeight = FontWeight.bold
            fontFamily = "'Montserrat', sans-serif"
            boxShadow += BoxShadow(
                inset = false,
                offsetX = 0.px,
                offsetY = 0.px,
                color = Color("#888888"),
                spreadRadius = 0.px,
                blurRadius = 10.px
            )
        }
        ".leftFloat" {
            display = Display.inlineBlock
            float = kotlinx.css.Float.left
            marginLeft = 60.px
        }
        ".rightFloat" {
            display = Display.inlineBlock
            float = kotlinx.css.Float.right
            marginRight = 60.px
        }
        "#content" {
            minHeight = 100.px
            display = Display.grid
        }
        "#main" {
            backgroundColor = Color.white
            width = 350.px
            padding = "20px"
            borderRadius = 3.px
            boxShadow += BoxShadow(
                inset = false,
                offsetX = 0.px,
                offsetY = 0.px,
                color = Color("#888888"),
                spreadRadius = 0.px,
                blurRadius = 10.px
            )
        }
    }.toString()
