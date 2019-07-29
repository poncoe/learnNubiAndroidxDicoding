package id.poncoe.latihandicoding.Kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import id.poncoe.latihandicoding.Java.BarVolumeJava
import id.poncoe.latihandicoding.Java.ViewViewGroupJava
import id.poncoe.latihandicoding.Java.belajarintent.BelajarPindahActivityJava
import id.poncoe.latihandicoding.Kotlin.belajarintent.BelajarPindahActivityKt
import id.poncoe.latihandicoding.Kotlin.recyclerview.MainRecyclerView
import id.poncoe.latihandicoding.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityKt : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // onClickListener Java

        val jv1: Button = findViewById(R.id.btn_jv_1)
        jv1.setOnClickListener(this)

        val jv2: Button = findViewById(R.id.btn_jv_2)
        jv2.setOnClickListener(this)

        val jv3: Button = findViewById(R.id.btn_jv_3)
        jv3.setOnClickListener(this)

        val jv4: Button = findViewById(R.id.btn_jv_4)
        jv4.setOnClickListener(this)

        // onClickListener Kotlin

        val kt1: Button = findViewById(R.id.btn_kt_1)
        kt1.setOnClickListener(this)

        val kt2: Button = findViewById(R.id.btn_kt_2)
        kt2.setOnClickListener(this)

        val kt3: Button = findViewById(R.id.btn_kt_3)
        kt3.setOnClickListener(this)

        val kt4: Button = findViewById(R.id.btn_kt_4)
        kt4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {

            // onClick Java

            R.id.btn_jv_1 -> {
                val moveIntent = Intent(this@MainActivityKt, BarVolumeJava::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_jv_2 -> {
                val moveIntent = Intent(this@MainActivityKt, BelajarPindahActivityJava::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_jv_3 -> {
                val moveIntent = Intent(this@MainActivityKt, ViewViewGroupJava::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_jv_4 -> {
                val moveIntent = Intent(this@MainActivityKt, id.poncoe.latihandicoding.Java.recyclerview.MainRecyclerView::class.java)
                startActivity(moveIntent)
            }

            // onClick Kotlin

            R.id.btn_kt_1 -> {
                val moveIntent = Intent(this@MainActivityKt, BarVolumeKt::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_kt_2 -> {
                val moveIntent = Intent(this@MainActivityKt, BelajarPindahActivityKt::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_kt_3 -> {
                val moveIntent = Intent(this@MainActivityKt, ViewViewGroupKt::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_kt_4 -> {
                val moveIntent = Intent(this@MainActivityKt, MainRecyclerView::class.java)
                startActivity(moveIntent)
            }
        }
    }

    override fun onBackPressed() {
        finish()
    }

}