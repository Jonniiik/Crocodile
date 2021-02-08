package com.example.crocodile.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.lottie.LottieAnimationView
import com.example.crocodile.Model.ThemesCrocodile
import com.example.crocodile.R
import com.sanojpunchihewa.glowbutton.GlowButton

class BirthdayFragment : Fragment(), View.OnTouchListener {
    private lateinit var layout: RelativeLayout
    private lateinit var layoutButton: LinearLayout
    private lateinit var animation: LottieAnimationView
    private lateinit var tvQuestion: TextView

    private lateinit var bNasta: GlowButton
    private lateinit var bInterest: GlowButton
    private lateinit var bAnotherInterest: GlowButton

    //Листы для слов
    private var listOne: ArrayList<ThemesCrocodile> = arrayListOf()
    private var listTwo: ArrayList<ThemesCrocodile> = arrayListOf()
    private var listThree: ArrayList<ThemesCrocodile> = arrayListOf()

    //Тоже листы для слов, но из него мы будем удалять слова которые показали
    private val themesOne: ArrayList<ThemesCrocodile> = arrayListOf()
    private val themesTwo: ArrayList<ThemesCrocodile> = arrayListOf()
    private val themesThree: ArrayList<ThemesCrocodile> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_birthday, container, false)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layout = view.findViewById(R.id.layout_birthday)
        layout.setOnTouchListener(this)
        animation = view.findViewById(R.id.animation_birthday)
        layoutButton = view.findViewById(R.id.birthday_button_layout)
        tvQuestion = view.findViewById(R.id.tv_crocodile_question)

        bNasta = view.findViewById(R.id.layout_birthday_glowButton_Nasta)
        bInterest = view.findViewById(R.id.layout_birthday_glowButton_fanny)
        bAnotherInterest = view.findViewById(R.id.layout_birthday_glowButton_another_fanny)

        createData()

        themesOne.addAll(listOne)

        themesTwo.addAll(listTwo)

        themesThree.addAll(listThree)

        bNasta.setOnClickListener {
            val rand = (Math.random() * themesOne.size).toInt()
            if (themesOne.size != 0) {
                tvQuestion.text = themesOne[rand].name
                themesOne.removeAt(rand)
                bNasta.visibility = View.VISIBLE
            } else {
                tvQuestion.text = "Список из темы 1 закончились"
                bNasta.visibility = View.GONE
            }
            checkAllWords()
        }
        bInterest.setOnClickListener {
            val rand = (Math.random() * themesTwo.size).toInt()
            if (themesTwo.size != 0) {
                tvQuestion.text = themesTwo[rand].name
                themesTwo.removeAt(rand)
                bInterest.visibility = View.VISIBLE
            } else {
                tvQuestion.text = "Список из темы 2 закончились"
                bInterest.visibility = View.GONE
            }
            checkAllWords()
        }
        bAnotherInterest.setOnClickListener {
            val rand = (Math.random() * themesThree.size).toInt()
            if (themesThree.size != 0) {
                tvQuestion.text = themesThree[rand].name
                themesThree.removeAt(rand)
                bAnotherInterest.visibility = View.VISIBLE
            } else {
                tvQuestion.text = "Список из темы 3 закончились"
                bAnotherInterest.visibility = View.GONE
            }
            checkAllWords()
        }
    }

    private fun checkAllWords() {
        if (themesOne.isEmpty() && themesTwo.isEmpty() && themesThree.isEmpty())
            tvQuestion.text = "Все слова закончились"
    }

    private fun createData() {
        listOne.apply {
            add(ThemesCrocodile("Настя с Женей опоздали, потому что Женя долго собирался"))
            add(ThemesCrocodile("Настя рисует картины"))
            add(ThemesCrocodile("Настя любит лежать в кресле мешке"))
            add(ThemesCrocodile("Настя любит смотреть хорошие фильмы"))
            add(ThemesCrocodile("Настя любит пить шампанское без бокала"))
            add(ThemesCrocodile("Степа хочет напиться"))
            add(ThemesCrocodile("Олег не хочет лысеть"))
            add(ThemesCrocodile("Павлику нравятся прямые дороги и быстрый электрический транспорт"))
            add(ThemesCrocodile("Настя любит фотографировать в Человеке пауке"))
            add(ThemesCrocodile("Лизу устала на Дне рождения Насти и спала на кухне."))
            add(ThemesCrocodile("Юля выращивает водоросли"))
            add(ThemesCrocodile("Добрый шеф "))
            add(ThemesCrocodile("отдел кадров "))
            add(ThemesCrocodile("строгая отчетность"))
            add(ThemesCrocodile("безработный программист"))
            add(ThemesCrocodile("долгосрочный контракт"))
            add(ThemesCrocodile("Жил-был пес"))
            add(ThemesCrocodile("Happy Birthday to You"))
            add(ThemesCrocodile("Женщина-бригадир"))
            add(ThemesCrocodile("маленький тракторист"))
            add(ThemesCrocodile("В погоне за счастьем"))
            add(ThemesCrocodile("Ах эта свадьба-свадьба пела и гуляла"))
            add(ThemesCrocodile("Тэквондо"))
            add(ThemesCrocodile("Антон Чехов"))
            add(ThemesCrocodile("Яркий дождь"))
            add(ThemesCrocodile("Серега не пьёт"))


        }

        listTwo.apply {
            add(ThemesCrocodile("Фантастика"))
            add(ThemesCrocodile("Шляпа"))
            add(ThemesCrocodile("Тюль"))
            add(ThemesCrocodile("Антивирус"))
            add(ThemesCrocodile("Генерал"))
            add(ThemesCrocodile("Спрей"))
            add(ThemesCrocodile("Мелодия"))
            add(ThemesCrocodile("Зарплата"))
            add(ThemesCrocodile("Лошадь"))
            add(ThemesCrocodile("Фарш"))
            add(ThemesCrocodile("Клавесин"))
            add(ThemesCrocodile("Гайморит"))
            add(ThemesCrocodile("Дезинфекция"))
            add(ThemesCrocodile("Привет"))
            add(ThemesCrocodile("Рубеж"))
            add(ThemesCrocodile("Логика"))
            add(ThemesCrocodile("Фактор"))
            add(ThemesCrocodile("Галоген"))
            add(ThemesCrocodile("Бабник"))
            add(ThemesCrocodile("Валенок"))
            add(ThemesCrocodile("Человек"))
            add(ThemesCrocodile("Леденец"))
            add(ThemesCrocodile("Пятница"))
            add(ThemesCrocodile("Желтые "))
            add(ThemesCrocodile("нарциссы"))
            add(ThemesCrocodile("ежедневник"))
            add(ThemesCrocodile("субботник"))
            add(ThemesCrocodile("календарь"))
            add(ThemesCrocodile("леопард"))
            add(ThemesCrocodile("сауна"))
            add(ThemesCrocodile("режим дня"))
            add(ThemesCrocodile("бензопила"))


        }

        listThree.apply {
            add(ThemesCrocodile("Конкурс Крокодил"))
            add(ThemesCrocodile("Там, где клен шумит"))
            add(ThemesCrocodile("Сиреневый туман над нами проплывает"))
            add(ThemesCrocodile("Ты не ищи меня я люли-люли"))
            add(ThemesCrocodile("Теперь я Чебурашка"))
            add(ThemesCrocodile("Я рисую белым мелом"))
            add(ThemesCrocodile("Денежная премия"))
            add(ThemesCrocodile("Я люблю свою работу"))
            add(ThemesCrocodile("блинчики с маком "))
            add(ThemesCrocodile("Сильный дождь "))
            add(ThemesCrocodile("ночная гроза "))
            add(ThemesCrocodile("Смешной Икарус"))
            add(ThemesCrocodile("ленивый кот "))
            add(ThemesCrocodile("большая мышь"))
            add(ThemesCrocodile("Бриллиантовая рука"))
            add(ThemesCrocodile("Ирония судьбы"))
            add(ThemesCrocodile("Любовь и голуби"))
            add(ThemesCrocodile("Селедка под шубой"))
            add(ThemesCrocodile("Лед тронулся"))
            add(ThemesCrocodile("Черепашка ниндзя "))
            add(ThemesCrocodile("Розовенький бегемотик"))
            add(ThemesCrocodile("Двухрулевой велосипед"))
            add(ThemesCrocodile("мыльный пузырь"))
            add(ThemesCrocodile("Грустный Пятачок"))
            add(ThemesCrocodile("говорящий попугай "))

        }
    }


    companion object {
        const val BIRTHDAY_FRAGMENT_TAG = "BIRTHDAY_FRAGMENT_TAG"
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View, event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                animation.visibility = View.GONE
                layoutButton.visibility = View.VISIBLE
            }
        }
        return true
    }
}