package com.urbantrans.model.dto.image;

import com.urbantrans.model.dto.BillDTO;
import com.urbantrans.model.image.UserImage;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserImageDTO {
    private List<UserImage> currentRides;
    private List<BillDTO> previousRides;
    private Integer ridesCount;
}
