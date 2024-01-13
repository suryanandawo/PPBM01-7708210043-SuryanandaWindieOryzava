
package com.example.prominentstudio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class Gallery : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        setupPhotoSlider()
        setupNatureSlider()
    }

    private fun setupPhotoSlider() {
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://images.unsplash.com/photo-1534528741775-53994a69daeb?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cG9ydHJhaXR8ZW58MHx8MHx8fDA%3D", "Portrait"))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1523050854058-8df90110c9f1?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Z3JhZHVhdGlvbnxlbnwwfHwwfHx8MA%3D%3D", "Graduation"))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1532712938310-34cb3982ef74?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8d2VkZGluZ3xlbnwwfHwwfHx8MA%3D%3D", "Wedding"))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1536293283170-b4604bbe272f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGhvdG9zaG9vdHxlbnwwfHwwfHx8MA%3D%3D", "Commercial"))

        imageSlider.setImageList(imageList)
    }

    private fun setupNatureSlider() {
        val imageSliderNature = findViewById<ImageSlider>(R.id.image_slider_nature)
        val imageListNature = ArrayList<SlideModel>()

        imageListNature.add(SlideModel("https://images.unsplash.com/photo-1542662565-7e4b66bae529?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fG1vdW50YWlufGVufDB8fDB8fHww", "Mountain"))
        imageListNature.add(SlideModel("https://images.unsplash.com/photo-1586348943529-beaae6c28db9?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fG5hdHVyZXxlbnwwfHwwfHx8MA%3D%3D", "Sunset"))
        imageListNature.add(SlideModel("https://images.unsplash.com/photo-1441974231531-c6227db76b6e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fG5hdHVyZXxlbnwwfHwwfHx8MA%3D%3D", "Forest"))
        imageListNature.add(SlideModel("https://images.unsplash.com/photo-1468581264429-2548ef9eb732?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8c2VhfGVufDB8fDB8fHww", "Sea"))

        imageSliderNature.setImageList(imageListNature)
    }
}
