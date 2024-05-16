package com.example.marsphotos.fake

import com.example.marsphotos.model.MarsPhoto

object FakeDataSource {
    val marsPhotos = listOf(
        MarsPhoto(
            id = "photo1",
            imgSrc = "https://cdn.pixabay.com/photo/2023/12/22/09/46/cotton-top-tamarin-8463471_640.jpg"
        ),
        MarsPhoto(
            id = "photo2",
            imgSrc = "https://cdn.pixabay.com/photo/2023/10/26/14/31/birds-of-prey-8342827_640.jpg"
        ),
    )
}