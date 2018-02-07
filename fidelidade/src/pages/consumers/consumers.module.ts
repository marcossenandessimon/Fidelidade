import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ConsumersPage } from './consumers';

@NgModule({
  declarations: [
    ConsumersPage,
  ],
  imports: [
    IonicPageModule.forChild(ConsumersPage),
  ],
  exports: [
    ConsumersPage
  ]
})
export class ConsumersPageModule {}
