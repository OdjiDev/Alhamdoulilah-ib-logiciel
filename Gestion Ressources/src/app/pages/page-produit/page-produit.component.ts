import { ProduitService } from './services/produit.service';
import { Component, OnInit } from '@angular/core';
import { ProduitDto } from './produit-dto';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-page-produit',
  templateUrl: './page-produit.component.html',
  styleUrls: ['./page-produit.component.css']
})
export class PageProduitComponent implements OnInit {
onCreateProduit() {
throw new Error('Method not implemented.');
}
onDelete(arg0: number) {
throw new Error('Method not implemented.');
}
onEdit(arg0: number) {
throw new Error('Method not implemented.');
}
onDetails(_t15: ProduitDto) {
throw new Error('Method not implemented.');
}

produits: ProduitDto[] = [];

constructor(private produitService: ProduitService) { }

ngOnInit(): void {
  this.getProducts();
}

getProducts(): void {
  this.produitService.getProducts()
    .subscribe(produits  => this.produits = produits);
}
}
