package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity2 : AppCompatActivity() {

    lateinit var rg_gender : RadioGroup
    lateinit var rb_male : RadioButton
    lateinit var rb_female : RadioButton
    lateinit var rb_other : RadioButton

    lateinit var cb_avengers : CheckBox
    lateinit var cb_inception : CheckBox
    lateinit var cb_shawshanks : CheckBox
    lateinit var cb_interstellar : CheckBox
    lateinit var cb_sardar : CheckBox

    lateinit var btn_sub : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rg_gender = findViewById(R.id.rg_gender) as RadioGroup;
        rb_male = findViewById(R.id.rb_male) as RadioButton
        rb_female = findViewById(R.id.rb_female) as RadioButton
        rb_other = findViewById(R.id.rb_other) as RadioButton

        cb_avengers = findViewById(R.id.cb_avengers) as CheckBox
        cb_inception = findViewById(R.id.cb_inception) as CheckBox
        cb_shawshanks = findViewById(R.id.cb_shawshanks) as CheckBox
        cb_interstellar = findViewById(R.id.cb_intersteller) as CheckBox
        cb_sardar = findViewById(R.id.cb_sardar) as CheckBox

        btn_sub = findViewById(R.id.btn_sub) as Button

        btn_sub.setOnClickListener(View.OnClickListener {
            var result = ""
            if (rg_gender.checkedRadioButtonId != -1){
                result +="Selected gender : "
                if (rb_male.isChecked){
                    result +="male\n"}
                else if(rb_female.isChecked){
                    result += "female\n"}
                else if(rb_other.isChecked){
                    result +="other\n"}

            }
            result += "favourite movies : "

            if (cb_avengers.isChecked)
                result += "Avengers Endgame,"
            if (cb_inception.isChecked)
                result += "Inception,"
            if (cb_shawshanks.isChecked)
                result += "Shawshanks Redemption,"
            if (cb_interstellar.isChecked)
                result += "Interstellar,"
            if (cb_sardar.isChecked)
                result += "Sardar Udham Singh,"

            val toast = Toast.makeText(applicationContext,result,Toast.LENGTH_LONG).show()

        })
    }
}