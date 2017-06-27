import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { UserService } from '../../providers/user-service';
import { UserPage } from '../user/user';

@IonicPage()
@Component({
  selector: 'page-users',
  templateUrl: 'users.html',
})
export class UsersPage {

  private users: Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams, public userService: UserService) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad UsersPage');
    this.userService.getUsers().subscribe(users => {this.users = users})
  }

  test(x){
    console.log(x);
    this.navCtrl.push(UserPage, {user: x})
  }

}
