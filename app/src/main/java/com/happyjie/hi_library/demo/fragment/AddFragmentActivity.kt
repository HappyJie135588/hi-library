package com.happyjie.hi_library.demo.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.happyjie.hi_library.R

class AddFragmentActivity : AppCompatActivity() {

    private val FIRST_FRAGMENT = "first_fragment"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_fragment)

        val firstFragment = FirstFragment()

        val fragment: Fragment? = supportFragmentManager.findFragmentByTag(FIRST_FRAGMENT)

        if (fragment == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, firstFragment, FIRST_FRAGMENT)
                .commit()
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
    }
}
