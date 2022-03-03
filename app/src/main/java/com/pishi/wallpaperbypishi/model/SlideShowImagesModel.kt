package com.pishi.wallpaperbypishi.model

import com.pishi.wallpaperbypishi.R

data class SlideShowImagesModel(
    val title : String,
    val caption : String,
    val imageUrl : Int
)

val slidePhotos = listOf(
    SlideShowImagesModel(
        "photo1",
        "Caption1",
    R.drawable.bird_at_mwaani
    ),
    SlideShowImagesModel(
        "photo2",
        "Caption2",
        R.drawable.birds
    ),
    SlideShowImagesModel(
        "photo3",
        "Caption3",
        R.drawable.birds2
    ),
    SlideShowImagesModel(
        "photo4",
        "Caption4",
        R.drawable.birds_tree
    ),
    SlideShowImagesModel(
        "photo5",
        "Caption5",
        R.drawable.britam_tower
    )
)