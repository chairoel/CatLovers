package com.amrul.test.testapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.amrul.test.testapp.R
import com.amrul.test.testapp.model.Cat

class DetailActivity : AppCompatActivity() {

    private lateinit var photoCat: ImageView
    private lateinit var nameCat: TextView
    private lateinit var detailCat: TextView
    private lateinit var priceCat: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val btnBck: Button = findViewById(R.id.btnBack)
        btnBck.setOnClickListener{
            onBackPressed()
            finish()
        }

        val cat = intent.getParcelableExtra<Cat>(MainActivity.INTENT_PARCELABLE)

        photoCat = findViewById(R.id.ivCatDetail)
        nameCat = findViewById(R.id.tvNameDetail)
        detailCat = findViewById(R.id.tvCatDetail)
        priceCat = findViewById(R.id.tvPriceDetail)

        photoCat.setImageResource(cat?.photoCat!!)
        nameCat.text = cat.nameCat
        detailCat.text = cat.detailCat
        priceCat.text = cat.priceCat
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}