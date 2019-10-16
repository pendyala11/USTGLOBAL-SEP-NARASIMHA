import { AbstractControl, ValidationErrors } from "@angular/forms";









export class CustomValidation {
    constructor() {
        
    }

    static uniqueUrl(control : AbstractControl): ValidationErrors | null
    {
        if (control.value ===null) {
            return {uniqueUrl : true};
        } else {
            return null;
        }
    }
}