package com.example.recipemaster


import com.example.recipemaster.BaseActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recipemaster.Snacks.MainCourse.Dhokla
import com.example.recipemaster.Snacks.MainCourse.GolGappe
import com.example.recipemaster.Snacks.MainCourse.OnionPakoda
import com.example.recipemaster.Snacks.MainCourse.PavBhaji
import com.example.recipemaster.Snacks.MainCourse.Samosa


class SnacksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snacks)


                val snack1 = findViewById<ImageButton>(R.id.snack1)
                val snack2 = findViewById<ImageButton>(R.id.snack2)
                val snack3 = findViewById<ImageButton>(R.id.snack3)
                val snack4 = findViewById<ImageButton>(R.id.snack4)
                val snack5 = findViewById<ImageButton>(R.id.snack5)
                snack1.setOnClickListener {
                    Intent(this, Samosa ::class.java).apply{
                        startActivity(this)
                    }
                }
                snack2.setOnClickListener {
                    Intent(this, Dhokla::class.java).apply{
                        startActivity(this)
                    }
                }
                snack3.setOnClickListener {
                    Intent(this, PavBhaji::class.java).apply{
                        startActivity(this)
                    }
                }
                snack4.setOnClickListener {
                    Intent(this, OnionPakoda::class.java).apply{
                        startActivity(this)
                    }
                }
                snack5.setOnClickListener {
                    Intent(this, GolGappe::class.java).apply{
                        startActivity(this)
                    }
                }
            }
}

