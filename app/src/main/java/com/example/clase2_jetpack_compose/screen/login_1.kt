package com.example.clase2_jetpack_compose.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase2_jetpack_compose.R

@Composable
fun Waos(page: Int){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ){
        Ventanas()
    }

}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Ventanas() {
    val pagerState = rememberPagerState (initialPage = 0) {
        2
    }
    Box(modifier = Modifier){
        HorizontalPager(state = pagerState) {
                page -> when(page){
            0 -> Contenido()
            1 -> Main()
        }
        }
    }
}




@Composable
fun Contenido() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.height(20.dp)) {

        }
        Filas1(img = R.drawable.icono2, descript = "Este es el icono")
        Text(
            text = "Welcome to LemonPie!",
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Keep your data safe",
            color = Color.Gray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp),
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        /*TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("correo123@mail.com", fontWeight = FontWeight.Bold) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .background(Color.LightGray, shape = RoundedCornerShape(20.dp))
                .clip(RoundedCornerShape(20.dp))
        )
        TextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("•••••••••••••••", fontWeight = FontWeight.Bold) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .background(Color.LightGray, shape = RoundedCornerShape(20.dp))
                .clip(RoundedCornerShape(20.dp))
        )*/
        TextfielMain()
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Yellow),
        ) {
            Text(text ="LOGIN",
                modifier = Modifier.padding(horizontal = 100.dp),
                color = Color.Black,
                fontSize = 13.sp,
            )
        }
        Text(
            text = "Forgot password?",
            color = Color.Yellow,
            modifier = Modifier.padding(2.dp),
            textAlign = TextAlign.Center,
            fontSize = 14.sp
        )
        Box {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Do you have an account?",
                    modifier = Modifier.padding(10.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp
                )
                Text(
                    text = "contact@mail.com",
                    color = Color.Yellow,
                    modifier = Modifier.padding(2.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
fun TextfielMain(){
    var user by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf(" ")
    }

    Box {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = user,
                onValueChange ={
                    user = it
                },
                label = {
                    Text(text = "User")
                },
                placeholder = {
                    Text(text = "Richi Rodríguez")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .background(Color.LightGray, shape = RoundedCornerShape(20.dp))
                    .clip(RoundedCornerShape(20.dp))
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },label={
                    Text(text = "Password")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .background(Color.LightGray, shape = RoundedCornerShape(20.dp))
                    .clip(RoundedCornerShape(20.dp))
            )
        }
    }
}



@Composable
fun Filas1(
    img : Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgmodifier: Modifier = Modifier
){
    Row (modifier = modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img),
            contentDescription = descript,
            modifier = Modifier
                .width(350.dp)
                .height(350.dp))
    }
}
@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain1() {
    Ventanas()
}
