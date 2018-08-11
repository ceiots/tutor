import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { HttpService } from '../../services/http.service';

@Component({
  selector: 'page-upload',
  templateUrl: 'upload.html'
})

export class UploadPage {

  private chaters = [];
  constructor(
    public navCtrl: NavController,
    public httpService: HttpService
  ) { }

  ionViewDidLoad() {}
  
}
