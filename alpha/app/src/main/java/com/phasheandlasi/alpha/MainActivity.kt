package com.phasheandlasi.alpha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click_meA = findViewById(R.id.A) as Button
        // set on-click listener
        btn_click_meA.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 0)
            startActivity(i)
        }

        val btn_click_meB = findViewById(R.id.B) as Button
        // set on-click listener
        btn_click_meB.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 1)
            startActivity(i)
        }

        val btn_click_meC = findViewById(R.id.C) as Button
        // set on-click listener
        btn_click_meC.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 2)
            startActivity(i)
        }

        val btn_click_meD = findViewById(R.id.D) as Button
        // set on-click listener
        btn_click_meD.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 3)
            startActivity(i)
        }

        val btn_click_meE = findViewById(R.id.E) as Button
        // set on-click listener
        btn_click_meE.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 4)
            startActivity(i)
        }

        val btn_click_meF = findViewById(R.id.F) as Button
        // set on-click listener
        btn_click_meF.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 5)
            startActivity(i)
        }

        val btn_click_meG = findViewById(R.id.G) as Button
        // set on-click listener
        btn_click_meG.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 6)
            startActivity(i)
        }

        val btn_click_meH = findViewById(R.id.H) as Button
        // set on-click listener
        btn_click_meH.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 7)
            startActivity(i)
        }

        val btn_click_meI = findViewById(R.id.I) as Button
        // set on-click listener
        btn_click_meI.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 8)
            startActivity(i)
        }

        val btn_click_meJ = findViewById(R.id.J) as Button
        // set on-click listener
        btn_click_meJ.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 9)
            startActivity(i)
        }

        val btn_click_meK = findViewById(R.id.K) as Button
        // set on-click listener
        btn_click_meK.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 10)
            startActivity(i)
        }

        val btn_click_meL = findViewById(R.id.L) as Button
        // set on-click listener
        btn_click_meL.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 11)
            startActivity(i)
        }

        val btn_click_meM = findViewById(R.id.M) as Button
        // set on-click listener
        btn_click_meM.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 12)
            startActivity(i)
        }

        val btn_click_meN = findViewById(R.id.N) as Button
        // set on-click listener
        btn_click_meN.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 13)
            startActivity(i)
        }

        val btn_click_meO = findViewById(R.id.O) as Button
        // set on-click listener
        btn_click_meO.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 14)
            startActivity(i)
        }

        val btn_click_meP = findViewById(R.id.P) as Button
        // set on-click listener
        btn_click_meP.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 15)
            startActivity(i)
        }

        val btn_click_meQ = findViewById(R.id.Q) as Button
        // set on-click listener
        btn_click_meQ.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 16)
            startActivity(i)
        }

        val btn_click_meR = findViewById(R.id.R) as Button
        // set on-click listener
        btn_click_meR.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 17)
            startActivity(i)
        }

        val btn_click_meS = findViewById(R.id.S) as Button
        // set on-click listener
        btn_click_meS.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 18)
            startActivity(i)
        }

        val btn_click_meT = findViewById(R.id.T) as Button
        // set on-click listener
        btn_click_meT.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 19)
            startActivity(i)
        }

        val btn_click_meU = findViewById(R.id.U) as Button
        // set on-click listener
        btn_click_meU.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 20)
            startActivity(i)
        }

        val btn_click_meV = findViewById(R.id.V) as Button
        // set on-click listener
        btn_click_meV.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 21)
            startActivity(i)
        }

        val btn_click_meW = findViewById(R.id.W) as Button
        // set on-click listener
        btn_click_meW.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 22)
            startActivity(i)
        }

        val btn_click_meX = findViewById(R.id.X) as Button
        // set on-click listener
        btn_click_meX.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 23)
            startActivity(i)
        }

        val btn_click_meY = findViewById(R.id.Y) as Button
        // set on-click listener
        btn_click_meY.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 24)
            startActivity(i)
        }

        val btn_click_meZ = findViewById(R.id.Z) as Button
        // set on-click listener
        btn_click_meZ.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val i = Intent(this@MainActivity, app_display::class.java)
            i.putExtra(EXTRA_MESSAGE, 25)
            startActivity(i)
        }
    }

    companion object {
        const val EXTRA_MESSAGE = "BUTTON"
    }
    private val clicked: View.OnClickListener = object : View.OnClickListener {
        override fun onClick(v: View) {
            if (v.getId() == R.id.A) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 0)
                startActivity(i)
            }
            if (v.getId() == R.id.B) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 1)
                startActivity(i)
            }
            if (v.getId() == R.id.C) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 2)
                startActivity(i)
            }
            if (v.getId() == R.id.D) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 3)
                startActivity(i)
            }
            if (v.getId() == R.id.E) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 4)
                startActivity(i)
            }
            if (v.getId() == R.id.F) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 5)
                startActivity(i)
            }
            if (v.getId() == R.id.G) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 6)
                startActivity(i)
            }
            if (v.getId() == R.id.H) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 7)
                startActivity(i)
            }
            if (v.getId() == R.id.I) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 8)
                startActivity(i)
            }
            if (v.getId() == R.id.J) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 9)
                startActivity(i)
            }
            if (v.getId() == R.id.K) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 10)
                startActivity(i)
            }
            if (v.getId() == R.id.L) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 11)
                startActivity(i)
            }
            if (v.getId() == R.id.M) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 12)
                startActivity(i)
            }
            if (v.getId() == R.id.N) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 13)
                startActivity(i)
            }
            if (v.getId() == R.id.O) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 14)
                startActivity(i)
            }
            if (v.getId() == R.id.P) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 15)
                startActivity(i)
            }
            if (v.getId() == R.id.Q) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 16)
                startActivity(i)
            }
            if (v.getId() == R.id.R) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 17)
                startActivity(i)
            }
            if (v.getId() == R.id.S) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 18)
                startActivity(i)
            }
            if (v.getId() == R.id.T) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 19)
                startActivity(i)
            }
            if (v.getId() == R.id.U) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 20)
                startActivity(i)
            }
            if (v.getId() == R.id.V) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 21)
                startActivity(i)
            }
            if (v.getId() == R.id.W) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 22)
                startActivity(i)
            }
            if (v.getId() == R.id.Y) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 24)
                startActivity(i)
            }
            if (v.getId() == R.id.X) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 23)
                startActivity(i)
            }
            if (v.getId() == R.id.Z) {
                val i = Intent(this@MainActivity, app_display::class.java)
                i.putExtra(EXTRA_MESSAGE, 25)
                startActivity(i)
            }
        }
    }
}