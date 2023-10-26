package com.verma.netclan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2

class main2 : AppCompatActivity() {
    private val introSliderAdapter = IntroSliderAdapter(
        listOf(
            IntroSlider(
                R.drawable.first
            ),
            IntroSlider(
                R.drawable.second
            ),
            IntroSlider(
                R.drawable.third
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val introSliderViewPager = findViewById<ViewPager2>(R.id.introSliderViewPager)
        // Set the adapter to the ViewPager2
        introSliderViewPager.adapter = introSliderAdapter
        setupIndicators()
        setCurrentIndicator(0)



        introSliderViewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
    }

    private fun setupIndicators() {
        val indicator = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)

        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8, 0, 8, 0)
        for (i in indicator.indices) {
            indicator[i] = ImageView(applicationContext)
            indicator[i]?.apply {
                setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.indicator_inactive))
                this.layoutParams = layoutParams
            }
            val indicatorsConrainer = findViewById<LinearLayout>(R.id.indicatorsConatainer)
            indicatorsConrainer.addView(indicator[i])
        }
    }

    private fun setCurrentIndicator(index: Int) {
        val indicatorsConrainer = findViewById<LinearLayout>(R.id.indicatorsConatainer)
        val childCount = indicatorsConrainer.childCount
        for (i in 0 until childCount) {
            val imageView = indicatorsConrainer[i] as ImageView
            if (i == index) {
                imageView.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.indicator_active))
            } else {
                imageView.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.indicator_inactive))
            }
        }
    }


}