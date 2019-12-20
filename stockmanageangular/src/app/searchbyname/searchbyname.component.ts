import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthenticateService } from '../authenticate.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchbyname',
  templateUrl: './searchbyname.component.html',
  styleUrls: ['./searchbyname.component.css']
})
export class SearchbynameComponent implements OnInit {
  getprodByName;
  constructor(private http: HttpClient, private auth: AuthenticateService, private router: Router) { }

  ngOnInit() {
    this.getprodByName =JSON.parse(sessionStorage.getItem('data'))
  }
   

  searchprodById(form : NgForm)
  {
    this.auth.searchProdbyname(form.value).subscribe(name=>
      {
        console.log(name);
        form.reset();
        sessionStorage.setItem('name',JSON.stringify(name));
      },err=>
      {
        alert('product name not found');
      });
  }
}
