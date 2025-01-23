package com.plcoding.meditationuiyoutube.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.memo.meditationapp.R

// Define the custom font family
val gothicA1 = FontFamily(
    listOf(
        Font(R.font.gothica1_regular, FontWeight.Normal),
        Font(R.font.gothica1_medium, FontWeight.Medium),
        Font(R.font.gothica1_semibold, FontWeight.SemiBold),
        Font(R.font.gothica1_bold, FontWeight.Bold),
        Font(R.font.gothica1_black, FontWeight.Black),
    )
)

// Define the Typography for Material3
val Typography = Typography(
    bodyLarge = TextStyle(
        color = AquaBlue,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    headlineLarge = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    headlineMedium = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)
