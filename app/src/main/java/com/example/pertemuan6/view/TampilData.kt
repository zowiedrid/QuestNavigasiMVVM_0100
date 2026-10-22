package com.example.pertemuan6

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview


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
        Pair(stringResource(id = R.string.alamat), "Jl. Contoh No. 123"),
}
