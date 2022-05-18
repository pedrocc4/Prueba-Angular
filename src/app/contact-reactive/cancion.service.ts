import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Cancion} from "./cancion";

@Injectable({
  providedIn: 'root'
})
export class CancionService {

  constructor(private http: HttpClient) { }

  public getCancion(): Observable<Cancion>{
    return this.http.get<Cancion>(`http://localhost:8080/api/cancion/1`);
  }

  public crearCancion(cancion: Cancion): Observable<Cancion>{
    return this.http.post<Cancion>(`http://localhost:8080/api/cancion`, cancion);
  }
}
