import { Component, OnInit } from '@angular/core';


import{UserService} from '../../shared_service/user.service';


@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {

public products:any;

 
  constructor(private userService: UserService) { }
 
 ngOnInit() {
   this.userService.getCustomer().subscribe((products)=>{
     this.products=products;
    console.log(this.products);
   },(error)=>{
        console.log(error)
   })
  }
}


