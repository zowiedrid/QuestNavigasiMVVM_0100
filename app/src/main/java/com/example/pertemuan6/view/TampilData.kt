package com.example.pertemuan6

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text


@Preview(showBackground = true)
@Composable
fun TampilDataPreview() {
    TampilData()
}

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackButtonClick: () -> Unit = {}
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "John Doe"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Laki-laki"),
        Pair(stringResource(id = R.string.alamat), "Jl. Contoh No. 123"),)
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.tampil)) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.teal_700))
            )
        }) {isiRuang ->
        Column (modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            items.forEach { item ->
                Column{
                    Text(text = item.first.uppercase(), fontSize = 16.sp)
                    Text(text = item.second, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize = 20.sp)
                }

                HorizontalDivider(
                    thickness = 1.dp, color = Color.Cyan
                )

            }
            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { onBackButtonClick() },
                modifier = Modifier.padding(10.dp)
            ) {
                Text(text = stringResource(id = R.string.back))
        }

    }
}}
