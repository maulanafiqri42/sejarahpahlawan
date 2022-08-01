package com.fiqri.pahlawannasional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fiqri.pahlawannasional.R
import com.fiqri.pahlawannasional.main.MainActivity
import kotlinx.android.synthetic.main.activity_splasscreen.*

class splasscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splasscreen)

        lv_logo.alpha=0f
        lv_logo.animate().setDuration(1500).alpha(1f).withEndAction{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}