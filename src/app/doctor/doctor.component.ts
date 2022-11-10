import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { DoctorRegistrationService } from '../doctor-registration.service';

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class DoctorComponent implements OnInit {

  //creating object, no need to pass values, we'll get values from the form that i want to populate in user obj
  public doctor : Doctor = new Doctor("",0 ,"","","","","","","");    //creating object, no need to pass values, we'll get values from the form that i want to populate in user obj
  message : any;

  constructor(private service : DoctorRegistrationService) { }

  ngOnInit(): void {
  }

  public doctorRegisterNow(){
    let resp = this.service.addDoctors(this.doctor)
    resp.subscribe((data : any) => this.message = data);
  }
}
