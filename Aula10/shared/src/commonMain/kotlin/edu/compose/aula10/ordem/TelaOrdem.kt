package edu.compose.aula10.ordem

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun TelaOrdem() {
    var ordens by remember { mutableStateOf(listaServicos()) }
    MaterialTheme {
        Row(modifier = Modifier
            .padding(50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier
                .padding(10.dp)
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CardOrdemServico(ordens[0])
                Spacer(Modifier.size(10.dp))
                CardOrdemServico(ordens[1])
                Spacer(Modifier.size(10.dp))
                CardOrdemServico(ordens[2])
            }
            Spacer(Modifier.size(10.dp))

            LazyColumn(modifier = Modifier
                .padding(10.dp)
                .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(ordens) {
                    CardOrdemServico(it)
                    Spacer(Modifier.size(10.dp))
                }
            }
        }
    }
}