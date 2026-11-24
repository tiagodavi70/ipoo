package edu.compose.aula10

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import edu.compose.aula10.ordem.CardOrdemServico
import edu.compose.aula10.ordem.TelaOrdem

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "aula10",
    ) {
        //App()
        TelaOrdem()
    }
}