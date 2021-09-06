package com.example.bitcoinconverterapp

import android.icu.text.NumberFormat
import android.os.Build
//import android.icu.util.Currency
//import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.bitcoinconverterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //When Button is Clicked
        binding.btn.setOnClickListener {
            convertBTC()
        }
    }

    //Convert Function
    @RequiresApi(Build.VERSION_CODES.N)
    private fun convertBTC() {

        //BTC xchange rate
        val btcprice = 5000000

        //pull value from input box
        val btc = binding.bitInput.text.toString().toDouble()

        //calculate btc value in Euro with 2decimal points
        var result: String =  String.format("%.2f", (btc * btcprice))

        //check if round-off switch is on and return round-off figure
        if (binding.RoundoffSwitch.isChecked) {

            result = (kotlin.math.round(btc * btcprice)).toString()

            }
        //display variable for when button is clicked
        val display = NumberFormat.getCurrencyInstance().format(result.toDouble())

        //display variables for when toggle switch is clicked
        val display1 = NumberFormat.getCurrencyInstance().format((kotlin.math.round(btc * btcprice)).toString().toDouble())
        val display2 = NumberFormat.getCurrencyInstance().format(String.format("%.2f", (btc * btcprice)).toDouble())

        //show result method for when button is clicked
        binding.resDisplay.text = getString(R.string.result_amount, display)

        //method to vary result when round-off button is switched on and off
        binding.RoundoffSwitch.setOnClickListener {

            if (binding.RoundoffSwitch.isChecked) {

                binding.resDisplay.text = getString(R.string.result_amount, display1)

            }else {
                binding.resDisplay.text = getString(R.string.result_amount, display2)
            }
        }

    }
}