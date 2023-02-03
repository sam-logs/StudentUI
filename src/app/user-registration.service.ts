import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class UserRegistrationService {

  constructor(private http: HttpClient) { }

  public getRegistration(student: Student) {
    return this.http.post("http://localhost:8080/save", student, { responseType: 'text' as 'json' });

  }

  public getUsers() {
    return this.http.get("http://localhost:8080/getAllUsers");
  }

  public getUserById(student_id: number) {
    return this.http.get("http://localhost:8080/findUser/" + student_id,{responseType: 'json'});
  }

  public deleteUser(student_id: number) {
    return this.http.delete("http://localhost:8080/delete/" + student_id);
  }

  public updateUser(student: Student) {
    return this.http.put("http://localhost:8080/update/" +student.student_id,student, { responseType: 'text' as 'json' });
  }
}
