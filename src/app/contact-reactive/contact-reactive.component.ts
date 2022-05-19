import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {AppComponent} from "../app.component";
import {MatDialog} from "@angular/material/dialog";
import {DialogoComponent} from "../dialogo/dialogo.component";

@Component({
  selector: 'app-contact-reactive',
  templateUrl: './contact-reactive.component.html',
  styleUrls: ['./contact-reactive.component.css']
})
export class ContactReactiveComponent implements OnInit {
  contactForm!: FormGroup;

  constructor(private readonly fb: FormBuilder,
              private app: AppComponent,
              public dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.contactForm = this.initForm();
  }

  onSubmit() {
    console.log(this.contactForm.value);
    this.app.onAddEmloyee(this.contactForm);
    this.contactForm.reset();
    this.dialog.open(DialogoComponent);
  }

  initForm(): FormGroup {
    return this.fb.group({
      nombre: ['', [Validators.required, Validators.minLength(5)]],
      duracion: ['', [Validators.required]]
      // ,
      // email: ['', [Validators.required, Validators.minLength(3), Validators.email]],
    })
  }
}
