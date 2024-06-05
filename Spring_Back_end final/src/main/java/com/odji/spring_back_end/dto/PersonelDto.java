package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Magasin;
import com.odji.spring_back_end.model.Personel;
import jakarta.persistence.Column;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonelDto {

    private Integer id;

    private String first_Name;

    private String last_Name;

    private String email;

}
