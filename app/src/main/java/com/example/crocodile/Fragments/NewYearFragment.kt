package com.example.crocodile.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.example.crocodile.Model.ThemesCrocodile
import com.example.crocodile.R


class NewYearFragment : Fragment() {

    private lateinit var tvCrocodile: TextView
    private lateinit var tvOneButton: TextView
    private lateinit var tvTwoButton: TextView
    private lateinit var tvThreeButton: TextView
    private lateinit var animationLottie: LottieAnimationView

    private var listOne: ArrayList<ThemesCrocodile> = arrayListOf()
    private var listTwo: ArrayList<ThemesCrocodile> = arrayListOf()
    private var listThree: ArrayList<ThemesCrocodile> = arrayListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvCrocodile = view.findViewById(R.id.tv_crocodile)
        tvOneButton = view.findViewById(R.id.button_level_one)
        tvTwoButton = view.findViewById(R.id.button_level_two)
        tvThreeButton = view.findViewById(R.id.button_level_three)
        animationLottie = view.findViewById(R.id.animation)
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
                tvCrocodile.text = "Список из темы 1 закончились"
            }
        }
        tvTwoButton.setOnClickListener {
            animationLottie.visibility = View.GONE
            val rand = (Math.random() * themesTwo.size).toInt()
            if (themesTwo.size != 0) {
                tvCrocodile.text = themesTwo[rand].name
                themesTwo.removeAt(rand)
            } else {
                tvCrocodile.text = "Список из темы 2 закончились"
            }
        }
        tvThreeButton.setOnClickListener {
            animationLottie.visibility = View.GONE
            val rand = (Math.random() * themesThree.size).toInt()
            if (themesThree.size != 0) {
                tvCrocodile.text = themesThree[rand].name
                themesThree.removeAt(rand)
            } else {
                tvCrocodile.text = "Список из темы 3 закончились"
            }
        }

    }

    private fun createData() {
        listOne.add(ThemesCrocodile("Ёлка"))
        listOne.add(ThemesCrocodile("Дед Мороз дарит подарок"))
        listOne.add(ThemesCrocodile("Ребенок получает подарок"))
        listOne.add(ThemesCrocodile("Эльф делает игрушку"))
        listOne.add(ThemesCrocodile("Эльф"))
        listOne.add(ThemesCrocodile("Бенгальские огни"))
        listOne.add(ThemesCrocodile("Хоровод"))
        listOne.add(ThemesCrocodile("Снег"))
        listOne.add(ThemesCrocodile("Есть Мандарин"))
        listOne.add(ThemesCrocodile("Мандарин"))
        listOne.add(ThemesCrocodile("Ёлочная иголка"))
        listOne.add(ThemesCrocodile("Мишура"))
        listOne.add(ThemesCrocodile("Конфетти"))
        listOne.add(ThemesCrocodile("Лепить Снеговика"))
        listOne.add(ThemesCrocodile("Развесить Гирлянду"))
        listOne.add(ThemesCrocodile("Новогодний салат"))
        listOne.add(ThemesCrocodile("Веселый Пьяный Степа"))
        listOne.add(ThemesCrocodile("Пьяный Степа"))
        listOne.add(ThemesCrocodile("Пьяный гость"))
        listOne.add(ThemesCrocodile("подарок"))
        listOne.add(ThemesCrocodile("хоровод"))
        listOne.add(ThemesCrocodile("варежки"))
        listOne.add(ThemesCrocodile("салют"))
        listOne.add(ThemesCrocodile("катание на лыжах"))
        listOne.add(ThemesCrocodile("катание на коньках"))
        listOne.add(ThemesCrocodile("Письмо Деду Морозу"))
        listOne.add(ThemesCrocodile("Новогодний утренник"))
        listOne.add(ThemesCrocodile("Новогоднее желание"))
        listOne.add(ThemesCrocodile("Елочные игрушки"))
        listOne.add(ThemesCrocodile("Северный полюс"))
        listOne.add(ThemesCrocodile("Санта Клаус"))
        listOne.add(ThemesCrocodile("Олени Санта Клауса"))
        listOne.add(ThemesCrocodile("Печенье и теплое молоко"))
        listOne.add(ThemesCrocodile("Снегурочка"))
        listOne.add(ThemesCrocodile("Дед Мороз"))
        listOne.add(ThemesCrocodile("Домик Деда Мороза"))
        listOne.add(ThemesCrocodile("Украшать ёлку"))
        listOne.add(ThemesCrocodile("Чудо на рождество"))

        listTwo.add(ThemesCrocodile("Лапландия"))
        listTwo.add(ThemesCrocodile("Старый Новый год"))
        listTwo.add(ThemesCrocodile("Танец снежинок"))
        listTwo.add(ThemesCrocodile("Новогодний утренник"))
        listTwo.add(ThemesCrocodile("Ребенок пишет письмо Деду Морозу"))
        listTwo.add(ThemesCrocodile("Новогодние куранты"))
        listTwo.add(ThemesCrocodile("Новогодние праздники"))
        listTwo.add(ThemesCrocodile("Холодец"))
        listTwo.add(ThemesCrocodile("Дед Мороз катается на лыжах"))
        listTwo.add(ThemesCrocodile("Дети катаются на коньках"))
        listTwo.add(ThemesCrocodile("Один Дома"))
        listTwo.add(ThemesCrocodile("Кевин остался дома один(Из Один Дома)"))
        listTwo.add(ThemesCrocodile("Новогоднее желание"))
        listTwo.add(ThemesCrocodile("Взрывать петарды"))
        listTwo.add(ThemesCrocodile("Полный мешок подарков"))
        listTwo.add(ThemesCrocodile("Папа переоделся в Деда Мороза"))
        listTwo.add(ThemesCrocodile("Ёлочная игрушка разбилась"))
        listTwo.add(ThemesCrocodile("Дед Мороз подарил Книгу"))
        listTwo.add(ThemesCrocodile("Ребенок катается на сноуборде"))
        listTwo.add(ThemesCrocodile("У Деда Мороза дети украли бороду"))
        listTwo.add(ThemesCrocodile("Дед Мороз похудел"))
        listTwo.add(ThemesCrocodile("Санта Клаус должен женится"))
        listTwo.add(ThemesCrocodile("Инопланетяни летят над океаном и поют Джингал Белз"))
        listTwo.add(ThemesCrocodile("Рудольф сломал рог и теперь его не узнают дети"))
        listTwo.add(ThemesCrocodile("31 декабря идет снегопад"))
        listTwo.add(ThemesCrocodile("1 января такси будет стоить 300 рублей"))
        listTwo.add(ThemesCrocodile("У Санты красный нос"))
        listTwo.add(ThemesCrocodile("Военные охраняют Санту, что бы его не сбили ПВО"))
        listTwo.add(ThemesCrocodile("Папе плохо Первого Января"))
        listTwo.add(ThemesCrocodile("Санта Клаус в подвале"))
        listTwo.add(ThemesCrocodile("Олег получит подарок"))
        listTwo.add(ThemesCrocodile("Сын Санты попал в список плохишей"))

        listThree.add(ThemesCrocodile("Снег кружится, летает, летает"))
        listThree.add(ThemesCrocodile("В лесу родилась елочка"))
        listThree.add(ThemesCrocodile("Ирония судьбы или С легким паром"))
        listThree.add(ThemesCrocodile("Дед Мороз решил не дарить подарок"))
        listThree.add(ThemesCrocodile("Родители решили рассказать, что Деда Мороза нет"))
        listThree.add(ThemesCrocodile("Санта Клаус дарит уголь"))
        listThree.add(ThemesCrocodile("Одна лампочка гирлянды не горит"))
        listThree.add(ThemesCrocodile("Дед Мороз потерял зуб в драке"))
        listThree.add(ThemesCrocodile("Снегурочка решила, что больше не может жить с дедом и нашла молодого парня"))
        listThree.add(ThemesCrocodile("Дед Мороз едет на санях"))
        listThree.add(ThemesCrocodile("Олени не хотят работать"))
        listThree.add(ThemesCrocodile("Дед мороз не накормил оленей и теперь они отказываются лететь"))
        listThree.add(ThemesCrocodile("Эльфы складывают подарки в мешок"))
        listThree.add(ThemesCrocodile("Взрыв хлопушки оглушил родителей"))
        listThree.add(ThemesCrocodile("Ребенок узнал в Деде Мороза бабушку"))
        listThree.add(ThemesCrocodile("Мальчику подарили Книгу, а он хотел Велосипед"))
        listThree.add(ThemesCrocodile("Дед Мороз не подарил Снегурочку мальчику"))
        listThree.add(ThemesCrocodile("Катался на сноуборде и сломал ногу"))
        listThree.add(ThemesCrocodile("Дед Мороз после детского утренника уснул в мешке из-под подарков"))
        listThree.add(ThemesCrocodile("Дед Мороз напился и проснулся в постели со Снежной бабой"))
        listThree.add(ThemesCrocodile("Дед Мороз получил письмо с просьбой от мальчика подарить ему настоящий танк"))
        listThree.add(ThemesCrocodile("Дед Мороз подарил Снегурочке нижнее белье"))
        listThree.add(ThemesCrocodile("Снегурочка застала Деда Мороза в постели со Снежной Королевой"))
        listThree.add(ThemesCrocodile("После новогодних банкетов Снегурочка поправилась на 6 кг"))
        listThree.add(ThemesCrocodile("Дед Мороз заболел, так как объелся мороженым"))
        listThree.add(ThemesCrocodile("Санта Клаус разводится с миссис Клаус, потому что нашел новую миссис Клаус"))
        listThree.add(ThemesCrocodile("Рудольф не хочет лететь, потому что у него депрессия"))
        listThree.add(ThemesCrocodile("Дед Мороз запил с Зубной Феей"))
        listThree.add(ThemesCrocodile("У Санты сломался новигатор, а над Океаном телефон не ловит сеть"))
        listThree.add(ThemesCrocodile("Бесить родственников на Новогодних каникулах"))

    }

    companion object {
        const val NEW_TEAR_FRAGMENT_TAG = "NEW_TEAR_FRAGMENT_TAG"
    }
}