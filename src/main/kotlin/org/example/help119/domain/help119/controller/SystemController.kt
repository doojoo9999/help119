package org.example.help119.domain.help119.controller

import org.example.help119.domain.help119.dto.request.AmbulanceRequest
import org.example.help119.domain.help119.service.SystemService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/119")
@RestController
class SystemController(
    private val systemService: SystemService,
    service: SystemService
) {

    fun callByAmbulance(
        ambulanceRequest: AmbulanceRequest
    ): ResponseEntity<Unit> {

        systemService.callBy119(ambulanceRequest)

        return ResponseEntity
            .status(HttpStatus.OK)
            .build()
    }

    


}