import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './custom.validation';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {

  constructor() { }


  get Title()
  {
    return this.form.get('Title');

  }

  get imgUrl()
  {
    return this.form.get('imgUrl');
  }

  get desc()
  {
    return this.form.get('desc');
  }


  ngOnInit() {
  }
 form = new FormGroup(
   { 
     Title : new FormControl('',[Validators.required]),
     imgUrl : new FormControl('',[Validators.required]),
     desc : new FormControl('',[Validators.required])
   }
 )

 loginData(form: any)
 {
   console.log(form);
   
 }
}
