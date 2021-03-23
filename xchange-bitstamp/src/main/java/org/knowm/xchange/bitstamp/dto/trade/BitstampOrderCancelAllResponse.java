package org.knowm.xchange.bitstamp.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BitstampOrderCancelAllResponse {

    private final List<BitstampOrderCancelResponse> canceled;

    private final boolean success;

    public BitstampOrderCancelAllResponse(
            @JsonProperty("canceled") List<BitstampOrderCancelResponse> canceled,
            @JsonProperty("success") boolean success) {

        this.canceled = canceled;
        this.success = success;
    }

    public List<BitstampOrderCancelResponse> getCanceled() {
        return canceled;
    }

    public boolean isSuccess() {
        return success;
    }

}
