package ir.anishehparsi.bmi


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BMIScreen() {

    val bmiLogic = BMIScreenLogic()
    var weightInput by remember { mutableStateOf("") }
    var heightInput by remember { mutableStateOf("") }
    var bmiValue by remember { mutableStateOf("BMI Value:") }
    var bmiStatus by remember { mutableStateOf("BMI status") }


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

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0x991576CD),
                unfocusedLabelColor = Color(0x99013D72),
                focusedLabelColor = Color(0x990176CD),
                cursorColor = Color(0x4B1576CD)
            ),
            label = { Text(text = "Weight(Kg)") },
            value = weightInput,
            onValueChange = { weightInput = it })
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0x991576CD),
                unfocusedLabelColor = Color(0x99013D72),
                focusedLabelColor = Color(0x990176CD),
                cursorColor = Color(0x4B1576CD)
            ),
            label = { Text(text = "height(Cm)") },
            value = heightInput,
            onValueChange = { heightInput = it })



        Spacer(modifier = Modifier.height(32.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0x99024980)),
            onClick = {bmiValue = bmiLogic.calculateBmi(
                height = heightInput.toDouble(),
                weight = weightInput.toDouble()
            ).toString()

            bmiStatus = bmiLogic.calculateBMIStatus(bmiValue.toDouble())}) {
            Text("Calculate")
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = bmiValue,
            color = Color(0Xff000000),
            fontSize = 26.sp,
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = bmiStatus,
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


