package org.example.help119.domain.help119.dto.response

import java.time.LocalDateTime

data class AmbulanceResponse (
    val status: String,
    val area : String,
    val time : LocalDateTime
)
