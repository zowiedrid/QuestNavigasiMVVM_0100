package com.example.pertemuan6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import com.example.pertemuan6.R


@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitButtonClick: () -> Unit) {

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.home), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(id = R.color.teal_700)
                )
            )
        }
    ){isiRuang ->
        Column(modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) { }
    }
}

