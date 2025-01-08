package ir.anishehparsi.bmi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UIPractice() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(400.dp),
            painter = painterResource(R.drawable.login_user),
            contentDescription = "Login user picture"
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Transform Speech into", fontWeight = FontWeight.Bold, fontSize = 26.sp)
        Text(text = "Text Effortlessly", fontWeight = FontWeight.Bold, fontSize = 26.sp)
        Spacer(modifier= Modifier.height(8.dp))
        Text(text = "Capture every detail with RecogNotes.\n" +
                "Record conversations, lectures, meetings, and\n" +
                "more, and watch as they are transcribed into\n" +
                "accurate text instantly.", fontSize = 12.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(36.dp))
        Row { Button(modifier= Modifier.size(150.dp,38.dp),onClick = {}){Text("Register")}
            Spacer(modifier = Modifier.width(12.dp))
            OutlinedButton(modifier= Modifier.size(150.dp,38.dp),onClick = {}) { Text("Sign in")} }
        Spacer(modifier = Modifier.height(18.dp))

    }
}

@Preview(showBackground = true)
@Composable

fun Screen() {
    UIPractice()
}