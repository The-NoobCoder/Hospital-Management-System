import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { PatientRegistrationService } from '../patient-registration.service';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent implements OnInit {

  //creating object, no need to pass values, we'll get values from the form that i want to populate in user obj
  public patient : Patient = new Patient("","","","","","","","","" ,"" );    //creating object, no need to pass values, we'll get values from the form that i want to populate in user obj
  message : any;

  constructor(private service : PatientRegistrationService) { }

  ngOnInit(): void {
  }

  public registerNow(){
    let resp = this.service.addPatients(this.patient)
    resp.subscribe((data : any) => this.message = data);
  }

}
