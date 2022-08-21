package com.example.fantasy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    Row() {
        Box(
            modifier = Modifier
                .weight(1f, true)
                .height(150.dp)
            /*.background(/*R.drawable.android_asset*/Color.Gray)*/
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize(),
                painter = painterResource(R.drawable.android_asset),
                contentDescription = "background_image",
                contentScale = ContentScale.FillBounds
            )
            Row(/*modifier = Modifier.height(150.dp).width(250.dp)*/) {
                Image(
                    modifier = Modifier
                        .height(150.dp)
                        .width(250.dp)
                        .weight(0.6f),
                    painter = painterResource(R.drawable.headerplayers),
                    contentDescription = "player_image",
                    contentScale = ContentScale.FillBounds
                )
                Column(modifier = Modifier.weight(0.4f)) {

                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .weight(0.65f)
                    ) {
                        Image(
                            modifier = Modifier
                                .size(100.dp)
                                .padding(10.dp),
                            painter = painterResource(R.drawable.premierlogo),
                            contentDescription = "premier_logo",
                            contentScale = ContentScale.FillBounds,

                            )
                    }
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .weight(0.35f)
                    ) {
                        Image(
                            modifier = Modifier
                                .height(150.dp)
                                .width(150.dp)
                                .padding(10.dp),
                            painter = painterResource(R.drawable.headertext),
                            contentDescription = "header_text",
                            contentScale = ContentScale.FillBounds,

                            )
                    }
                }

            }
        }
    }

}