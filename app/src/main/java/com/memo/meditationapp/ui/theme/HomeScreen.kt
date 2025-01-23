package com.memo.meditationapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.memo.meditationapp.R
import com.plcoding.meditationuiyoutube.ui.theme.DeepBlue
import com.plcoding.meditationuiyoutube.ui.theme.TextWhite

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column (
            modifier = Modifier.padding(15.dp)
        ){//The biggest column
            GreetingSection(name = "Mohamed")
        }
    }
}
@Composable
fun GreetingSection(name: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Good Morning $name",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = "We wish you have a good day!",
                style = MaterialTheme.typography.bodyLarge
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            tint = TextWhite,
            modifier = Modifier.size(24.dp),
            contentDescription = "Search"
        )
    }
}
