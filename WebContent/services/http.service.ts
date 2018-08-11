import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

import 'rxjs/add/operator/timeout';
import 'rxjs/add/operator/toPromise';
@Injectable()

export class HttpService {
    private service:object;
    private localService:object;

    constructor(public http: Http) {
        this.service = {
            "getStudentListService":"/tutor/getStudentListService",
            "getPartnerService":"/tutor/getPartnerService",
            "getChaterService":"/tutor/getChaterService",
            "getContactService":"/tutor/getContactService",
            "getChatRecordService":"/tutor/getChatRecordService"
        };
        this.localService = {
            "getStudentListService":"assets/getStudentListService.json",
            "getPartnerService":"assets/getPartnerService.json",
            "getChaterService":"assets/getChaterService.json",
            "getContactService":"assets/getContactService.json",
            "getChatRecordService":"assets/getChatRecordService.json"
        };
    }

    httpRequest(service:string, sendData ?: object): Promise<any> {
        console.log(service);
        return this.http.post(this.service[service],JSON.stringify(sendData))
        // return this.http.get(this.localService[service],JSON.stringify(sendData))
            .timeout(60*1000)
            .toPromise()
            .then(response => response.json())
            .catch(this.handleError);
    }
    private handleError(error: any): Promise<any> {
        return Promise.reject(error.message || error);
    }
}