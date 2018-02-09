package net.blockchaind.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.blockchaind.coderswag.Adapter.CategoryAdapter
import net.blockchaind.coderswag.Model.Category
import net.blockchaind.coderswag.R
import net.blockchaind.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories )
        categoryListView.adapter = adapter

    }
}