package com.example.fantasy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Date_and_Week() {
    Row(
        /*horizontalArrangement = Arrangement.Center,*/
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .background(Color(0xff3D195B))
            .height(50.dp)
            .width(390.dp)
    ) {
        Box(modifier = Modifier
            .align(Alignment.CenterVertically)
            .weight(0.5f)
            .padding(5.dp)) {
            Text(text = "nth-week", fontSize = 20.sp, color = Color(0xff00FF87))
        }
        Box(modifier = Modifier
            .align(Alignment.CenterVertically)
            .weight(0.5f)) {
            Text(text = "date", fontSize = 20.sp, color = Color(0xffF7F7F7))
        }
    }
}