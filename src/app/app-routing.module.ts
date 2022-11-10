import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DoctorComponent } from './doctor/doctor.component';
import { PatientComponent } from './patient/patient.component';
import { ReceptionistComponent } from './receptionist/receptionist.component';
import { RecordsdComponent } from './recordsd/recordsd.component';
import { RecordspComponent } from './recordsp/recordsp.component';
import { RecordsrComponent } from './recordsr/recordsr.component';

const routes: Routes = [
  {path : "", redirectTo : "patient", pathMatch : "full"},
  {path : "", redirectTo : "doctor", pathMatch : "full"},
  {path : "", redirectTo : "receptionist", pathMatch : "full"},
  {path : "patient", component : PatientComponent},
  {path : "doctor", component : DoctorComponent},
  {path : "receptionist", component : ReceptionistComponent},
  {path : "recordsp", component : RecordspComponent},
  {path : "recordsd", component : RecordsdComponent},
  {path : "recordsr", component : RecordsrComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
