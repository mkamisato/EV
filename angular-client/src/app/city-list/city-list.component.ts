import { Observable } from 'rxjs';
import { CityService } from './../city.service';
import { City } from './../city';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-city-list',
  templateUrl: './city-list.component.html',
  styleUrls: ['./city-list.component.css']
})
export class CityListComponent implements OnInit {

  cities: Observable<City[]>;

  constructor(private CityService: CityService) { }

  ngOnInit() {
     this.reloadData();
  }
  reloadData() {
    this.cities = this.CityService.getCitiesList();
  }

}
