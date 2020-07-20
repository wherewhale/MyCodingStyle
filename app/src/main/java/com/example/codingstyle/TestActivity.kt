package com.example.codingstyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    private var from = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val intent = Intent(this, ResultActivity::class.java)


        val ani = AnimationUtils.loadAnimation(this, R.anim.fade_in)


        btn_yes.setOnClickListener {
            when (from) {
                0 -> {
                    question_text.text = getString(R.string.q2)
                    question_text.clearAnimation()
                    question_text.startAnimation(ani)
                    from = 1
                }
                1 -> {
                    question_text.text = getString(R.string.q4)
                    question_text.clearAnimation()
                    question_text.startAnimation(ani)
                    from = 3
                }
                2 -> {
                    question_text.text = getString(R.string.q6)
                    question_text.clearAnimation()
                    question_text.startAnimation(ani)
                    from = 5
                }
                3 -> {
                    intent.apply {
                        putExtra("result", 1)
                        Log.d("tag", "보내는 데이터 : $intent")
                    }
                    startActivity(intent)
                    //결과출력
                }
                4 -> {
                    intent.apply {
                        putExtra("result", 3)
                        Log.d("tag", "보내는 데이터 : $intent")
                    }
                    startActivity(intent)
                    //결과출력
                }
                5 -> {
                    intent.apply {
                        putExtra("result", 5)
                        Log.d("tag", "보내는 데이터 : $intent")
                    }
                    startActivity(intent)
                    //결과출력
                }
                6 -> {
                    intent.apply {
                        putExtra("result", 7)
                        Log.d("tag", "보내는 데이터 : $intent")
                    }
                    startActivity(intent)
                    //결과출력
                }
            }
        }

        btn_no.setOnClickListener {
            when (from) {
                0 -> {
                    question_text.text = getString(R.string.q3)
                    question_text.clearAnimation()
                    question_text.startAnimation(ani)
                    from = 2
                }
                1 -> {
                    question_text.text = getString(R.string.q5)
                    question_text.clearAnimation()
                    question_text.startAnimation(ani)
                    from = 4
                }
                2 -> {
                    question_text.text = getString(R.string.q7)
                    question_text.clearAnimation()
                    question_text.startAnimation(ani)
                    from = 6
                }
                3 -> {
                    intent.apply {
                        putExtra("result", 2)
                        Log.d("tag", "보내는 데이터 : $intent")
                    }
                    startActivity(intent)
                    //결과출력
                }
                4 -> {
                    intent.apply {
                        putExtra("result", 4)
                        Log.d("tag", "보내는 데이터 : $intent")
                    }
                    startActivity(intent)
                    //결과출력
                }
                5 -> {
                    intent.apply {
                        putExtra("result", 6)
                        Log.d("tag", "보내는 데이터 : $intent")
                    }
                    startActivity(intent)
                    //결과출력
                }
                6 -> {
                    intent.apply {
                        putExtra("result", 8)
                        Log.d("tag", "보내는 데이터 : $intent")
                    }
                    startActivity(intent)
                    //결과출력
                }
            }
        }


    }
}