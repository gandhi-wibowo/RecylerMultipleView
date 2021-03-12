package com.dizcoding.recylermultipleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dizcoding.mylibrv.BaseListAdapter
import com.dizcoding.recylermultipleview.adapter.exampleone.ExampleOneTypeFactoryImpl
import com.dizcoding.recylermultipleview.adapter.exampleone.dual.ExampleOneDualModel
import com.dizcoding.recylermultipleview.adapter.exampleone.full.ExampleOneFullModel
import com.dizcoding.recylermultipleview.adapter.exampleone.half.ExampleOneHalfModel
import com.dizcoding.recylermultipleview.adapter.exampletwo.ExampleTwoTypeFactoryImpl
import com.dizcoding.recylermultipleview.adapter.exampletwo.left.ExampleTwoLeftModel
import com.dizcoding.recylermultipleview.adapter.exampletwo.right.ExampleTwoRightModel
import com.dizcoding.recylermultipleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        initExampleOneData()
        initExampleTwoData()
    }

    private fun initExampleOneData() {
        val adapter = BaseListAdapter(ExampleOneTypeFactoryImpl())
        binding.mainRv.layoutManager = LinearLayoutManager(this)
        binding.mainRv.adapter = adapter

        adapter.addItems(
            listOf(
                ExampleOneFullModel("ONe Content Center"),
                ExampleOneHalfModel("One Content Left"),
                ExampleOneFullModel("ONe Content Center"),
                ExampleOneDualModel("Dual Content Left", "Dua Content RIght"),
                ExampleOneHalfModel("One Content Left"),
            )
        )
    }

    private fun initExampleTwoData() {
        val adapter = BaseListAdapter(ExampleTwoTypeFactoryImpl())
        binding.mainRv.layoutManager = LinearLayoutManager(this)
        binding.mainRv.adapter = adapter

        adapter.addItems(
            listOf(
                ExampleTwoLeftModel("Hy How Are you ?"),
                ExampleTwoLeftModel("I think i just miss you"),
                ExampleTwoRightModel("Im good. "),
                ExampleTwoRightModel("Aw that was so cute"),
                ExampleTwoRightModel("But, im a MAN, are you gay ?"),
            )
        )
    }
}