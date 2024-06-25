package com.example.paginacion.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PaginacionScreen() {
    val pagerState = rememberPagerState (initialPage = 8) {
        4
    }
    Box(modifier = Modifier){
        HorizontalPager(state = pagerState) {
            page -> when(page){
                0-> Pagina1(page)
                1-> Pagina2(page)
                2-> Pagina3(page)
                3-> Pagina4(page)
            }
        }
    }
}

@Composable
fun Pagina1(contect:Int) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "Pagina $contect")
    }
}

@Composable
fun Pagina2(contect:Int) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "Pagina $contect")
    }
}

@Composable
fun Pagina3(contect:Int) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "Pagina $contect")
    }
}

@Composable
fun Pagina4(contect:Int) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "Pagina $contect")
    }
}


@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun Result(){
    PaginacionScreen()
}