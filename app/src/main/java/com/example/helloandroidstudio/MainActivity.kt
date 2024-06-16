package com.example.helloandroidstudio

import android.app.AlertDialog
import android.content.ContentValues.TAG
import android.content.Context
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloandroidstudio.ui.theme.HelloAndroidStudioTheme
import org.w3c.dom.Text


class MainActivity : ComponentActivity() {
    override fun onStart() {
        super.onStart()
        Log.i(TAG,"log de Start")
    }

    override fun onRestart() {
        super.onRestart()
        // When we leave the app but not closed this one
        Log.i(TAG,"log de Restart")
    }

    override fun onPause() {
        super.onPause()
        // When we leave the app but not closed this one
        Log.i(TAG,"log de Pause")
    }

    override fun onStop() {
        super.onStop()
        // When we quit app
        Log.i(TAG,"log de Stop")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val btLogin = findViewById<Button>(R.id.btLogin)
        val btForgot = findViewById<Button>(R.id.btForgot)
        btLogin.setOnClickListener {
            val tLogin = findViewById<TextView>(R.id.tLogin)
            val tSenha = findViewById<TextView>(R.id.tSenha)
            val login = tLogin.text.toString()
            val senha = tSenha.text.toString()
            if ("vinicius".equals(login) && "123".equals(senha)) {
                showAlert(this, "Login realizado", "Bem Vindo " + tLogin.text)
            } else {
                showAlert(this, "Não foi possível entrar", "Tente novamente")

            }
        }
        btForgot.setOnClickListener {
            showAlert(this, "Esqueceu?", "Envairemos um email para recuperação")
        }

    }
}


fun showAlert(context: Context, title: String, message: String) {
    val builder = AlertDialog.Builder(context)
    builder.setTitle(title)
    builder.setMessage(message)

    // Adiciona um botão "OK" ao alerta
    builder.setPositiveButton("OK") { dialog, which ->
        // Aqui você pode adicionar alguma ação a ser executada quando o botão "OK" for clicado
    }

    // Cria e exibe o alerta
    val dialog = builder.create()
    dialog.show()
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