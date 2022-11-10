import { Component, OnInit } from '@angular/core';
import { Receptionist } from '../receptionist';
import { ReceptionistRegistrationService } from '../receptionist-registration.service';

@Component({
  selector: 'app-receptionist',
  templateUrl: './receptionist.component.html',
  styleUrls: ['./receptionist.component.css']
})
export class ReceptionistComponent implements OnInit {

  //creating object, no need to pass values, we'll get values from the form that i want to populate in user obj
  public receptionist : Receptionist = new Receptionist("",0,"","","","","","","" ,"","" );    //creating object, no need to pass values, we'll get values from the form that i want to populate in user obj
  message : any;

  constructor( private service : ReceptionistRegistrationService) { }

  ngOnInit(): void {
  }

  public receptionistRegisterNow(){
    let resp = this.service.addReceptionists(this.receptionist)
    resp.subscribe((data : any) => this.message = data);
  }
}
