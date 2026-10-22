package com.example.pertemuan6.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan6.TampilData

enum class Navigasi{
    formulirSaya,
    Detail
}

@Composable
fun DataApp(

    NavController : NavHostController = rememberNavController()
){
    Scaffold() { isiRuang ->
        NavHost(
            navController = NavController,
            startDestination = Navigasi.formulirSaya.name,
            modifier = androidx.compose.ui.Modifier.padding(isiRuang)
        ){
            composable (route = Navigasi.formulirSaya.name){
                FormIsian(OnSubmitButtonClick = {
                    NavController.navigate(Navigasi.Detail.name)
                })
            }
            composable(route = Navigasi.Detail.name){
                TampilData (onBackButtonClick = {
                    cancelAndBackToFormulirSaya(navController = NavController)
                })
            }
        }

    }
}

private fun cancelAndBackToFormulirSaya(
    navController: NavController
){
    navController.popBackStack(route = Navigasi.formulirSaya.name, inclusive = false)
}