package com.automacorp.model

class RoomDto {

    data class RoomDto(
        val id: Long,
        val name: String,
        val currentTemperature: Double?,
        val targetTemperature: Double?,
        val windows: List<WindowDto>
    )
}