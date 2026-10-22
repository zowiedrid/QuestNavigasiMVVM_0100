package com.example.pertemuan6

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
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
        Pair(stringResource(id = R.string.alamat), "Jl. Contoh No. 123"),)
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.tampil)) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.teal_700))
            )
        }) {

    }
}
