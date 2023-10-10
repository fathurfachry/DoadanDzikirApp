package com.example.doadandzikirapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.doadandzikirapp.R
import com.example.doadandzikirapp.adapter.DzikirDoaAdapter
import com.example.doadandzikirapp.databinding.ActivityDzikirPagidanPetangBinding
import com.example.doadandzikirapp.model.DataDzikirDoaModel
import com.example.doadandzikirapp.ui.detail.DzikirPagiActivity
import com.example.doadandzikirapp.ui.detail.DzikirPetangActivity

class DzikirPagidanPetangActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding : ActivityDzikirPagidanPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagidanPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imgBtnDzikirPagi.setOnClickListener(this@DzikirPagidanPetangActivity)
            imgBtnDzikirPetang.setOnClickListener(this@DzikirPagidanPetangActivity)
        }
    }

    override fun onClick(v:View?) {
        when (v?.id) {
            R.id.img_btn_dzikir_pagi -> {
                val intentPA = Intent(this@DzikirPagidanPetangActivity, DzikirPagiActivity::class.java)
                startActivity(intentPA)
            }

            R.id.img_btn_dzikir_petang -> {
                val intentPE = Intent(this@DzikirPagidanPetangActivity, DzikirPetangActivity::class.java)
                startActivity(intentPE)
            }
        }
    }
}