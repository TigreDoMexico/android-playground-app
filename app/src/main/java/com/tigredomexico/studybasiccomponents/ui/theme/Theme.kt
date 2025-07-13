package com.tigredomexico.studybasiccomponents.ui.theme

import android.os.Build
import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    background = AppBrown,
    primary = AppBrown,
    onBackground = AppBrown,
    onPrimary = AppWhite,
    secondary = AppBlue,
    onSecondary = AppWhite,
    tertiary = AppGreen,
    error = AppRed,
)

private val LightColorScheme = lightColorScheme(
    background = AppWhite,
    onBackground = AppWhite,
    primary = AppWhite,
    onPrimary = AppBrown,
    secondary = AppBlue,
    onSecondary = AppWhite,
    tertiary = AppGreen,
    error = AppRed,

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun StudyBasicComponentsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    Log.d("ThemeDebug", "darkTheme: $darkTheme")

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}