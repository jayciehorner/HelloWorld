import { Injectable, Optional } from '@angular/core';
import { Barbeque } from './barbeque';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BarbequeService {

  url: string = "http://localhost:8080/barbeque" // TODO put this in an environment file

  constructor(private httpClient: HttpClient) { }

  findAll(): Observable<Barbeque[]> {
    return this.httpClient.get<Barbeque[]>(this.url);
   }

  save(data: Barbeque): Observable<Barbeque> {
return  this.httpClient.post<Barbeque>(this.url, data); // return the item created because I don't know what ID it will choose -- need to have ID field
  }
}