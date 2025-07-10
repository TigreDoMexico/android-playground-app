package com.tigredomexico.studybasiccomponents.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tigredomexico.studybasiccomponents.ui.theme.Typography

@Composable
fun AppTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Testes de Componentes",
        style = Typography.titleLarge,
        modifier = modifier.padding(16.dp)
    )
}