package com.example.oscarmiralles_madp711_a1

import android.os.Bundle
import android.content.Intent
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.RadioButton
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val spinner: Spinner = findViewById(R.id.province)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.provinces_array,
            android.R.layout.simple_spinner_dropdown_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
    }

    //defining a button click event
    fun buttonSend (v: View) {
        //creating an intent object using both first and second activities.
        val i = Intent(this@FirstActivity, SecondActivity::class.java)

        //Get controls to send values to second activity
        val fullNameText = findViewById<EditText>(R.id.fullName)

        val provinceSpinner = findViewById<Spinner>(R.id.province)
        val provinceIndex: Int = provinceSpinner.selectedItemPosition
        //Get selected item providing the position
        val spinnerText = provinceSpinner.getItemAtPosition(provinceIndex)

        val qualificationGroup = findViewById<RadioGroup>(R.id.qualifications)
        val radioID: Int = qualificationGroup!!.checkedRadioButtonId
        //Get selected item providing the position
        val qualificationText = findViewById<RadioButton>(radioID)

        val hobbyText = findViewById<EditText>(R.id.hobby)
        val dreamJobText = findViewById<EditText>(R.id.dreamJob)

        //Getting values from controls
        val messageName = fullNameText.text.toString()
        val messageProvince = spinnerText.toString()
        val messageQualify = qualificationText.text.toString()
        val messageHobby = hobbyText.text.toString()
        val messageDreamJob = dreamJobText.text.toString()

        //Assigning values into intent object using key and values pairs.
        i.putExtra("FullName", messageName)
        i.putExtra("Province", messageProvince)
        i.putExtra("Qualifications", messageQualify)
        i.putExtra("Hobby", messageHobby)
        i.putExtra("DreamJob", messageDreamJob)

        //starting sub activity
        startActivity(i)
    }
}