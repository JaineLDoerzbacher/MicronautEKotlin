package teste.entities

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Pedido(
    @field: Id @field: GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @ManyToOne
    val cliente: Cliente,
    val total: BigDecimal,
    @OneToMany
    val itens: List<ItemDePedido>
)
