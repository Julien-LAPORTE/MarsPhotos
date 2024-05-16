package com.example.marsphotos.fake

import com.example.marsphotos.api.MarsApiService
import com.example.marsphotos.model.MarsPhoto

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> = FakeDataSource.marsPhotos
}