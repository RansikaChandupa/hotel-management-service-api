package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;

import java.util.List;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomPaginateResponseDto {
    private List<ResponseRoomDto> dataList;
    private long dataCount;
}
