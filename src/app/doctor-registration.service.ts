import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Doctor } from './doctor';

@Injectable({
  providedIn: 'root'
})

export class DoctorRegistrationService {

      // injecting httpClient to acess the rest api
  constructor(private  http : HttpClient) { 
    
  }

  public addDoctors(doctor : Doctor){
    return this.http.post("http://localhost:8080/api/doctor/doctor",doctor,{responseType:'text' as 'json'});
  }

  public getDoctors(){
    return this.http.get("http://localhost:8080/api/doctor/doctor");
  }

  public getDoctorById(doctor_id : number){
    return this.http.get("http://localhost:8080/api/doctor/doctor/"+doctor_id);
  }

  public putDoctors(doctor : Doctor){
    return this.http.put("http://localhost:8080/api/doctor/doctor",doctor,{responseType:'text' as 'json'});
  }

  public deleteDoctors(doctor_id : any){
    return this.http.delete("http://localhost:8080/api/doctor/doctor/"+doctor_id)
  }
}
