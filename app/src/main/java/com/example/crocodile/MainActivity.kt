package com.example.crocodile

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.example.crocodile.Model.ThemesCrocodile
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var tvCrocodile: TextView
    private lateinit var tvOneButton: TextView
    private lateinit var tvTwoButton: TextView
    private lateinit var tvThreeButton: TextView
    private lateinit var animationLottie: LottieAnimationView

    private var listOne: ArrayList<ThemesCrocodile> = arrayListOf()
    private var listTwo: ArrayList<ThemesCrocodile> = arrayListOf()
    private var listThree: ArrayList<ThemesCrocodile> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCrocodile = findViewById(R.id.tv_crocodile)
        tvOneButton = findViewById(R.id.button_level_one)
        tvTwoButton = findViewById(R.id.button_level_two)
        tvThreeButton = findViewById(R.id.button_level_three)
        animationLottie = findViewById(R.id.animation)
        animationLottie.visibility = View.VISIBLE

        createData()

        val themesOne: ArrayList<ThemesCrocodile> = arrayListOf()
        themesOne.addAll(listOne)

        val themesTwo: ArrayList<ThemesCrocodile> = arrayListOf()
        themesTwo.addAll(listTwo)

        val themesThree: ArrayList<ThemesCrocodile> = arrayListOf()
        themesThree.addAll(listThree)

        tvOneButton.setOnClickListener {
            animationLottie.visibility = View.GONE
            val rand = (Math.random() * themesOne.size).toInt()
            if (themesOne.size != 0) {
                tvCrocodile.text = themesOne[rand].name
                themesOne.removeAt(rand)
            } else {
                tvCrocodile.text = "Список из темы Один закончились"
            }
        }
        tvTwoButton.setOnClickListener {
            animationLottie.visibility = View.GONE
            val rand = (Math.random() * themesTwo.size).toInt()
            if (themesTwo.size != 0) {
                tvCrocodile.text = themesTwo[rand].name
                themesTwo.removeAt(rand)
            } else {
                tvCrocodile.text = "Список из темы Два закончились"
            }
        }
        tvThreeButton.setOnClickListener {
            animationLottie.visibility = View.GONE
            val rand = (Math.random() * themesThree.size).toInt()
            if (themesThree.size != 0) {
                tvCrocodile.text = themesThree[rand].name
                themesThree.removeAt(rand)
            } else {
                tvCrocodile.text = "Список из темы Три закончились"
            }
        }
    }

    private fun createData() {
        listOne.add(ThemesCrocodile("Лист 1. Один"))
        listOne.add(ThemesCrocodile("Лист 1. Два"))
        listOne.add(ThemesCrocodile("Лист 1. Три"))
        listOne.add(ThemesCrocodile("Лист 1. Четыре"))
        listOne.add(ThemesCrocodile("Лист 1. Пять"))
        listOne.add(ThemesCrocodile("Лист 1. Шесть"))
        listOne.add(ThemesCrocodile("Лист 1. Семь"))
        listOne.add(ThemesCrocodile("Лист 1. Восемь"))
        listOne.add(ThemesCrocodile("Лист 1. Девять"))

        listTwo.add(ThemesCrocodile("Лист 2. Один"))
        listTwo.add(ThemesCrocodile("Лист 2. Два"))
        listTwo.add(ThemesCrocodile("Лист 2. Три"))
        listTwo.add(ThemesCrocodile("Лист 2. Четыре"))
        listTwo.add(ThemesCrocodile("Лист 2. Пять"))
        listTwo.add(ThemesCrocodile("Лист 2. Шесть"))
        listTwo.add(ThemesCrocodile("Лист 2. Семь"))
        listTwo.add(ThemesCrocodile("Лист 2. Восемь"))
        listTwo.add(ThemesCrocodile("Лист 2. Девять"))

        listThree.add(ThemesCrocodile("Лист 3. Один"))
        listThree.add(ThemesCrocodile("Лист 3. Два"))
        listThree.add(ThemesCrocodile("Лист 3. Три"))
        listThree.add(ThemesCrocodile("Лист 3. Четыре"))
        listThree.add(ThemesCrocodile("Лист 3. Пять"))
        listThree.add(ThemesCrocodile("Лист 3. Шесть"))
        listThree.add(ThemesCrocodile("Лист 3. Семь"))
        listThree.add(ThemesCrocodile("Лист 3. Восемь"))
        listThree.add(ThemesCrocodile("Лист 3. Девять"))

    }
}