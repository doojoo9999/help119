package org.example.help119.domain.help119.dto.response

data class HospitalResponse (
    val hospitalCode : Long,
    val currentCapacity : Long,
    val maxCapacity : Long,
)