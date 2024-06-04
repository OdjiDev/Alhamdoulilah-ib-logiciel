import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(
   // private authenticationService: AuthenticationService,
    private router :Router
  ) { }



  /*login(authenticationRequest: AuthenticationRequest) {

    return this.authenticationService.authenticate(authenticationRequest)
      .subscribe(data)=>{
        localStorage.setItem('autenticationResponse',JSON.stringify(data));
      }
      console.error=>{
        console.log(Error);
        this.router.navigate(['inscrire']);
      }

  }
  */
}
