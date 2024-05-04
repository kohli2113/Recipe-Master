package com.example.recipemaster

import com.example.recipemaster.BaseActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.recipemaster.MainCourse.AlloSabji
import com.example.recipemaster.MainCourse.ButterChicken
import com.example.recipemaster.MainCourse.Chana
import com.example.recipemaster.MainCourse.DalMakhni
import com.example.recipemaster.MainCourse.KadhaiPaneer

class MainCourseActvity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_course_actvity)

                val mc1 = findViewById<ImageButton>(R.id.mc1)
                val mc2 = findViewById<ImageButton>(R.id.mc2)
                val mc3 = findViewById<ImageButton>(R.id.mc3)
                val mc4 = findViewById<ImageButton>(R.id.mc4)
                val mc5 = findViewById<ImageButton>(R.id.mc5)

                mc1.setOnClickListener {
                    Intent(this, DalMakhni::class.java).apply{
                        startActivity(this)
                    }
                }

                mc2.setOnClickListener {
                    Intent(this, AlloSabji::class.java).apply{
                        startActivity(this)
                    }
                }


                mc3.setOnClickListener {
                    Intent(this, Chana::class.java).apply{
                        startActivity(this)
                    }
                }

                mc4.setOnClickListener {
                    Intent(this, KadhaiPaneer::class.java).apply{
                        startActivity(this)
                    }
                }

                mc5.setOnClickListener {
                    Intent(this, ButterChicken::class.java).apply{
                        startActivity(this)
                    }
                }


            }
        }