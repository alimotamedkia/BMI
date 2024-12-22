package ir.anishehparsi.bmi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Practice(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            modifier = Modifier.size(300.dp),
            painter = painterResource(R.drawable.car),
            contentDescription = "Car logo"
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Avoid traffic,Police,\n hazard, and more",
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(128.dp))
        Button(modifier = Modifier.size(300.dp, 50.dp), onClick = {}) { Text("Get Start") }
        Spacer(modifier = Modifier.heightIn(16.dp))
        OutlinedButton(modifier = Modifier.size(300.dp, 50.dp), onClick = {}) { Text("Log in") }
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "By continuing you agree to waze's")
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Terms of Service and Privacy Police")

    }
}

@Preview
@Composable

fun Show() {
    Practice()
}
