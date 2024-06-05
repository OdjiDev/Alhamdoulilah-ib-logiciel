package com.odji.spring_back_end.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.odji.spring_back_end.model.Bureau;
import com.odji.spring_back_end.model.Departement;
import jakarta.persistence.Column;
import lombok.*;

import java.util.List;
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartementDto {
    private Integer id;

    private String nom;

    @JsonIgnore
    private List<BureauDto> bureauDto;


}
