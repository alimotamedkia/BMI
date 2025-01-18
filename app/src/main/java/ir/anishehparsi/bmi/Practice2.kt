package ir.anishehparsi.bmi

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Practice2() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = { Text(text = stringResource(R.string.app_name)) })
            isSystemInDarkTheme()
        },
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        Icons.Filled.Settings,
                        contentDescription = "",
                        modifier = Modifier.weight(1f),
                    )

                    Icon(
                        Icons.Filled.Home,
                        contentDescription = "",
                        modifier = Modifier.weight(1f)
                    )

                    Icon(
                        Icons.Filled.Face,
                        contentDescription = "",
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                }
            }
        }
    ) {
        Column(Modifier.padding(it)) {


            var password by remember { mutableStateOf("") }

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                label = { Text(text = "Password") },
                value = password,
                onValueChange = { password = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Button(onClick = {/*TODO*/ }) {
                Icon(
                    Icons.Filled.FavoriteBorder,
                    contentDescription = "",
                    Modifier.size(ButtonDefaults.IconSize)
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Like")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Practice2Show(modifier: Modifier = Modifier) {
    Practice2()

}