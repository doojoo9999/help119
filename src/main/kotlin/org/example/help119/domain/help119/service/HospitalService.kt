package org.example.help119.domain.help119.service

import org.example.help119.domain.help119.dto.request.FullCapacityRequest
import org.example.help119.domain.help119.dto.request.GetHospitalRequest
import org.example.help119.domain.help119.dto.request.HospitalRequest
import org.example.help119.domain.help119.dto.request.UpdateCapacityRequest
import org.example.help119.domain.help119.dto.response.HospitalResponse
import org.example.help119.domain.help119.model.HospitalEntity
import org.example.help119.domain.help119.repository.HospitalRepository
import org.springframework.data.repository.findByIdOrNull

class HospitalService(
    private val hospitalRepository: HospitalRepository
) {

    fun enrollHospital(request: HospitalRequest) {
        val telNumberCheck = hospitalRepository.findByTelNumber(request.hospitalTelNumber)

        if (telNumberCheck == null) {
            throw IllegalStateException("이미 등록된 전화번호입니다.")
        }

        val newHospital = HospitalEntity(
            code = request.hospitalCode,
            name = request.hospitalName,
            region = request.hospitalRegion,
            maxCapacity = request.maxCapacity,
            telNumber = request.hospitalTelNumber,
            currentCapacity = 0
        )

        hospitalRepository.save(newHospital)

    }

    fun getHospital(request: GetHospitalRequest) : HospitalResponse  {

        val hospitalCheck = hospitalRepository.findByName(request.hospitalName)

        val response = HospitalResponse(
        hospitalCheck.code,
        hospitalCheck.currentCapacity,
        hospitalCheck.maxCapacity
        )

        return response

    }

    fun updateCapacity(request : UpdateCapacityRequest) {

        val hospitalCheck = hospitalRepository.findByIdOrNull(request.id) ?: throw IllegalStateException("id not found")

        hospitalCheck.changeCapacity(request.nowCapacity)

    }

    fun fullCapacity(request : FullCapacityRequest) {

        val hospitalCheck = hospitalRepository.findByIdOrNull(request.hospitalId) ?: throw IllegalStateException("id not found")

        hospitalCheck.fullCapacity()

    }

}