package com.darssolutions.basicscodelab.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.darssolutions.basicscodelab.ui.components.MyApp
import com.darssolutions.basicscodelab.ui.components.TopAppBar

@Composable
fun AppContent() {
    Scaffold(
        topBar = { TopAppBar() }
    ) { innerPadding ->
        MyApp(modifier = Modifier.padding(innerPadding))
    }
}
