import { UserService } from './../../services/user/user.service';
import { Component, OnInit } from '@angular/core';

// import { Router } from '@angular/router';
@Component({
  selector: 'app-page-login',
  templateUrl: './page-login.component.html',
  styleUrls: ['./page-login.component.css']
})
export class PageLoginComponent implements OnInit {
//authenticationRequest:AuthenticationRequest={};

  constructor(
    private userService:UserService
  ) { }


  ngOnInit(): void {
  }
  // login(){
  //   this.userService.login(this.authenticationRequest);
  // }

}
