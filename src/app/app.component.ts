import {Component, OnInit} from '@angular/core';
import {Cancion} from "./contact-reactive/cancion";
import {HttpErrorResponse} from "@angular/common/http";
import {CancionService} from "./contact-reactive/cancion.service";
import {FormGroup} from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public cancion!: Cancion;
  public canciones!: Cancion[];

  constructor(private cancionService: CancionService) {
  }

  public getCancion(): void {
    this.cancionService.getCancion(1).subscribe(
      (response: Cancion) => {
        this.cancion = response;
      },
      (error: HttpErrorResponse) => {
        console.error(error);
      }
    );
  }
  public getCanciones(): void {
    this.cancionService.getCanciones().subscribe(
      (response: Cancion[]) => {
        this.canciones = response;
        console.log(this.canciones);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
  public onAddEmloyee(form: FormGroup): void {
    console.log(form);
    this.cancionService.crearCancion(form.value).subscribe(
      (response: Cancion) => {
        console.log(response);
        //this.getEmployees();
        //addForm.reset();
      },
      (error: HttpErrorResponse) => {
        console.log(error.message);
        //addForm.reset();
      }
    );
  }

  ngOnInit(): void {
    this.getCanciones();
  }
}
