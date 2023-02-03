import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { UserRegistrationService } from '../user-registration.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  student:Student=new Student(0,"","","");  
  message:any;

  constructor(private service:UserRegistrationService){ }

  ngOnInit(){
    
  }

  public registerNow(){
    let resp = this.service.getRegistration(this.student);
    resp.subscribe((data)=>this.message=data);
  }


}
