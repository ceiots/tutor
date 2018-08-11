import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { ContactsPage } from '../contacts/contacts';
import { ChatPage } from '../chat/chat';

import { HttpService } from '../../services/http.service';

@Component({
  selector: 'page-news',
  templateUrl: 'news.html'
})

export class NewsPage {

  private chaters = [];
  constructor(
    public navCtrl: NavController,
    public httpService: HttpService
  ) { }

  ionViewDidLoad() {
    this.httpService.httpRequest('getChaterService').then((res) => {
      this.chaters = res.resultInfo;
    });
  }

  goToContacts() {
    this.navCtrl.push(ContactsPage);
  }

  goToChat() {
    this.navCtrl.push(ChatPage);
  }

}
