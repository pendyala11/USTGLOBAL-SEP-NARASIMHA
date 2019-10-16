import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  search: any;
  searchMovies: any;
  constructor(public http: HttpClient) {

   }

  ngOnInit() {
  }
  cFun(event) {
    console.log(event.target.value)
    this.http.get<any>('http://www.omdbapi.com/?apikey=9ed0ea01&s='+event.target.value).subscribe(data => {
    this.searchMovies = data.Search;
    console.log(data);
    }, err => {
        console.log(err);
    }, () => {
        console.log('Got Successfuly');
    });

  }
}
