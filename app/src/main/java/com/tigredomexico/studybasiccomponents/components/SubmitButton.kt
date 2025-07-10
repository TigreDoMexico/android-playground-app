package com.tigredomexico.studybasiccomponents.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SubmitButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        enabled = true
    ) {
        Text(
            text = "Validar",
            modifier = modifier
        )
    }
}