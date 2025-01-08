package ir.anishehparsi.bmi

class BMIScreenLogic {
    fun calculateBmi(height: Double, weight: Double): Double {
        return try {
            weight / (height * height)
        } catch (e: ArithmeticException) {
            -1.0
        }
    }

    fun calculateBMIStatus(bmiValue: Double): String {
        return if (bmiValue < 18.5) "UnderWeight" else if (bmiValue in 18.5..24.5) "Normal" else if (bmiValue in 25.0..29.9) "OverWeight" else "Obese"
    }
}