package com.example.shopapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemslist)
        val items = arrayListOf<Item>()

        items.add(Item(1,"sofa1","test","test","test",100))
        items.add(Item(2,"sofa2","test2","test2","test2",200))
        items.add(Item(3,"sofa3","test3","test3","test3",300))
        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
    }
