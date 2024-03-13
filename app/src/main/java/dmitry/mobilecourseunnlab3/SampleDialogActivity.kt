package dmitry.mobilecourseunnlab3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import dmitry.mobilecourseunnlab3.fragments.CalculatorDialogFragment

class SampleDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_dialog)
    }

    fun onButtonShowDialogClick(view: View) {
        CalculatorDialogFragment().show(supportFragmentManager, "CALCULATOR_DIALOG")
    }
}