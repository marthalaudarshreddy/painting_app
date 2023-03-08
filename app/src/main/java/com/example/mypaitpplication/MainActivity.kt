package com.example.mypaitpplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mypaitpplication.paint.Companion.colours
import com.example.mypaitpplication.paint.Companion.currentpaint
import com.example.mypaitpplication.paint.Companion.pathlist

class MainActivity : AppCompatActivity() {
    private lateinit var violet:ImageView
    private lateinit var green:ImageView
    private lateinit var pink:ImageView
    private lateinit var eraswer:ImageView
    companion object
    {
        var path=Path()
        var painbrush=Paint()
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        violet=findViewById(R.id.violet)
        green=findViewById(R.id.green)
        pink=findViewById(R.id.pink)
        eraswer=findViewById(R.id.eraswer)
        violet.setOnClickListener{
            painbrush.color = Color.BLUE
            currentcolor(painbrush.color)
        }
        green.setOnClickListener{
            painbrush.color = Color.GREEN
            currentcolor(painbrush.color)
        }
       pink.setOnClickListener{
           painbrush.color = Color. RED
           currentcolor(painbrush.color)
        }
        eraswer.setOnClickListener{
            pathlist.clear()
            colours.clear()
            path.reset()
        }
    }
    private fun currentcolor(color:Int)
    {
        currentpaint=color
        path=Path()
    }
}