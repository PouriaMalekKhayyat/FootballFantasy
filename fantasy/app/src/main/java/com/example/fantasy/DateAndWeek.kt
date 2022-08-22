package com.example.fantasy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fantasy.ui.theme.normal800Size14TextStyle

@Composable
fun Date_and_Week() {
    Row(
        /*horizontalArrangement = Arrangement.Center,*/
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .clip(RoundedCornerShape(5.dp))
            .shadow(10.dp)
            .background(Color(0xff3D195B))
            .height(35.dp)
            .fillMaxWidth()
    ) {
        Box(modifier = Modifier
            .align(Alignment.CenterVertically)
            .weight(0.5f)
            .padding(5.dp)) {
            Text(text = "هفته", fontSize = 20.sp, color = Color(0xff00FF87), style= normal800Size14TextStyle )
        }
        Box(modifier = Modifier
            .align(Alignment.CenterVertically)
            .weight(0.5f)) {
            Text(text = "تاریخ", fontSize = 20.sp, color = Color(0xffF7F7F7), style= normal800Size14TextStyle)
        }
    }
}