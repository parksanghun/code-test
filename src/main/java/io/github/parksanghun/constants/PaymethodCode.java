package io.github.parksanghun.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public enum PaymethodCode {

    CARD("100000000000", "CARD", "신용카드"),
    DIRECTBANK("010000000000", "DirectBank", "계좌이체"),
    VACC("001000000000", "VACC", "가상계좌"),
    MOBILE("000010000000", "MOBILE", "휴대폰");

    @Getter
    private String code;
    @Getter
    private String codeName;
    @Getter
    private String description;
}
