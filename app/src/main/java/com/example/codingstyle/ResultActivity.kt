package com.example.codingstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if (intent.hasExtra("result")) {

            Log.d("tag(result)", "${intent.getIntExtra("result", 0)}")
            when (intent.getIntExtra("result", 0)) {
                2 -> {
                    result_text.text = getString(R.string.kotlin)
                    result_image.setImageResource(R.drawable.kotlin)
                }
                3 -> {
                    result_text.text = getString(R.string.csharp)
                    result_image.setImageResource(R.drawable.csharp)
                }
                4 -> {
                    result_text.text = getString(R.string.java)
                    result_image.setImageResource(R.drawable.java)
                }
                5 -> {
                    result_text.text = getString(R.string.r)
                    result_image.setImageResource(R.drawable.r)
                }
                6 -> {
                    result_text.text = getString(R.string.sql)
                    result_image.setImageResource(R.drawable.sql)
                }
                7 -> {
                    result_text.text = getString(R.string.c)
                    result_image.setImageResource(R.drawable.c)
                }
                8 -> {
                        result_text.text = getString(R.string.python)
                        result_image.setImageResource(R.drawable.python)
                }
            }
        }

        btn_share.setOnClickListener {
            val sharingIntent = Intent(Intent.ACTION_SEND)
            sharingIntent.type = "text/plain" // 고정

            when (intent.getIntExtra("result", 0)) {
                1 -> {
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://wherewha1e.tistory.com/2")
                }
                2 -> {
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://wherewha1e.tistory.com/3")
                }
                3 -> {
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://wherewha1e.tistory.com/4")
                }
                4 -> {
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://wherewha1e.tistory.com/5")
                }
                5 -> {
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://wherewha1e.tistory.com/6")
                }
                6 -> {
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://wherewha1e.tistory.com/7")
                }
                7 -> {
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://wherewha1e.tistory.com/8")
                }
                8 -> {
                    sharingIntent.putExtra(Intent.EXTRA_TEXT, "https://wherewha1e.tistory.com/9")
                }
            }
            sharingIntent.setPackage("com.kakao.talk") // 고정.

            Log.d("tag(share)", "$sharingIntent")

            startActivity(sharingIntent)


        }
    }
}