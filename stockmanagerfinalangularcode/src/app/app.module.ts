import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddproductsComponent } from './addproducts/addproducts.component';
import { UpdateproductsComponent } from './updateproducts/updateproducts.component';
import { SearchbynameComponent } from './searchbyname/searchbyname.component';
import { SearchbycategoryComponent } from './searchbycategory/searchbycategory.component';
import { SearchbycompamyComponent } from './searchbycompamy/searchbycompamy.component';
import { CartComponent } from './cart/cart.component';
import { HeaderComponent } from './header/header.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    AddproductsComponent,
    UpdateproductsComponent,
    SearchbynameComponent,
    SearchbycategoryComponent,
    SearchbycompamyComponent,
    CartComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
