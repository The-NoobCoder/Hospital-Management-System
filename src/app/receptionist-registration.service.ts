import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Receptionist } from './receptionist';

@Injectable({
  providedIn: 'root'
})

export class ReceptionistRegistrationService {

    // injecting httpClient to acess the rest api
    constructor(private http : HttpClient) { 

    }

     public addReceptionists(receptionist : Receptionist){
    return this.http.post("http://localhost:8080/api/receptionist/receptionist",receptionist,{responseType:'text' as 'json'});
  }

  public getReceptionists(){
    return this.http.get("http://localhost:8080/api/receptionist/receptionist/");
  }

  public getReceptionistById(receptionist_id : number){
    return this.http.get("http://localhost:8080/api/receptionist/receptionist/"+receptionist_id);
  }

  public putReceptionists(receptionist : Receptionist){
    return this.http.put("http://localhost:8080/api/receptionist/receptionist",receptionist,{responseType:'text' as 'json'});
  }

  public deleteReceptionists(receptionist_id : any){
    return this.http.delete("http://localhost:8080/api/receptionist/receptionist/"+receptionist_id)
  }
}
