package com.example.helloandroidstudio

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloandroidstudio.ui.theme.HelloAndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG,"log de Verbose")
        Log.d(TAG,"log de Debug")
        Log.i(TAG,"log de Info")
        Log.w(TAG,"log de Alerta")
        Log.e(TAG, throw RuntimeException("teste de erro"))
        setContent {
            HelloAndroidStudioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Vinicius")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!" + R.string.app_name ,
        modifier = modifier
    )
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    HelloAndroidStudioTheme {
        Greeting("Semi Deus")
    }
}