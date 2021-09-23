package teste.controllers

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import teste.dtos.PedidoDTO
import javax.validation.Valid

@Validated
@Controller("/pedidos")
class PedidoController {

    @Post
    fun cadastraPedido(@Body @Valid request: PedidoDTO){

        val pedido = request.paraPedido()

        println("Pedido => ${pedido.cliente}")

    }
}