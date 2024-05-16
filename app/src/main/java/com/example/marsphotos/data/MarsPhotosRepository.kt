package com.example.marsphotos.data

import com.example.marsphotos.api.MarsApiService
import com.example.marsphotos.model.MarsPhoto

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {

    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()

}