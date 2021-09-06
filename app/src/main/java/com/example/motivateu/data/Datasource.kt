package com.example.motivateu.data

import com.example.motivateu.R
import com.example.motivateu.model.Motivation

class Datasource {

    fun loadMotivations() : List<Motivation>{
    return listOf<Motivation>(
        Motivation(R.string.motivate1, R.drawable.image1),
        Motivation(R.string.motivate2, R.drawable.image2),
        Motivation(R.string.motivate3, R.drawable.image3),
        Motivation(R.string.motivate4, R.drawable.image4),
        Motivation(R.string.motivate5, R.drawable.image5),
        Motivation(R.string.motivate6, R.drawable.image6),
        Motivation(R.string.motivate7, R.drawable.image7),
        Motivation(R.string.motivate8, R.drawable.image8),
        Motivation(R.string.motivate9, R.drawable.image9),
        Motivation(R.string.motivate10, R.drawable.image10),
        Motivation(R.string.motivate11, R.drawable.image2),
        Motivation(R.string.motivate12, R.drawable.image7),
        Motivation(R.string.motivate13, R.drawable.image3),
        Motivation(R.string.motivate14, R.drawable.image9),
        Motivation(R.string.motivate15, R.drawable.image1),
    )
    }
}