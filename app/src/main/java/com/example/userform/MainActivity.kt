package com.example.userform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.userform.ui.theme.UserFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UserFormTheme {
                    UserForm()
            }
        }
    }
}

@Composable
fun UserForm() {
    var textName by remember {
        mutableStateOf("")
    }

    var textPhoneNumber by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 45.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        TextField(
            value = textName,
            onValueChange = { textName = it},
            label = { Text("Name")}
        )

        Spacer(modifier = Modifier.size(10.dp))

        TextField(
            value = textPhoneNumber,
            onValueChange = { textPhoneNumber = it},
            label = { Text("Phone Number")}
        )

        Spacer(modifier = Modifier.size(10.dp))

        TextField(
            value = textPhoneNumber,
            onValueChange = { textPhoneNumber = it},
            label = { Text("Something")}
        )
    }

}

@Preview(showBackground = true)
@Composable
fun UserFormPreview() {
    UserFormTheme {
        UserForm()
    }
}