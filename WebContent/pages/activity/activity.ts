import { Component } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { NavController } from 'ionic-angular';

import { HttpService } from '../../services/http.service';

@Component({
  selector: 'page-activity',
  templateUrl: 'activity.html'
})

export class ActivityPage {

  private partners = [];
  constructor(
    public sanitizer: DomSanitizer,
    public navCtrl: NavController,
    public httpService: HttpService
  ) { }

  ionViewDidLoad() {
    this.httpService.httpRequest('getPartnerService').then((res) => {
      if(res.status == "success") {
        this.partners = res.resultInfo;
        for(let i = 0;i < this.partners.length; i++) {
          this.partners[i].pic = this.sanitizer.bypassSecurityTrustStyle('url(' + this.partners[i].pic + ')');
        }
      }
    });
  }

}
