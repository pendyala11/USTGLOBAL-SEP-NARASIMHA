import { Component, OnInit } from '@angular/core';
import { AuthenticateService } from '../authenticate.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-updateproducts',
  templateUrl: './updateproducts.component.html',
  styleUrls: ['./updateproducts.component.css']
})
export class UpdateproductsComponent implements OnInit {

  constructor(private serv :AuthenticateService ,private router :Router) { }

  ngOnInit() {
  }

  modifyproduct(form :NgForm){
    this.serv.modProducts(form.value).subscribe(modify=>{
      console.log(modify);
      form.reset();
      sessionStorage.setItem('modify',JSON.stringify(modify));
    },err=>
    {
      alert('Product Not Modified ')
    });
  }



}
