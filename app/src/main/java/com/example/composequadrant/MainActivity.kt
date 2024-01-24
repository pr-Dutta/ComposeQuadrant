package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppUi()
                }
            }
        }
    }
}

@Composable
fun AppUi(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1F)
        ) {
            Card(
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1F),

                /* This code must need to revise */       // new - (24-01-2024)

                /* we have to set "colors" property inside a
                * card to set content color and container
                * color and also disableContainerColor and
                * disableContentColor */
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEADDFF),
                    //contentColor = Color.Red,
                    //disabledContainerColor = Color.Black,
                    //disabledContentColor = Color.Blue
                )

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Text composable",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold         // new
                    )

                    Text(
                        text = "Displays text and follows the recommended Material Design guidelines.",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Justify       // new
                    )
                }
            }

            Card(

                /* We have to use shape = RectangleShape to
                * make our cards outline squired */
                shape = RectangleShape,         // new - (24-01-2024)
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFD0BCFF),
                )

                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Image composable",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold
                        // .align only works with horizontal
                        //.align(Alignment.CenterHorizontally)
                    )

                    Text(
                        text = "Creates a composable that lays out and draws a given Painter class object.",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Justify
                        // .align only works with horizontal
                        //.align(Alignment.CenterHorizontally)
                    )
                }
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1F)
        ) {
            Card(
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFB69DF8)         // new
                )

                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Row composable",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "A layout composable that places its children in a horizontal sequence.",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }

            Card(
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1F),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF6EDFF)        // new
                )

                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Column composable",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "A layout composable that places its children in a vertical sequence.",
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppUiPreview() {
    ComposeQuadrantTheme {
        AppUi()
    }
}
