package com.amrul.test.testapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amrul.test.testapp.R
import com.amrul.test.testapp.adapter.CardViewCatAdapter
import com.amrul.test.testapp.data.CatData
import com.amrul.test.testapp.model.Cat

class MainActivity : AppCompatActivity() {
    private lateinit var myToolbar: androidx.appcompat.widget.Toolbar
    private lateinit var rvCats: RecyclerView
    private var list: ArrayList<Cat> = arrayListOf()

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        myToolbar = findViewById(R.id.myToolbar)
//        setSupportActionBar(myToolbar)


        list.addAll(CatData.listCatData)
        rvCats = findViewById(R.id.rvCats)
        showRecyclerList()

        val btnInfo: Button = findViewById(R.id.btnInfo)
        btnInfo.setOnClickListener{
            val intentInfo= Intent(this@MainActivity, InfoActivity::class.java)
            startActivity(intentInfo)
        }
    }

    private fun showRecyclerList() {
        rvCats.layoutManager = LinearLayoutManager(this)
        rvCats.setHasFixedSize(true)
        val cardViewCatAdapter = CardViewCatAdapter(this, list) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
        rvCats.adapter = cardViewCatAdapter
    }
}