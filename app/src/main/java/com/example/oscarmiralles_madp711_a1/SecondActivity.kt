package com.example.oscarmiralles_madp711_a1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //defining an intent object
        val intent = intent

        //Getting values from previous activity using intent object
        val textName = intent.getStringExtra("FullName")
        val textProvince = intent.getStringExtra("Province")
        val textQualify = intent.getStringExtra("Qualifications")
        val textHobby = intent.getStringExtra("Hobby")
        val textDreamJob = intent.getStringExtra("DreamJob")

        //Defining objects to show messages
        val textViewName = findViewById<TextView>(R.id.texViewName)
        val textViewProvince = findViewById<TextView>(R.id.textViewProvince)
        val textViewQuality = findViewById<TextView>(R.id.textViewQualify)
        val textViewHobby = findViewById<TextView>(R.id.textViewHobby)
        val textViewDreamJob = findViewById<TextView>(R.id.textViewDreamJob)

        //Assigning message values to controls
        textViewName.text = textName
        textViewProvince.text = textProvince
        textViewQuality.text = textQualify
        textViewHobby.text = textHobby
        textViewDreamJob.text = textDreamJob
    }

    //Toolbar button
    fun buttonSetting(v: View) {
        // Get elements and change the colors
        val fullName = findViewById<TextView>(R.id.texViewName)
        fullName.setTextColor(Color.parseColor("#FFBB86FC"))

        val province = findViewById<TextView>(R.id.textViewProvince)
        province.setTextColor(Color.parseColor("#FF6200EE"))

        val hobby = findViewById<TextView>(R.id.textViewHobby)
        hobby.setTextColor(Color.parseColor("#FF018786"))

        val qualify = findViewById<TextView>(R.id.textViewQualify)
        qualify.setTextColor(Color.parseColor("#FF03DAC5"))

        val dreamJob = findViewById<TextView>(R.id.textViewDreamJob)
        dreamJob.setTextColor(Color.parseColor("#FF000000"))
    }
}