package com.example.fantasy

import android.os.Bundle
//import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ComponentActivity
import com.example.fantasy.ui.theme.FantasyTheme

class MainActivity : androidx.activity.ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Header()
            }
        }
    }

    @Composable
    @Preview(showBackground = true, widthDp = 320, heightDp = 480)
    fun Header() {
        Row(){
            Box(modifier = Modifier
                .weight(1f, true)
                .height(100.dp)
                .background(/*R.drawable.android_asset*/Color.Gray)){

            }
            /*Box(modifier = Modifier
                .weight(0.8f, true)
                .height(100.dp)
                .background(Color.Yellow)){

            }*/
        }

    }

}



