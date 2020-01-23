package com.example.testdeeplinkdummy0

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("omer://bugun/gunlerden/persembe"))  // opens Activity2
            startActivity(intent)
        }
    }
}
