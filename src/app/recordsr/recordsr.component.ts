import { Component, OnInit } from '@angular/core';
import { ReceptionistRegistrationService } from '../receptionist-registration.service';

@Component({
  selector: 'app-recordsr',
  templateUrl: './recordsr.component.html',
  styleUrls: ['./recordsr.component.css']
})
export class RecordsrComponent implements OnInit {

receptionist : any ;
receptionist_id : any ;

  constructor(private service : ReceptionistRegistrationService) { }

  ngOnInit(): void {
    let resp = this.service.getReceptionists();
    resp.subscribe((data) => this.receptionist = data);
  }

  public deleteReceptionists(id:number){
    let resp= this.service.deleteReceptionists(this.receptionist_id);
    resp.subscribe((data)=>this.receptionist=data);
   }
   
   public getReceptionistById(){
     let resp= this.service.getReceptionistById(this.receptionist_id);
     resp.subscribe((data)=>this.receptionist=data);
    }

}
