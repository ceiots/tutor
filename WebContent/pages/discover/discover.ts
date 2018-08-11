import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { HttpService } from '../../services/http.service';
import { ActivityPage } from '../activity/activity';

@Component({
  selector: 'page-discover',
  templateUrl: 'discover.html'
})
export class DiscoverPage {

  private partners = [];
  private startDate = new Date().toLocaleDateString();
  private endDate = new Date("2018-08-26").toLocaleDateString();
  constructor(
    public navCtrl: NavController,
    public httpService: HttpService
  ) {

  }

  ionViewDidLoad() {
    this.httpService.httpRequest('getPartnerService').then((res) => {
      if(res.status == "success") {
        this.partners = res.resultInfo.slice(0, 7);
      }
    });
  }

  goToActivity() {
    this.navCtrl.push(ActivityPage);
  }

}
