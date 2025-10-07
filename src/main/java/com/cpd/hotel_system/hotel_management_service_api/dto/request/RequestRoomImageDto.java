package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import org.springframework.web.multipart.MultipartFile;

public class RequestRoomImageDto {
    private MultipartFile file;
    private String roomId;
}
