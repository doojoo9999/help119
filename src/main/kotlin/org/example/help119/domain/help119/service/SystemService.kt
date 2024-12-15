package org.example.help119.domain.help119.service

import org.example.help119.domain.help119.dto.request.AmbulanceRequest
import org.example.help119.domain.help119.dto.response.AmbulanceResponse
import org.example.help119.domain.help119.model.AmbulanceEntity
import org.example.help119.domain.help119.repository.AmbulanceRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class SystemService (
    private val ambulanceRepository: AmbulanceRepository
){

    fun callBy119(ambulanceRequest : AmbulanceRequest){
        ambulanceRepository.save(
            AmbulanceEntity(
                status = ambulanceRequest.status,
                area = ambulanceRequest.area,
                time = ambulanceRequest.time
            )
        )
    }

    fun getCalledAmb(ambId:Long) : AmbulanceResponse {
        val amb = ambulanceRepository.findByIdOrNull(ambId) ?: throw IllegalStateException ("Amb Not Found")

        return AmbulanceResponse(
            status = amb.status,
            area = amb.area,
            time = amb.time
        )
    }

    fun getCalledAmbList() : List<AmbulanceResponse> {
        return ambulanceRepository.findAll().map {AmbulanceResponse(it.status,it.area, it.time)}
    }


}