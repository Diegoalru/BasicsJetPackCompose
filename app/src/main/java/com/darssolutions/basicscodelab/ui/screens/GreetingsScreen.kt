package com.darssolutions.basicscodelab.ui.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.darssolutions.basicscodelab.ui.components.GreetingCard
import com.darssolutions.basicscodelab.ui.theme.BasicsCodelabTheme


@Composable
fun GreetingsScreen(
    modifier: Modifier = Modifier,
    names: List<String> = List(100) { "$it" }
) {
    LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
        items(names) { name ->
            GreetingCard(name = name)
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320
)
@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "GreetingsPreviewDark"
)
@Composable
fun GreetingsPreview() {
    BasicsCodelabTheme {
        GreetingsScreen()
    }
}
