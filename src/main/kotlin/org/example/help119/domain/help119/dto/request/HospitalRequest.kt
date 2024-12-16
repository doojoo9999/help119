package org.example.help119.domain.help119.dto.request

data class HospitalRequest (
    val hospitalCode : Long, // 1차병원 2차병원 등
    val hospitalName : String,
    val hospitalRegion : String,
    val hospitalTelNumber : String,
    val maxCapacity : Long,
) {
}