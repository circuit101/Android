package com.example.principedebasedecompose

import android.graphics.Color
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.principedebasedecompose.ui.theme.PrincipeDeBaseDeComposeTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrincipeDeBaseDeComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Image1(
                        message = "X",
                        modifier = Modifier
                    )
                    Greeting(name = "")
                }
            }
        }
    }
}

@Composable
fun Image1(message:String, modifier: Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .offset(x = 0.dp, y = (-320.dp))
    )
    Greeting(
        name = "",
    )
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
    ) {
        Text(
            text = "Jetpack Compose tutorial\n",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    top = 180.dp,
                    start = 16.dp
                ),
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                    "Compose simplifies and accelerates UI development on Android with less code, powerful tools, " +
                    "and intuitive Kotlin APIs.",
            fontSize = 12.sp,
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 10.dp,
                    end = 10.dp,
                )
        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. " +
                    "You call Compose functions to say what elements you want and the Compose compiler does the rest. " +
                    "Compose is built around Composable functions. These functions let you define your app\\'s " +
                    "UI programmatically because they let you describe how it should look and provide data dependencies, " +
                    "rather than focus on the process of the UI\\'s construction, such as initializing an element and " +
                    "then attaching it to a parent. To create a Composable function, you add the @Composable annotation " +
                    "to the function name.",
            fontSize = 12.sp,
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 10.dp,
                    end = 10.dp,
                )
        )
    }
}

/*@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrincipeDeBaseDeComposeTheme {
        Greeting("")
    }
}*/