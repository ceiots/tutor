import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

@Component({
    selector: 'page-details',
    templateUrl: 'details.html'
})

export class DetailsPage {
    private item = {"id": "", "pic": "./assets/imgs/jay.jpg", "name": "Jay", "university": "北京理工大学珠海学院", "college": "计算机学院", "profession": "软件工程", "grade": 620.5, subjects: [{name: "语文", grade: 120},{name: "数学", grade: 120},{name: "英语", grade: 120},{name: "理综", grade: 260.5}]};
    
    constructor(
        public navCtrl: NavController
    ) { }
}