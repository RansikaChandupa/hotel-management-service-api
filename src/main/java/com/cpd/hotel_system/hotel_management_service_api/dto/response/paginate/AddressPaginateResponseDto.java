package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseAddressDto;

import java.util.List;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressPaginateResponseDto {
    private List<ResponseAddressDto> dataList;
    private long dataCount;
}
