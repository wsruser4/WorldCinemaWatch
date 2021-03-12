package com.example.worldcinemawatch.Main

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.wearable.activity.WearableActivity
import android.text.Editable
import android.text.TextWatcher
import com.example.worldcinemawatch.MainScreen.MainScreen
import com.example.worldcinemawatch.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

    var isCanEmail = false
    var isCanEmailVeri = false
    var isCanPass = false
    var isCanName = false
    var isCanFam = false
    var isCanpassAgg = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(et1.text.toString()).matches()) {
                    isCanEmail = true
                } else {
                    isCanEmail = false
                    et1.setError("Неверный e-mail")
                }
            }
        })

        //frameLayout1.isEnabled = isCanEmail


        frameLayout1.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }

        var isCanEmail = false

        if (et1.getText().toString().equals("")) {
            et1.error = "Заполните поле"
        } else {
            isCanEmail = true
        }

        if (android.util.Patterns.EMAIL_ADDRESS.matcher(et1.text.toString()).matches()) {
            isCanEmailVeri = true
        } else {
            et1.error = "Неверно введена почта"
            isCanEmailVeri = false
        }

        if (et2.getText().toString().equals("")) {
            isCanPass = false
            et2.error = "Заполните поле"
        } else {
            isCanPass = true
        }

        //frameLayout1.isEnabled = isCanEmailVeri

        frameLayout1.setOnClickListener{
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }




        setAmbientEnabled()

    }
}