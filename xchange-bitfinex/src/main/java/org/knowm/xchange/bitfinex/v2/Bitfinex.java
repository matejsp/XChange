package org.knowm.xchange.bitfinex.v2;

import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.knowm.xchange.bitfinex.v2.dto.BitfinexExceptionV2;
import org.knowm.xchange.bitfinex.v2.dto.marketdata.BitfinexPublicFundingTrade;
import org.knowm.xchange.bitfinex.v2.dto.marketdata.BitfinexPublicTrade;
import org.knowm.xchange.bitfinex.v2.dto.marketdata.Status;

@Path("v2")
@Produces(MediaType.APPLICATION_JSON)
public interface Bitfinex {

  @GET
  @Path("platform/status")
  List<Integer> getPlatformStatus() throws IOException, BitfinexExceptionV2;

  @GET
  @Path("tickers")
  List<ArrayNode> getTickers(@QueryParam("symbols") String symbols)
      throws IOException, BitfinexExceptionV2;

  @GET
  @Path("ticker/{ticker}")
  ArrayNode getTicker(@PathParam("ticker") String ticker) throws IOException, BitfinexExceptionV2;

  @GET
  @Path("tickers/hist")
  List<ArrayNode> getTickersHistory(@QueryParam("symbols") String symbols)
      throws IOException, BitfinexExceptionV2;

  @GET
  @Path("status/{type}")
  List<Status> getStatus(@PathParam("type") String type, @QueryParam("keys") String symbols)
      throws IOException, BitfinexExceptionV2;

  @GET
  @Path("/trades/{symbol}/hist")
  BitfinexPublicFundingTrade[] getPublicFundingTrades(
      @PathParam("symbol") String fundingSymbol,
      @QueryParam("limit") int limit,
      @QueryParam("start") long startTimestamp,
      @QueryParam("end") long endTimestamp,
      @QueryParam("sort") int sort)
      throws IOException, BitfinexExceptionV2;

  @GET
  @Path("/trades/{symbol}/hist")
  BitfinexPublicTrade[] getPublicTrades(
      @PathParam("symbol") String fundingSymbol,
      @QueryParam("limit") int limit,
      @QueryParam("start") long startTimestamp,
      @QueryParam("end") long endTimestamp,
      @QueryParam("sort") int sort)
      throws IOException, BitfinexExceptionV2;

  @GET
  @Path("/book/{symbol}/{precision}")
  List<ArrayNode> getBook(
      @PathParam("symbol") String fundingSymbol,
      @PathParam("precision") String precision,
      @QueryParam("len") int len)
      throws IOException, BitfinexExceptionV2;
}
