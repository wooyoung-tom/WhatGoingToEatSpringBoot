package wooyoung.tom.simplespringboot.market.repository

import org.springframework.data.jpa.repository.JpaRepository
import wooyoung.tom.simplespringboot.market.entity.MarketOrder

interface MarketOrderRepository : JpaRepository<MarketOrder, Long> {

    fun findMarketOrdersByUserIdAndOrderStatus(
        userId: Long, status: String
    ): List<MarketOrder>
}