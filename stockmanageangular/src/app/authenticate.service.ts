import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthenticateService {

  constructor( private http: HttpClient,private router :Router,private serv :AuthenticateService) { }

    addProducts(user): Observable<any>{
      return  this.http.post(`http://localhost:8080/addP`,user);
    }

    modProducts(user): Observable<any>{
      return this.http.post(`http://localhost:8080/updateP`,user);
    }
     
    searchProdbyname(user) :Observable<any>
    {
      return this.http.get(`http://localhost:8080/getPName/${user.name}`,user);
    }
}
