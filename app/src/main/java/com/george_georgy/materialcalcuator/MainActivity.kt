package com.george_georgy.materialcalcuator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.george_georgy.materialcalcuator.ui.theme.MaterialCalcuatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialCalcuatorTheme {




            }
        }
    }
}

