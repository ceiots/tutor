import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { DetailsPage } from '../details/details';
import { HttpService } from '../../services/http.service';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  stuItems: any;

  constructor(
    public navCtrl: NavController,
    public httpService: HttpService
  ) {

  }

  ionViewDidLoad() {
    this.httpService.httpRequest('getStudentListService').then((res) => {
      if(res.status == "success") {
        this.stuItems = res.resultInfo;
      }
    });
  }

  goToDetails(id) {
    this.navCtrl.push(DetailsPage);
  }

  doInfinite(infiniteScroll) {
    this.httpService.httpRequest('getStudentListService').then((res) => {
      if(res.status == "success") {
        for(var i = 0;i < res.resultInfo.length; i++) {
          this.stuItems.push(res.resultInfo[i]);
        }
      }
      infiniteScroll.complete();
    });
  }
  
}
