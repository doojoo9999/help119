package org.example.help119.domain.help119.repository

import org.example.help119.domain.help119.model.HospitalEntity
import org.springframework.data.jpa.repository.JpaRepository

interface HospitalRepository : JpaRepository<HospitalEntity, Long> {
}