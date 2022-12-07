package com.example.premierleaguefixtures

import android.app.FragmentContainer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onResume() {
        super.onResume()
        //val fragmentContainerView: FragmentContainerView = findViewById<FragmentContainerView>(R.id.fragmentContainerView)

        val switch_1 :Switch = findViewById<Switch>(R.id.switch1)
        switch_1?.setOnCheckedChangeListener({ _ , isChecked ->
            //fragmentContainerView.
            if (isChecked)
            {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,Fragment2.newInstance("","")).commit()
            }
            else supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView,Fragment1.newInstance("","")).commit()
        })
    }
}