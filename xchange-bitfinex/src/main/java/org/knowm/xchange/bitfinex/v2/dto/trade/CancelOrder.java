package org.knowm.xchange.bitfinex.v2.dto.trade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CancelOrder {

  Integer id;

  Integer cid;

  String cid_date;
}
