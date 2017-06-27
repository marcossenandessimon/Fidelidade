import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { UsersPage } from './users';
import { UserService } from '../../providers/user-service';

@NgModule({
  declarations: [
    UsersPage,
  ],
  imports: [
    IonicPageModule.forChild(UsersPage),
  ],
  exports: [
    UsersPage
  ],
  providers: [
    UserService
  ]
})
export class UsersPageModule {}
