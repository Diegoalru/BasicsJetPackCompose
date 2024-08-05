package com.darssolutions.basicscodelab.ui.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.darssolutions.basicscodelab.ui.screens.GreetingsScreen
import com.darssolutions.basicscodelab.ui.screens.OnboardingScreen
import com.darssolutions.basicscodelab.ui.theme.BasicsCodelabTheme

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
        } else {
            GreetingsScreen()
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320
)
@Preview(
    uiMode = UI_MODE_NIGHT_YES,
    widthDp = 320,
    name = "GreetingPreviewDark"
)
@Composable
fun MyAppPreview() {
    BasicsCodelabTheme {
        Scaffold(
            topBar = { TopAppBar() }
        ) {
            MyApp(modifier = Modifier.padding(it))
        }
    }
}
