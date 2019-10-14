import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CityService {

  private baseUrl = '/api/v1/cities';

  constructor(private http: HttpClient) { }

  getCity(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }


  getCitiesList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}