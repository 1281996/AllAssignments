import { Component } from '@angular/core';

	@Component({
    selector: 'app-root',
  	  templateUrl: './app.component.html',
  	  styleUrls: ['./app.component.css']
  })
  	export class AppComponent {
    title = 'Hello World of TypeScript!';
  	
    firstName = "Aaiswariya";
  	  lastName = "Pattnaik";
  
    location : Address = {
  	    "street" : "BEML Layout",
	    "city" : "Bengaluru"
    };
  	
	}	
  	class Address {
  	  street : string;
  	  city : string;
  }
  
  