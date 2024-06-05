package com.odji.spring_back_end.controller;

import com.odji.spring_back_end.dto.ProduitDto;
import com.odji.spring_back_end.exeption.ResourceNotFoundException;
import com.odji.spring_back_end.model.Produit;
import com.odji.spring_back_end.repository.CategorieRepository;
import com.odji.spring_back_end.repository.MagasinRepository;
import com.odji.spring_back_end.repository.ProduitRepository;
import com.odji.spring_back_end.services.CategorieService;
import com.odji.spring_back_end.services.MagasinService;
import com.odji.spring_back_end.services.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequiredArgsConstructor
@RequestMapping("produits")
    public class ProduitController {

    //public class ProduitController {

//        private final ProduitRepository produitRepository;
//        @Autowired
//        private final ProduitService produitService;
//
//        public ProduitController(ProduitRepository produitRepository, ProduitService produitDtoService) {
//            this.produitRepository = produitRepository;
//            this.produitService = produitDtoService;
//        }
//appel des repository
            private final ProduitRepository produitRepository;
            @Autowired
            private  final ProduitService produitService;

             @GetMapping("/list")
            // Replace placeholders with your actual logic for data access using DTOs
            public List<ProduitDto> getAllProduits() {
                List<Produit> produits = produitRepository.findAll(); // Assuming you have a JPA repository named 'produitRepository'
                return produitService.produitDtoList(produitRepository.findAll()); // Convert products to DTOs
            }
//

    @GetMapping("{id}")
    public ResponseEntity<ProduitDto> getDProduitById(@PathVariable  Integer id){
        Produit produit = produitRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produit not exist with id:" + id));
        return ResponseEntity.ok(produitService.produitToDto(produit));
    }

    // build update Produit REST API
    @PutMapping("{id}")
    public ResponseEntity<ProduitDto> updateProduit(@PathVariable Integer id,@RequestBody ProduitDto produitDetailsDto) {
        Produit updateProduit = produitRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("produit not exist with id: " + id));
       // updateProduit = produitService.dtoToProduit(ProduitDetailsDto);
        updateProduit.setId(id);
      //  ProduitDetailsDto.setId(id);

        produitDetailsDto= produitService.produitToDto(produitRepository.save(updateProduit));

        return ResponseEntity.ok(produitDetailsDto);
    }





//            public ProduitDto getProduitById(Integer id) {
//                Produit produit = produitRepository.findById(id)
//                        .orElseThrow(() -> new ProduitNotFoundException(id));
//                return produitToDto(produit);
//            }
//    public List<ProduitDto> getAllIproduitsById(@PathVariable Integer id){
//        return produitService.produitDtoList(produitRepository.findById(id));;
//    }

//            public ProduitDto createProduit(ProduitDto produitDto) {
//                Produit produit = dtoToProduit(produitDto);
//                produit = produitRepository.save(produit);
//                return produitToDto(produit);
//            }
//
//            public ProduitDto updateProduit(Long id, ProduitDto produitDto) {
//                Produit existingProduit = produitRepository.findById(id)
//                        .orElseThrow(() -> new ProduitNotFoundException(id));
//                dtoToProduit(produitDto, existingProduit); // Update existingProduit with data from produitDto
//                produitRepository.save(existingProduit); // Save updated product
//                return produitToDto(existingProduit); // Return updated product as DTO
//            }
//
//            public void deleteProduit(Long id) {
//                produitRepository.deleteById(id);
//            }
//        }


}
