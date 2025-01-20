package com.vzh.facedetectionapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.vzh.facedetectionapp.databinding.ActivityMainBinding
import com.vzh.facedetectionapp.facedetection.FaceDetectionActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFaceDetection.setOnClickListener{
            FaceDetectionActivity.start(this)
        }
    }
}