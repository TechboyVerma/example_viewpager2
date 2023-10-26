package com.verma.netclan

import android.animation.Animator
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.airbnb.lottie.LottieAnimationView

class Splash_screen : AppCompatActivity() {
    private lateinit var animationView: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        animationView = findViewById(R.id.lottie_layer_name)  // Replace with your LottieAnimationView ID



        val handler = Handler()



        handler.postDelayed({
            // Stop the Lottie animation


            // Start the next activity after loading is complete
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish the splash screen activity to prevent returning to it
        }, 3000)
    }
}