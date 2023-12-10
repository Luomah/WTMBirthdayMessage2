package com.wtf.wtmbirthdaymessage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wtf.wtmbirthdaymessage.ui.theme.WTMBirthdayMessageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WTMBirthdayMessageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(message = "Happy Birthday Precious!", from =" From Luomah")
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String, from: String, modifier: Modifier = Modifier)
{
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)){
    Text(
        text = message,
        fontSize = 80.sp ,
        lineHeight = 115.sp,
        textAlign = TextAlign.Center
    )
    Text(
        text = from,
        fontSize = 30.sp,
        modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.End)
    )
    }
}



@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    WTMBirthdayMessageTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
        Greeting(message = "Happy Birthday Precious!", from =" From Luomah")
        }
    }
}