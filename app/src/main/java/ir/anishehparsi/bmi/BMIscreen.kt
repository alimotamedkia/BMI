package ir.anishehparsi.bmi


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@JvmOverloads
@Composable
fun BMIScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(150.dp),
            painter = painterResource(R.drawable.bmi_logo),
            contentDescription = "BMI Logo"
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "BMI Calculator", color = Color(0Xff6cdb30), fontSize = 26.sp)
        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(value = "Weight(kg)", onValueChange = {})
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(value = "Height(kg)", onValueChange = {})



        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = {}) {
            Text("Calculate")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Your BMI : 0.00",
            color = Color(0Xff000000),
            fontSize = 26.sp,
        )
        Spacer(modifier = Modifier.height(96.dp))
        Text(
            text = "bmi status",
            color = Color(0Xffdf9832),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(12.dp))
        Image(
            modifier = Modifier.size(width = 150.dp, height = 100.dp),
            painter = painterResource(R.drawable.guid),
            contentDescription = "BMI guide"
        )

    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    BMIScreen()
}


