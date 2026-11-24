package edu.compose.aula10.ordem

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class OrdemServico(val codigo: String, val tipo: String)

fun listaServicos(): List<OrdemServico> {
    return listOf(
        OrdemServico("12312", "Informática"),
        OrdemServico("45234", "Manuntenção"),
        OrdemServico("34234", "Compras")
    )
}

@Composable
fun CardOrdemServico(ordem: OrdemServico) {
    Card {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
        ) {
            Text(ordem.codigo)
            Spacer(Modifier.size(20.dp))
            Text(ordem.tipo)
        }
    }
}