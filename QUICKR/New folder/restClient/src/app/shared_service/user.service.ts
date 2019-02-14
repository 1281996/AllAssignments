import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, from} from 'rxjs';
import {product} from '../product';


@Injectable({
  providedIn: 'root'
})

export class UserService {

  private baseUrl = 'http://localhost:5005/product/homepage';
 
  constructor(private http: HttpClient) { }
 
  getCustomer(): Observable<object> {
      return this.http.get(`${this.baseUrl}/products`);

  }
 
  // createCustomer(customer: Object): Observable<Object> {
  //   return this.http.post(`${this.baseUrl}` + `/create`, customer);
  // }
 
  // updateCustomer(id: number, value: any): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}/${id}`, value);
  // }
 
  // deleteCustomer(id: number): Observable<any> {
  //   return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  // }
 

}
