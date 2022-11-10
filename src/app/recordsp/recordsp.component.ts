import { Component, OnInit } from '@angular/core';
import { PatientRegistrationService } from '../patient-registration.service';
@Component({
  selector: 'app-recordsp',
  templateUrl: './recordsp.component.html',
  styleUrls: ['./recordsp.component.css']
})

export class RecordspComponent implements OnInit {

id : any;
patients: any;

  constructor(private service : PatientRegistrationService) { }

  ngOnInit(): void {
    let resp = this.patients();
    resp.subscribe((data: any) => this.patients = data);

  }

  public deletePatients(id:number){
    let resp= this.service.deletePatients(id);
    resp.subscribe((data)=>this.patients=data);
   }
   
   public getPatientById(){
     let resp= this.service.getPatientById(this.id);
     resp.subscribe((data)=>this.patients=data);
    }

}
