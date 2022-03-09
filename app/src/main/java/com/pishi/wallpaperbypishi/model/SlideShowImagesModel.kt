package com.pishi.wallpaperbypishi.model

import com.pishi.wallpaperbypishi.R

data class SlideShowImagesModel(
    val title : String,
    val caption : String,
    val imageUri : Int,
    val rating : Float
)

val slidePhotos = listOf(
    SlideShowImagesModel(
        "photo1",
        "Caption1",
    R.drawable.bird_at_mwaani,
        4.0f
    ),
    SlideShowImagesModel(
        "photo2",
        "Caption2",
        R.drawable.birds,
        4.0f
    ),
    SlideShowImagesModel(
        "photo3",
        "Caption3",
        R.drawable.birds2,
        4.0f
    ),
    SlideShowImagesModel(
        "photo4",
        "Caption4",
        R.drawable.birds_tree,
        4.0f
    ),
    SlideShowImagesModel(
        "photo5",
        "Caption5",
        R.drawable.britam_tower,
        4.0f
    )
)