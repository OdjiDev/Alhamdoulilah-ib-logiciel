
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ProduitDto } from '../produit-dto';


@Injectable({
  providedIn: 'root'
})
export class ProduitService {

  
constructor(private http: HttpClient) { }

getProducts(): Observable<ProduitDto[]> {
  return this.http.get<ProduitDto[]>('http://localhost:8080/produits/list');
}
}











    // getEmployees(){

    //   this.httpClient.get<any>('${this.baseurl}')
    //     .subscribe(
    //       response =>{ console.log(response);
    //     this.freinds = Response;

  //   getDemandeById(id: number): Observable<DemandeDto> {
  //     return this.http.get<DemandeDto>(`${this.baseUrl}/${id}`);
  //   }

  //   addDemande(demande: DemandeDto): Observable<DemandeDto> {
  //     return this.http.post<DemandeDto>(`${this.baseUrl}`, demande);
  //   }

  //   updateDemande(id: number, demande: DemandeDto): Observable<DemandeDto> {
  //     return this.http.put<DemandeDto>(`${this.baseUrl}/${id}`, demande);
  //   }

  //   deleteDemande(id: number): Observable<any> {
  //     return this.http.delete(`${this.baseUrl}/${id}`);
  //   }
  // }



