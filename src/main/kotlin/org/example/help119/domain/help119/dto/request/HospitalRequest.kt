package org.example.help119.domain.help119.dto.request

data class HospitalRequest (
    val hospitalCode : Long,
    val hospitalName : String,
    val hospitalRegion : String,
    val maxCapacity : Long,
) {
}