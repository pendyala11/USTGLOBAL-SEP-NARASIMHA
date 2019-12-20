import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddproductsComponent } from './addproducts/addproducts.component';
import { UpdateproductsComponent } from './updateproducts/updateproducts.component';
import { SearchbycompamyComponent } from './searchbycompamy/searchbycompamy.component';
import { SearchbycategoryComponent } from './searchbycategory/searchbycategory.component';
import { SearchbynameComponent } from './searchbyname/searchbyname.component';


const routes: Routes = [
  { path : 'addproduct' , component :AddproductsComponent},
  {path :'updateproduct',component: UpdateproductsComponent},
  {path:'searchbycompany',component:SearchbycompamyComponent},
  {path:'searchbycategory',component:SearchbycategoryComponent},
  {path:'searchbyname',component:SearchbynameComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
