import { Injectable } from '@angular/core';
import { Patient } from './patient';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class PatientRegistrationService {

    // injecting httpClient to acess the rest api
  constructor(private http : HttpClient) { 

  }

  public addPatients(patient : Patient){
    return this.http.post("http://localhost:8080/api/patient",patient,{responseType:'text' as 'json'});
  }

  public getPatients(){
    return this.http.get("http://localhost:8080/api/patient");
  }

  public getPatientById(id : number){
    return this.http.get("http://localhost:8080/api/patient/"+id);
  }

  public putPatients(patient : Patient){
    return this.http.put("http://localhost:8080/api/patient",patient,{responseType:'text' as 'json'});
  }

  public deletePatients(id : any){
    return this.http.delete("http://localhost:8080/api/patient/"+id)
  }
}
