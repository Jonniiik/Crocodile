package com.example.crocodile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.crocodile.Fragments.CheckFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.inTransaction {
            val fragment = CheckFragment()
            add(R.id.main_activity_layout, fragment, CheckFragment.CHECK_FRAGMENT_TAG)
        }
    }

     private fun removeFragment(tag: String) {
        supportFragmentManager.inTransaction {
            val prev: Fragment? = supportFragmentManager.findFragmentByTag(tag)
            if (prev != null) remove(prev)
        }
    }

     private inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
        beginTransaction().apply {
            func()
            commit()
        }
    }
}