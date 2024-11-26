package org.smartline.app

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import smartline.composeapp.generated.resources.Res
import smartline.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Box( modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column( modifier = Modifier.fillMaxWidth(0.8f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)) {
                TextField(value = email, onValueChange = {
                    email = it
                }, label = { Text("E-mail") })

                TextField(value = password, onValueChange = {
                    password = it
                }, label = { Text("Password") })

                Button(onClick = {
                    showContent = true
                }) {
                    Text("Login")
                }
                AnimatedVisibility(showContent) {
                    Text(email)
                    Text(password)
                }
            }
        }
    }
}