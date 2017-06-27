import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { UserPage } from './user';
import { QRCodeModule } from 'angular2-qrcode';

@NgModule({
  declarations: [
    UserPage,
  ],
  imports: [
    IonicPageModule.forChild(UserPage),
    QRCodeModule,
  ],
  exports: [
    UserPage
  ]
})
export class UserPageModule {}
