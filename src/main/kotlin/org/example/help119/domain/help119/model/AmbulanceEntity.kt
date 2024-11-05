package org.example.help119.domain.help119.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class AmbulanceEntity (
    @Column (name = "status", nullable = false)
    var status : String,

    @Column (name = "area", nullable = false)
    var area : String,

    @Column (name = "time", nullable = false)
    var time : LocalDateTime
) {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    var id = 0
}