import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ContactReactiveComponent} from './contact-reactive/contact-reactive.component';
import {ReactiveFormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatSelectModule} from "@angular/material/select";
import {MatSliderModule} from "@angular/material/slider";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatButtonToggleModule} from "@angular/material/button-toggle";
import {MatIconModule} from "@angular/material/icon";
import {MatDividerModule} from "@angular/material/divider";
import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {MatToolbarModule} from "@angular/material/toolbar";
import {CancionService} from "./contact-reactive/cancion.service";
import {HttpClientModule} from "@angular/common/http";
import {MatTabsModule} from "@angular/material/tabs";
import {HeaderComponent} from './header/header.component';
import {CancionesComponent} from './canciones/canciones.component';
import { DialogoComponent } from './dialogo/dialogo.component';

@NgModule({
  declarations: [
    AppComponent,
    ContactReactiveComponent,
    HeaderComponent,
    CancionesComponent,
    DialogoComponent
  ],
  entryComponents: [DialogoComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatSelectModule,
    MatSliderModule,
    MatDatepickerModule,
    MatButtonToggleModule,
    MatIconModule,
    MatDividerModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    NgbModule,
    MatToolbarModule,
    HttpClientModule,
    MatTabsModule
  ],
  providers: [CancionService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
