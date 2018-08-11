import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { HttpService } from '../../services/http.service';

@Component({
  selector: 'page-contacts',
  templateUrl: 'contacts.html'
})

export class ContactsPage {

  private contacts = [];
  constructor(
    public navCtrl: NavController,
    public httpService: HttpService
  ) { }

  ionViewDidLoad() {
    this.httpService.httpRequest('getContactService').then((res) => {
      this.contacts = res.resultInfo;
    });
  }

}
