package teste.dtos

import teste.entities.Cliente
import teste.entities.ItemDePedido
import teste.entities.Pedido
import java.math.BigDecimal

data class PedidoDTO(val cliente: Cliente,
                     val total: BigDecimal,
                     val itens: List<ItemDePedido>
) {
    fun paraPedido() : Pedido{

        return Pedido(null, cliente, total, itens)
    }
}
