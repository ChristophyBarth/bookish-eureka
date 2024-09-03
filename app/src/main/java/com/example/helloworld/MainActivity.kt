package com.example.helloworld

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.materialswitch.MaterialSwitch

class MainActivity : AppCompatActivity() {
    private lateinit var name: TextView

    private lateinit var card1: CardView
    private lateinit var switch1: MaterialSwitch
    private lateinit var text1: TextView
    private lateinit var imageView1: ImageView

    private lateinit var card2: CardView
    private lateinit var switch2: MaterialSwitch
    private lateinit var text2: TextView
    private lateinit var imageView2: ImageView

    private lateinit var card3: CardView
    private lateinit var switch3: MaterialSwitch
    private lateinit var text3: TextView
    private lateinit var imageView3: ImageView

    private lateinit var card4: CardView
    private lateinit var switch4: MaterialSwitch
    private lateinit var text4: TextView
    private lateinit var imageView4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        name.text = getString(R.string.smith)

        card1 = findViewById(R.id.card1)
        text1 = findViewById(R.id.smart_light_text)
        switch1 = findViewById(R.id.switch1)
        imageView1 = findViewById(R.id.bulb)

        card2 = findViewById(R.id.card2)
        text2 = findViewById(R.id.ac_text)
        switch2 = findViewById(R.id.switch2)
        imageView2 = findViewById(R.id.ac_icon)

        card3 = findViewById(R.id.card3)
        text3 = findViewById(R.id.smart_tv_text)
        switch3 = findViewById(R.id.switch3)
        imageView3 = findViewById(R.id.tv_icon)

        card4 = findViewById(R.id.card4)
        text4 = findViewById(R.id.fan_text)
        switch4 = findViewById(R.id.switch4)
        imageView4 = findViewById(R.id.fan_icon)

        switchListener(switch1, text1, imageView1, R.drawable.ic_bulb_off, card1)
        switchListener(switch2, text2, imageView2, R.drawable.ic_ac, card2)
        switchListener(switch3, text3, imageView3, R.drawable.ic_tv, card3)
        switchListener(switch4, text4, imageView4, R.drawable.ic_fan, card4)
    }

    private fun switchListener(
        switch: MaterialSwitch,
        textView: TextView,
        imageView: ImageView,
        @DrawableRes
        icon: Int,
        cardView: CardView
    ) {
        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                cardView.setCardBackgroundColor(resources.getColor(R.color.card_color_off, null))
                textView.setTextColor(resources.getColor(R.color.white, null))

                val drawable = ContextCompat.getDrawable(this, icon)
                drawable?.setTint(ContextCompat.getColor(this, R.color.white))
                imageView.setImageDrawable(drawable)
            } else {
                cardView.setCardBackgroundColor(resources.getColor(R.color.card_color, null))
                textView.setTextColor(resources.getColor(R.color.black, null))

                val drawable = ContextCompat.getDrawable(this, icon)
                drawable?.setTint(ContextCompat.getColor(this, R.color.black))
                imageView.setImageDrawable(drawable)
            }
        }
    }
}