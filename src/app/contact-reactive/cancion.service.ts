import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Cancion} from "./cancion";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})

export class CancionService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) {
  }

  public getCancion(id: number): Observable<Cancion> {
    return this.http.get<Cancion>(`${this.apiServerUrl}/api/cancion/${id}`);
  }

  public getCanciones(): Observable<Cancion[]> {
    return this.http.get<Cancion[]>(`${this.apiServerUrl}/api/canciones/`);
  }

  public crearCancion(cancion: Cancion): Observable<Cancion> {
    console.log(cancion.nombre, cancion.duracion);
    return this.http.post<Cancion>(`${this.apiServerUrl}/api/cancion`, cancion);
  }
}
