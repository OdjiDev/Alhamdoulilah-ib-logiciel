package com.odji.spring_back_end.controller;

import com.odji.spring_back_end.dto.AvarieDto;
import com.odji.spring_back_end.model.Avarie;
import com.odji.spring_back_end.model.Produit;
import com.odji.spring_back_end.repository.AvarieRepository;
import com.odji.spring_back_end.repository.ProduitRepository;
import com.odji.spring_back_end.services.AvarieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/avaries")
@RequiredArgsConstructor
public class AvarieController {

    private final AvarieService avarieService;

    private final AvarieRepository avarieRepository;
    private final ProduitRepository produitRepository;
//        @Autowired
//        public AvarieController(AvarieService avarieService) {
//            this.avarieService = avarieService;
//        }

    // **Create (POST):**
//    @PostMapping
//    public AvarieDto createAvarie(@RequestBody AvarieDto avarieDto) {
//        Avarie avarie = avarieService.dtoToAvarie(avarieDto);
//        Integer produitId = avarieDto.getProduitDto().getId();
//        Optional<Produit> existingProduitOptional = produitRepository.findById(produitId);
//        //verification de l'existence du produit
//        if (existingProduitOptional.isPresent()) {
//            //Si le produit est trouver affecter a l'avarie
//            avarie.setProduit(existingProduitOptional.get());
//        }
//        //enregidtrement du cas avarie dans la base
//        avarieDto = avarieService.avarieToDto(avarieRepository.save(avarie));
//        return avarieDto;
//    }
//
//    // **Read All (GET):**
//   @GetMapping
//    public List<AvarieDto> getAllAvaries() {
//        return avarieService.avariesDtoList(avarieRepository.findAll());
//    }


//
//     //**Read One (GET by ID):**
//    @GetMapping("/{id}")
//    public ResponseEntity<AvarieDto> getAvarieById(@PathVariable Integer id) {
//        Avarie avarie = avarieRepository.findAllById(id);
//        if (avarie == null) {
//            return ResponseEntity.notFound().build();
//        }
//        AvarieDto avarieDto = avarieService.avarieToDto(avarie);
//        return ResponseEntity.ok(avarieDto);
//
//        @GetMapping("/{id}")
//        public ResponseEntity<AvarieDto> getAvarieById(@PathVariable Integer id) {
//            Optional<Avarie> avarieOptional = avarieRepository.findById(id);
//            if (!avarieOptional.isPresent()) {
//                return ResponseEntity.notFound().build();
//            }
//            Avarie avarie = avarieOptional.get();  // Safe to access as we checked for presence
//            AvarieDto avarieDto = avarieService.avarieToDto(avarie);
//            return ResponseEntity.ok(avarieDto);
//        }
//
//
//
//
//    // **Update (PUT):**
//    @PutMapping("/{id}")
//    public ResponseEntity<AvarieDto> updateAvarie(@PathVariable Integer id, @RequestBody AvarieDto avarieDto) {
//        Optional<Avarie> updateAvarie = avarieRepository.findById(id);
//        if (updateAvarie == null) {
//            return ResponseEntity.notFound().build();
//        }
//
//        avarieDto.setId(id); // Ensure ID from path is used for update
//        Avarie updatedAvarie = avarieService.dtoToAvarie(avarieDto);
//        AvarieDto updatedAvarieDto = avarieService.avarieToDto(avarieRepository.save(updatedAvarie));
//        return ResponseEntity.ok(updatedAvarieDto);
//    }
//
//    // **Delete (DELETE):**
//    @DeleteMapping("/{id}")
//            public ResponseEntity<Void> deleteAvarie(@PathVariable Integer id) {
//            if (!avarieRepository.existsById(id)) {
//                return ResponseEntity.notFound().build();
//            }
//            avarieRepository.deleteById(id);
//            return ResponseEntity.noContent().build();
//        }
//
//
//


    }