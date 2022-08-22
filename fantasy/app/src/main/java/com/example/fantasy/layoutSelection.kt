package com.example.fantasy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fantasy.ui.theme.normal400Size14TextStyle
import com.example.fantasy.ui.theme.normal700Size14TextStyle

@Composable
@Preview(showBackground = true)
fun SelectLayoutComponent() {
    val schematicSelected = remember {
        mutableStateOf(true)
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 22.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        RahnemaCollageLogo()
        Row(
            Modifier
                .background(Color(0xffF7F7F7))
                .size(272.dp, 40.dp)
                .padding(3.dp)) {
            SelectLayoutButton(layoutName = "مشاهده لیست", !schematicSelected.value) {
                schematicSelected.value = false
            }
            SelectLayoutButton(layoutName = "شماتیک ترکیب", schematicSelected.value) {
                schematicSelected.value = true
            }
        }
    }

}


@Composable
fun SelectLayoutButton(layoutName: String, selectedButton: Boolean, onCLick: () -> Unit) {
    Button(onClick = { onCLick() }, colors = ButtonDefaults.buttonColors(backgroundColor = if(selectedButton) Color.White else Color(0xffF7F7F7)),
        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp, pressedElevation = 0.dp, disabledElevation = 0.dp),
        modifier = Modifier
            .size(131.dp)
    ) {
        Text(text = layoutName, color =  Color(0xff3D195B),
            style = if(selectedButton) normal700Size14TextStyle else normal400Size14TextStyle)
    }
}

@Composable
fun RahnemaCollageLogo() {
    Card(modifier = Modifier
        .size(75.dp, 72.dp).offset(y = 10.dp), backgroundColor = Color(0xffFFFFFF), elevation = 30.dp) {
        Image(modifier = Modifier.fillMaxSize(), painter = painterResource(R.drawable.rahnemacollagelogo),
            contentDescription = null, contentScale = ContentScale.FillBounds)
    }
}
//test comment