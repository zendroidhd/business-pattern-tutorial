package com.technologies.zenlight.builderpatterntutorial.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.technologies.zenlight.builderpatterntutorial.R
import com.technologies.zenlight.builderpatterntutorial.models.Business

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val address = "1234 Address Blvd"
        val name = "ZendroidHD"
        val description = "Android tutorials"
        val number = "777-777-7777"
        val date = "07/08/2020"
        val owner = "Owner"

        val business =
            Business(address, address, name, number, date, owner)

        val bizz: Business = Business.Builder()
            .setAddress(address)
            .setBusinessName(name)
            .build()

        Toast.makeText(this, bizz.businessName, Toast.LENGTH_SHORT).show()
    }
}
