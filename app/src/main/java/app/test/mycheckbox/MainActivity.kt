package app.test.mycheckbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkbox1 = findViewById<CheckBox>(R.id.checkBox)
        val checkbox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkbox3 = findViewById<CheckBox>(R.id.checkBox3)
        val checkbox4 = findViewById<CheckBox>(R.id.checkBox4)
        val button = findViewById<Button>(R.id.button)

        checkbox1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                checkbox2.isChecked = false
                checkbox3.isChecked = false
                checkbox4.isChecked = false
            }
        }

        checkbox2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                checkbox1.isChecked = false
                checkbox3.isChecked = false
                checkbox4.isChecked = false
            }
        }

        checkbox3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                checkbox1.isChecked = false
                checkbox2.isChecked = false
                checkbox4.isChecked = false
            }
        }

        checkbox4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                checkbox1.isChecked = false
                checkbox2.isChecked = false
                checkbox3.isChecked = false
            }
        }

        button.setOnClickListener {
            if (checkbox1.isChecked) {
                Toast.makeText(this, "You selected ${checkbox1.text}", Toast.LENGTH_SHORT).show()
                checkbox1.isChecked = false
            } else if (checkbox2.isChecked) {
                Toast.makeText(this, "You selected ${checkbox2.text}", Toast.LENGTH_SHORT).show()
                checkbox2.isChecked = false
            } else if (checkbox3.isChecked) {
                Toast.makeText(this, "You selected ${checkbox3.text}", Toast.LENGTH_SHORT).show()
                checkbox3.isChecked = false
            } else if (checkbox4.isChecked) {
                Toast.makeText(this, "You selected ${checkbox4.text}", Toast.LENGTH_SHORT).show()
                checkbox4.isChecked = false
            }
        }

    }
}