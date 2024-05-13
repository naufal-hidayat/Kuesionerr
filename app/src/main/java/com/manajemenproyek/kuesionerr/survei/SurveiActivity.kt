package com.manajemenproyek.kuesionerr.survei

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.manajemenproyek.kuesionerr.MainActivity
import com.manajemenproyek.kuesionerr.R
import com.manajemenproyek.kuesionerr.data.SurveiDataSourceImpl
import com.manajemenproyek.kuesionerr.data.SurveiDataSource
import com.manajemenproyek.kuesionerr.home.HomeFragment
import com.manajemenproyek.kuesionerr.model.Survei
import com.manajemenproyek.kuesionerr.splash.SplashActivity
import com.manajemenproyek.kuesionerr.survei.adapter.AdapterSurvei

class SurveiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survei)

        val backButton = findViewById<ImageButton>(R.id.ib_back_home)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        showSurvei()
    }

    private fun showSurvei() {
        val rvSurvei = findViewById<RecyclerView>(R.id.rv_survei_near)
        val surveiAdapter = AdapterSurvei()
        rvSurvei.adapter = surveiAdapter
        rvSurvei.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        val surveiDataSource: SurveiDataSource = SurveiDataSourceImpl()
        val surveiList: List<Survei> = surveiDataSource.getSurvei()
        surveiAdapter.setData(surveiList)
    }
}
