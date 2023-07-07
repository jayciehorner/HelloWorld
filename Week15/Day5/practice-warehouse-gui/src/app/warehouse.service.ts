import { Injectable } from '@angular/core';
import { Warehouse } from './warehouse';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WarehouseService {
url: string = "http://localhost:8080/warehouse"
  constructor(private httpClient: HttpClient) { }

  save(warehouse: Warehouse): Observable<Warehouse>{
    return this.httpClient.post<Warehouse>(this.url, warehouse);
  }
}
