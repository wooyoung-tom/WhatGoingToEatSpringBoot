package wooyoung.tom.simplespringboot.market.entity

import javax.persistence.*

@Entity
@Table(name = "market_review")
data class MarketReview(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val reviewMarketUser: MarketUser,

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    val reviewMarketRestaurant: MarketRestaurant,

    @Column(name = "content")
    val content: String,

    @Column(name = "rating")
    val rating: Float
)