import { Component,OnInit } from '@angular/core';
import { UserRegistrationService } from '../user-registration.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private service:UserRegistrationService){}
  students:any;

  ngOnInit(){
    this.students = this.service.getUsers;
  }

}
