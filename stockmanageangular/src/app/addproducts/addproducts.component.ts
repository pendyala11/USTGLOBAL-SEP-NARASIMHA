import { Component, OnInit } from '@angular/core';
import { AuthenticateService } from '../authenticate.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addproducts',
  templateUrl: './addproducts.component.html',
  styleUrls: ['./addproducts.component.css']
})
export class AddproductsComponent implements OnInit {

  constructor(private serv :AuthenticateService ,private router :Router) { }

  ngOnInit() {

     
  }

  add(form :NgForm)
  {
    this.serv.addProducts(form.value).subscribe(data=>{
      console.log(data);
      sessionStorage.setItem('product' ,JSON.stringify(data));
      form.reset();
    },err=>
    {
      alert('incorrect data')
    });
  }
}
