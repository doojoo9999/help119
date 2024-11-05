package org.example.help119.domain.help119.dto.request

import org.example.help119.domain.help119.model.AmbulanceEntity
import java.time.LocalDateTime

data class AmbulanceRequest (
    val status: String,
    val area : String,
    val time : LocalDateTime
) {
    fun to(ambulanceEntity: AmbulanceEntity) = AmbulanceEntity(
        status = status,
        area = area,
        time = time
    )
}