package com.kt.donors.model.enums;

import lombok.Getter;

@Getter
public enum PaymentValue {
     STUDENT(5), NORMAL(25);

    PaymentValue(int i) {
    }

}
