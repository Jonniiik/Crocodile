package com.example.crocodile.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.crocodile.R
import com.sanojpunchihewa.glowbutton.GlowButton

class CheckFragment : Fragment() {

    private lateinit var bNewYear: GlowButton
    private lateinit var bBirthday: GlowButton

    private lateinit var llButton: LinearLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_check, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bNewYear = view.findViewById(R.id.new_year_button_check_fragment)
        bBirthday = view.findViewById(R.id.birthday_button_check_fragment)
        llButton = view.findViewById(R.id.check_fragment_linear_layout)
        llButton.visibility = View.VISIBLE

        bNewYear.setOnClickListener {
            llButton.visibility = View.GONE
            activity
            val fragment = NewYearFragment()
            openFragment(fragment, NewYearFragment.NEW_TEAR_FRAGMENT_TAG)
        }

        bBirthday.setOnClickListener {
            llButton.visibility = View.GONE
            val fragment = BirthdayFragment()
            openFragment(fragment, BirthdayFragment.BIRTHDAY_FRAGMENT_TAG)
        }
    }

    private fun openFragment(fragment: Fragment, tag: String){
        val fragmentManager = activity?.supportFragmentManager
        fragmentManager?.beginTransaction()?.apply {
            add(R.id.check_fragment_fragment_layout, fragment, tag)
            commit()
        }

    }

    companion object {
        const val CHECK_FRAGMENT_TAG = "CHECK_FRAGMENT_TAG"
    }
}

