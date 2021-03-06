package wooyoung.tom.simplespringboot.order.dto.find

import wooyoung.tom.simplespringboot.order.detail.MarketOrderDetailEntity
import wooyoung.tom.simplespringboot.restaurant.MarketRestaurantEntity

data class MarketOrderFindResponseItem(

    val orderId: Long,

    val restaurant: MarketRestaurantEntity,

    val totalPrice: Int,

    val orderDetailList: List<MarketOrderDetailEntity>
)