package com.phasheandlasi.alpha

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.io.File

class app_display : AppCompatActivity() {
    var imageArr = arrayOf(R.drawable.slide01,
        R.drawable.slide02,
        R.drawable.slide03,
        R.drawable.slide04,
        R.drawable.slide05,
        R.drawable.slide06,
        R.drawable.slide07,
        R.drawable.slide08,
        R.drawable.slide09,
        R.drawable.slide10,
        R.drawable.slide11,
        R.drawable.slide12,
        R.drawable.slide13,
        R.drawable.slide14,
        R.drawable.slide15,
        R.drawable.slide16,
        R.drawable.slide17,
        R.drawable.slide18,
        R.drawable.slide19,
        R.drawable.slide20,
        R.drawable.slide21,
        R.drawable.slide22,
        R.drawable.slide23,
        R.drawable.slide24,
        R.drawable.slide25,
        R.drawable.slide26
    )


    var map: Array<Bitmap?> = arrayOfNulls<Bitmap>(26)
    private lateinit var imageView: ImageView
    var s = 0
    var `val` = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_display)
        var intentVal = intent

        print("Ping"+intentVal.getIntExtra(EXTRA_MESSAGE,0))
        //var s = getIntent().getIntExtra(EXTRA_MESSAGE, 0)
        Toast.makeText(this@app_display, intentVal.getIntExtra(EXTRA_MESSAGE,0).toString(), Toast.LENGTH_SHORT).show()

        synchronized(this) {
            `val` = s
        }

        imageView = findViewById(R.id.imageView)
        set(intentVal.getIntExtra(EXTRA_MESSAGE,0))
        loadImage(intentVal.getIntExtra(EXTRA_MESSAGE,0))
        //imageView.setImageDrawable()

        //imageView.setImageDrawable(BitmapDrawable(getResources(), map[s]))

        val btn_click_mePREV = findViewById(R.id.PREV) as Button
        // set on-click listener
        btn_click_mePREV.setOnClickListener {
            // your code to perform when the user clicks on the button
           //Toast.makeText(this@app_display, "You clicked me.", Toast.LENGTH_SHORT).show()
            dec()

            if(s==0){
                imageView.setImageResource(imageArr[0])
            }
            else{
                imageView.setImageResource(imageArr[s])
            }
        }

        val btn_click_meNEXT = findViewById(R.id.NEXT) as Button
        // set on-click listener
        btn_click_meNEXT.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@app_display, "You clicked me.", Toast.LENGTH_SHORT).show()
            inc()
            if(s==25){
                imageView.setImageResource(imageArr[25])
            }
            else{
                imageView.setImageResource(imageArr[s])
            }

        }

        val btn_click_meFIRST = findViewById(R.id.FIRST) as Button
        // set on-click listener
        btn_click_meFIRST.setOnClickListener {
            //Toast.makeText(this@app_display, "You clicked me.", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(imageArr[0])
        }

        val btn_click_meLAST = findViewById(R.id.LAST) as Button
        // set on-click listener
        btn_click_meLAST.setOnClickListener {
            //Toast.makeText(this@app_display, "You clicked me.", Toast.LENGTH_SHORT).show()
            imageView.setImageResource(imageArr[25])
        }

        val btn_click_meOVERVIEW = findViewById(R.id.Over) as Button
        // set on-click listener
        btn_click_meOVERVIEW.setOnClickListener {
            // your code to perform when the user clicks on the button
            val i = Intent(this@app_display, MainActivity::class.java)
            i.putExtra(MainActivity.EXTRA_MESSAGE, 0)
            startActivity(i)
        }
    }

    @Synchronized
    fun loadImage(l:Int) {
        s = l
        imageView.setImageResource(imageArr[s])
    }

    @Synchronized
    fun read(): Int {
        return s
    }

    @Synchronized
    fun inc(): Int {
        return s++
    }

    @Synchronized
    fun dec(): Int {
        return s--
    }

    @Synchronized
    fun set(n: Int) {
        s = n
    }

    companion object {
        const val EXTRA_MESSAGE = "BUTTON"
    }
}