import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { DetailsPage } from '../details/details';
import { HttpService } from '../../services/http.service';

@Component({
  selector: 'page-compass',
  templateUrl: 'compass.html'
})
export class CompassPage {

  private stuItems: any;
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

}
