import { Component, OnInit } from '@angular/core';
import { DoctorRegistrationService } from '../doctor-registration.service';

@Component({
  selector: 'app-recordsd',
  templateUrl: './recordsd.component.html',
  styleUrls: ['./recordsd.component.css']
})

export class RecordsdComponent implements OnInit {

  doctor : any;
  doctor_id : any;

  constructor( private service : DoctorRegistrationService) { }

  ngOnInit(): void {
    let resp = this.service.getDoctors();
    resp.subscribe((data) => this.doctor = data);

  }

  public deleteDoctors(doctor_id : number){
    let resp= this.service.deleteDoctors(doctor_id);
    resp.subscribe((data) => this.doctor = data);
   } 

   public findDoctorById(){
    let resp= this.service.getDoctorById(this.doctor_id);
    resp.subscribe((data) => this.doctor = data);
   }
}
