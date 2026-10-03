package com.butmeseenglishvoicetotext
// MainActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           spacer() 
           spacer()
    Text("Butmese English Voice To Text")
}
    }
}


