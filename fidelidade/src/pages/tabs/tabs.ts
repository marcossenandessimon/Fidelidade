import { Component } from '@angular/core';

import { AboutPage } from '../about/about';
import { ContactPage } from '../contact/contact';
import { HomePage } from '../home/home';
import { UsersPage } from '../users/users';
import { ConsumersPage } from '../consumers/consumers';
import { StoresPage } from '../stores/stores';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {

  tab1Root = HomePage;
  tab2Root = UsersPage;
  tab3Root = AboutPage;
  tab4Root = ContactPage;
  tab5Root = ConsumersPage;
  tab6Root = StoresPage;

  constructor() {

  }
}
