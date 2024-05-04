package com.example.recipemaster
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipemaster.R
import com.google.android.material.bottomnavigation.BottomNavigationView

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    protected fun setupBottomNavigationBar() {
        val bottomNavBar = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_snacks -> {
                    startActivity(Intent(this, SnacksActivity::class.java))
                    true
                }
                R.id.navigation_main_course -> {
                    startActivity(Intent(this, MainCourseActvity::class.java))
                    true
                }
                R.id.navigation_sweets -> {
                    startActivity(Intent(this, SweetsActivity::class.java))
                    true
                }                else -> false
            }
        }
    }
}
