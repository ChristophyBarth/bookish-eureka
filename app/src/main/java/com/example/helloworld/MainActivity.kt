package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.materialswitch.MaterialSwitch

class MainActivity : AppCompatActivity() {
    private lateinit var card1 : CardView
    private lateinit var switch1 : MaterialSwitch
    private lateinit var text1: TextView
    private lateinit var name: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card1 = findViewById(R.id.card1)
        switch1 = findViewById(R.id.switch1)
        text1 = findViewById(R.id.smart_tv_text)
        name = findViewById(R.id.name)

        switch1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                card1.setCardBackgroundColor(resources.getColor(R.color.card_color_off, null))
                text1.setTextColor(resources.getColor(R.color.white, null))
            }else{
                card1.setCardBackgroundColor(resources.getColor(R.color.card_color, null))
                text1.setTextColor(resources.getColor(R.color.black, null))
            }
        }
    }
}