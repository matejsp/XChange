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
public class UpdateOrder {

  Integer id;

  Integer cid;

  String cid_date;

  String gid;

  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal price;

  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal amount;

  Integer flags;

  Integer lev;

  @JsonProperty("delta")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal delta;

  @JsonProperty("price_aux_limit")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal priceAuxLimit;

  @JsonProperty("price_trailing")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  BigDecimal priceTrailing;

  @JsonProperty("tif")
  String timeInForce;
}
