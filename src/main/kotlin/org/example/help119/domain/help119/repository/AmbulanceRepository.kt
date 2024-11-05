package org.example.help119.domain.help119.repository

import org.example.help119.domain.help119.model.AmbulanceEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AmbulanceRepository : JpaRepository<AmbulanceEntity, Long> {



}