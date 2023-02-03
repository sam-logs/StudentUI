import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { UserRegistrationService } from '../user-registration.service';



@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  students: any;
  student_id:any;
  studentToUpdate = {
    student_id: "",
    student_name: "",
    student_branch: "",
    student_email: ""
  }

  constructor(private service: UserRegistrationService) { 
    
  }

  public deleteUser(student_id: number) {
    let resp = this.service.deleteUser(student_id);
    resp.subscribe((data) => this.students = data);
  }

  public findUserById(student_id: number)  {
    let resp = this.service.getUserById(student_id);
    resp.subscribe((data) => this.students = data);
  }


  edit(student:any) {
    this.studentToUpdate = student;
    console.log(student);
  }

  updateStudent() {
    this.service.updateUser(this.studentToUpdate).subscribe(
      (resp) => {
        console.log(resp);
      },
      (err) => {
        console.log(err);
      }
    );
  }


  ngOnInit() {
    let response = this.service.getUsers();
    response.subscribe((data) => this.students = data);

  }



}
