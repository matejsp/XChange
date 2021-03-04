package org.knowm.xchange.bitfinex.v2.dto.trade;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NewOrder {

  String gid;

  String cid;

  String type;

  String symbol;

  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal price;

  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal amount;

  Integer flags;

  @JsonProperty("price_trailing")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal priceTrailing;

  @JsonProperty("price_aux_limit")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal priceAuxLimit;

  @JsonProperty("price_oco_stop")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal priceOcoStop;

  @JsonProperty("tif")
  String timeInForce;

  Object meta;
}
