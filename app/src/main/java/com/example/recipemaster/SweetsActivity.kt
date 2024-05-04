package com.example.recipemaster

import com.example.recipemaster.BaseActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.activity.enableEdgeToEdge
import com.example.recipemaster.Sweets.BesanKeLaddu
import com.example.recipemaster.Sweets.Jalebi
import com.example.recipemaster.Sweets.KajuKatli
import com.example.recipemaster.Sweets.Kheer
import com.example.recipemaster.Sweets.Rasmalai

class SweetsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sweets)
        val sweet1 = findViewById<ImageButton>(R.id.sweet1)
        val sweet2 = findViewById<ImageButton>(R.id.sweet2)
        val sweet3 = findViewById<ImageButton>(R.id.sweet3)
        val sweet4 = findViewById<ImageButton>(R.id.sweet4)
        val sweet5 = findViewById<ImageButton>(R.id.sweet5)
        sweet1.setOnClickListener {
            Intent(this, BesanKeLaddu::class.java).apply{
                startActivity(this)
            }
        }
        sweet2.setOnClickListener {
            Intent(this, Rasmalai::class.java).apply{
                startActivity(this)
            }
        }
        sweet3.setOnClickListener {
            Intent(this, Jalebi::class.java).apply{
                startActivity(this)
            }
        }
        sweet4.setOnClickListener {
            Intent(this, Kheer::class.java).apply{
                startActivity(this)
            }
        }
        sweet5.setOnClickListener {
            Intent(this, KajuKatli::class.java).apply{
                startActivity(this)
            }
        }
    }
}





