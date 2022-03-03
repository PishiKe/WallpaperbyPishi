package com.pishi.wallpaperbypishi.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Green200,
    primaryVariant = Green700,
    onPrimary = Color.Black,
    secondary = Red200,
    onSecondary = Color.Black,
    error = Red700
)

private val LightColorPalette = lightColors(
    primary = Green500,
    primaryVariant = Green700,
    onPrimary = Color.White,
    secondary = Red200,
    secondaryVariant = Red500,
    onSecondary = Color.White,
    error = Red700

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun WallpaperByPishiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        typography = WallpaperTypography,
        shapes = Shapes,
        content = content
    )
}