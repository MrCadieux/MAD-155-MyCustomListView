package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        var list = arrayListOf<Model>()

        list.add(Model("Pikachu", "Pokemon", R.drawable.pikachu))
        list.add(Model("Evee", "Pokemon", R.drawable.evee))
        list.add(Model("Charmander", "Pokemon", R.drawable.charmander))
        list.add(Model("Diglett", "Pokemon", R.drawable.diglett))
        list.add(Model("Poliwag", "Pokemon", R.drawable.poliwag))
        list.add(Model("Bulbasaur", "Pokemon", R.drawable.bulbasaur))
        list.add(Model("Pikachu", "Pokemon", R.drawable.pikachu))
        list.add(Model("Evee", "Pokemon", R.drawable.evee))
        list.add(Model("Charmander", "Pokemon", R.drawable.charmander))
        list.add(Model("Diglett", "Pokemon", R.drawable.diglett))
        list.add(Model("Poliwag", "Pokemon", R.drawable.poliwag))
        list.add(Model("Bulbasaur", "Pokemon", R.drawable.bulbasaur))


        listView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(
                this,
                "You Selected:  "+ list[i].Name,
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}