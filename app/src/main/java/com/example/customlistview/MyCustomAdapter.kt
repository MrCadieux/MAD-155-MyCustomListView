package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter(var ctx: Context, var ourResource: Int,
                      var Items: ArrayList<Model>): ArrayAdapter<Model>(ctx, ourResource, Items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource,null)

        //goto layout and get the links to items
        val name = view.findViewById<TextView>(R.id.nameLabel)
        val extra = view.findViewById<TextView>(R.id.extraText)
        val picture = view.findViewById<ImageView>(R.id.picture)

        name.text = Items[position].Name
        extra.text = Items[position].extraText
        picture.setImageDrawable(ctx.resources.getDrawable(Items[position].img))

        return view
    }

                      }