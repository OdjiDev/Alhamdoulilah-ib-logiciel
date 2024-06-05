package com.odji.spring_back_end.services;

import com.odji.spring_back_end.dto.DemandeDto;
import com.odji.spring_back_end.dto.DepartementDto;
import com.odji.spring_back_end.model.Demande;
import com.odji.spring_back_end.model.Departement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartementService {

    public DepartementDto departementDtoToDto(Departement departement) {
        if (departement == null) {
            return null;
        }

        DepartementDto departementDto = new DepartementDto();
        departementDto.setId(departementDto.getId());
        departementDto.setNom(departementDto.getNom());
        return departementDto;
    }
    public Departement dtoToDepartement (DepartementDto departementDto) {
        if (departementDto== null) {
            return null;
        }

        Departement departement= new Departement();
        departementDto.setId(departementDto.getId());
        departementDto.setNom(departementDto.getNom());
        return departement;
    }

}
