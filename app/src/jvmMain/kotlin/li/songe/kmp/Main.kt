package li.songe.kmp

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

val times = mutableListOf("jvm" to System.currentTimeMillis())

fun timeString(): String = times.mapIndexedNotNull { i, timer ->
    if (i > 0) {
        "${times[i - 1].first} -> ${timer.first}" to timer.second - times[i - 1].second
    } else {
        null
    }
}.joinToString(separator = "\n") {
    "${it.first}: ${it.second}ms"
}

fun main() {
    times.add("main" to System.currentTimeMillis())
    application {
        remember { times.add("Window" to System.currentTimeMillis()) }
        Window(
            onCloseRequest = ::exitApplication,
        ) {
            remember { times.add("App" to System.currentTimeMillis()) }
            SelectionContainer {
                Text(
                    text = "java: ${Runtime.version()}\n" + timeString(),
                    modifier = Modifier.padding(24.dp),
                )
            }
        }
    }
}

