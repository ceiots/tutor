import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

import { HttpService } from '../../services/http.service';

@Component({
  selector: 'page-chat',
  templateUrl: 'chat.html'
})

export class ChatPage {

  private websocket: any;
  private user = {
    id: "13631219446",
    name: "Jay",
    pic: "./assets/imgs/jay.jpg"
  };
  private toUser = {
    id: "13631219446",
    name: "Zard",
    pic: "./assets/imgs/zard.jpg"
  };
  private records = [];
  constructor(
    public navCtrl: NavController,
    public httpService: HttpService
  ) {
    this.websocket = new WebSocket('ws://localhost:8080/tutor/websocket/13129550191/15626550191');
  }

  ionViewDidLoad() {
    this.httpService.httpRequest('getChatRecordService').then((res) => {
      if(res.status == "success") {
        this.records = res.resultInfo;
      }
    })
  }

  sendMsg() {
    let data = document.getElementsByTagName('textarea')[0].value;
    this.websocket.send(data);
  }

}
