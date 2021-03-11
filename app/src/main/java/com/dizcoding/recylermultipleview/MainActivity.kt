package com.dizcoding.recylermultipleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dizcoding.mylibrv.BaseListAdapter
import com.dizcoding.recylermultipleview.adapter.exampleone.ExampleOneFactoryImpl
import com.dizcoding.recylermultipleview.adapter.exampleone.ExampleOneModel
import com.dizcoding.recylermultipleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var adapter: BaseListAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = BaseListAdapter(ExampleOneFactoryImpl())

        binding.mainRv.layoutManager = LinearLayoutManager(this)
        binding.mainRv.adapter = adapter

        initExampleOneData()
    }

    private fun initExampleOneData(){
        adapter.addItems(listOf(
            ExampleOneModel(listOf("1"),0),
            ExampleOneModel(listOf("2","3"),1),
            ExampleOneModel(listOf("4","5"),1),
            ExampleOneModel(listOf("6"),2),
            ExampleOneModel(listOf("7"),0)
        ))
    }
}