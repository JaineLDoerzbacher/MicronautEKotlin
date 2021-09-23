package teste.entities

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Entity
data class ItemDePedido(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @field: NotBlank val codigo: String,
    @field: NotBlank val preco: BigDecimal,
    @field: NotBlank @field: Size(min = 1) val quantidade: Int
)
