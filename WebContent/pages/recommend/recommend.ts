import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { DetailsPage } from '../details/details';
import { HttpService } from '../../services/http.service';

@Component({
  selector: 'page-recommend',
  templateUrl: 'recommend.html'
})
export class RecommendPage {
  constructor(
    public navCtrl: NavController,
    public httpService: HttpService
  ) {

  }

  ionViewDidLoad() {
    this.httpService.httpRequest('getStudentListService').then((res) => {
      if(res.status == "success") {
      }
    });
  }

  goToDetails(id) {
    this.navCtrl.push(DetailsPage);
  }

}
