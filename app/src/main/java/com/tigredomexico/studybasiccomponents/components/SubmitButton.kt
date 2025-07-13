package com.tigredomexico.studybasiccomponents.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SubmitButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        enabled = true,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onSecondary
        )
    ) {
        Text(
            text = "Validar",
            modifier = modifier
        )
    }
}