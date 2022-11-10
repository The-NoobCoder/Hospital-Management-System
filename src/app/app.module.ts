import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientRegistrationService } from './patient-registration.service';
import { PatientComponent } from './patient/patient.component';
import { SearchDeleteComponent } from './search-delete/search-delete.component';
import { DoctorComponent } from './doctor/doctor.component';
import { ReceptionistComponent } from './receptionist/receptionist.component';
import { DoctorRegistrationService } from './doctor-registration.service';
import { ReceptionistRegistrationService } from './receptionist-registration.service';
import { RecordspComponent } from './recordsp/recordsp.component';
import { RecordsdComponent } from './recordsd/recordsd.component';
import { RecordsrComponent } from './recordsr/recordsr.component';

@NgModule({
  declarations: [
    AppComponent,
    PatientComponent,
    SearchDeleteComponent,
    DoctorComponent,
    ReceptionistComponent,
    RecordspComponent,
    RecordsdComponent,
    RecordsrComponent
  ],
  
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, //inserting for RestAPI, import package above
    FormsModule // to insert html forms
    ],

  providers: [PatientRegistrationService, DoctorRegistrationService, ReceptionistRegistrationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
