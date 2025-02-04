package org.example.help119.domain.help119.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class HospitalEntity (
    @Column(name = "code", nullable = false)
    var code : Long,

    @Column(name = "name", nullable = false)
    var name : String,

    @Column(name = "region", nullable = false)
    var region : String,

    @Column(name = "maxCapacity", nullable = false)
    var maxCapacity : Long,

    @Column(name = "telNumber", nullable = false)
    var telNumber : String,

    @Column(name = "currentCapacity", nullable = false)
    var currentCapacity : Long,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id = 0


    fun fullCapacity() {
        this.currentCapacity = this.maxCapacity
    }

    fun emptyCapacity() {
        this.currentCapacity = 0
    }

    fun changeCapacity(newCapacity : Long) {
        this.currentCapacity = newCapacity
    }
}