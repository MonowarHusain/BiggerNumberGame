package com.example.biggernumbergame

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var points = 0
    private var leftNum = 0
    private var rightNum = 0

    private lateinit var btnLeft: Button
    private lateinit var btnRight: Button
    private lateinit var tvPoints: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLeft = findViewById(R.id.btnLeft)
        btnRight = findViewById(R.id.btnRight)
        tvPoints = findViewById(R.id.tvPoints)

        updatePointsDisplay()
        generateRandomNumbers()

        btnLeft.setOnClickListener { checkAnswer(isLeftClicked = true) }
        btnRight.setOnClickListener { checkAnswer(isLeftClicked = false) }
    }

    private fun generateRandomNumbers() {
        leftNum = Random.nextInt(100)
        do {
            rightNum = Random.nextInt(100)
        } while (leftNum == rightNum) // ensure numbers are distinct

        btnLeft.text = leftNum.toString()
        btnRight.text = rightNum.toString()
    }

    private fun checkAnswer(isLeftClicked: Boolean) {
        val isCorrect = if (isLeftClicked) leftNum > rightNum else rightNum > leftNum

        if (isCorrect) {
            points++
            Toast.makeText(this, getString(R.string.correct_toast), Toast.LENGTH_SHORT).show()
        } else {
            points--
            Toast.makeText(this, getString(R.string.wrong_toast), Toast.LENGTH_SHORT).show()
        }

        updatePointsDisplay()
        generateRandomNumbers()
    }

    private fun updatePointsDisplay() {
        tvPoints.text = getString(R.string.points_format, points)
    }
}
