package com.example.helloworld

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.materialswitch.MaterialSwitch

class MainActivity : AppCompatActivity() {
    private lateinit var card1 : CardView
    private lateinit var switch1 : MaterialSwitch
    private lateinit var text1: TextView
    private lateinit var name: TextView
    private lateinit var bulb: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        card1 = findViewById(R.id.card1)
        text1 = findViewById(R.id.smart_tv_text)
        switch1 = findViewById(R.id.switch1)
        bulb = findViewById(R.id.bulb)

        switchListener(switch1, text1, bulb, card1)
    }

    private fun switchListener(switch: MaterialSwitch, textView: TextView, imageView: ImageView, cardView: CardView){
        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                cardView.setCardBackgroundColor(resources.getColor(R.color.card_color_off, null))
                textView.setTextColor(resources.getColor(R.color.white, null))

                val drawable = ContextCompat.getDrawable(this, R.drawable.ic_bulb_off)
                drawable?.setTint(ContextCompat.getColor(this, R.color.white))
                imageView.setImageDrawable(drawable)
            }else{
                cardView.setCardBackgroundColor(resources.getColor(R.color.card_color, null))
                textView.setTextColor(resources.getColor(R.color.black, null))

                val drawable = ContextCompat.getDrawable(this, R.drawable.ic_bulb_off)
                drawable?.setTint(ContextCompat.getColor(this, R.color.black))
                imageView.setImageDrawable(drawable)
            }
        }
    }
}