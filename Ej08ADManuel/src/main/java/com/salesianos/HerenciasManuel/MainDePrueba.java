package com.salesianos.HerenciasManuel;

import com.salesianos.HerenciasManuel.model.ClienteCorporativo;
import com.salesianos.HerenciasManuel.model.ClienteParticular;
import com.salesianos.HerenciasManuel.model.Empleado;
import com.salesianos.HerenciasManuel.model.Pedido;
import com.salesianos.HerenciasManuel.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ClienteService clienteService;
    private final ClienteCorporativoService clienteCorporativoService;
    private final ClienteParticularService clienteParticularService;
    private final EmpleadoService empleadoService;
    private final PedidoService pedidoService;

    @PostConstruct
    public void test(){
        List<Pedido> pedidos = List.of(
                Pedido.builder().name("Patata")
                        .price(10f)
                        .address("Calle tus muelas nº69")
                        .build(),
        Pedido.builder().name("Nintendo")
                .price(200f)
                .address("Calle Carmen de Mairena nº96")
                .build(),
                Pedido.builder().name("Play5")
                        .price(500f)
                        .address("Calle Luis Miguel López nº39")
                        .build(),
                Pedido.builder().name("Jamón")
                        .price(40f)
                        .address("Calle Ángel Naranjo nº55")
                        .build()
        );

        pedidoService.saveAll(pedidos);

        ClienteCorporativo clienteCorporativo = ClienteCorporativo.builder()
                .contactName("Alberto")
                .name("Julián")
                .phone("683283943")
                .adress("Calle Negocios nº89")
                .pedidos(pedidos)
                .creditRating("Good")
                .creditLimit(200f)
                .build();

        clienteCorporativoService.save(clienteCorporativo);

        ClienteParticular clienteParticular = ClienteParticular.builder()
                .name("Juan")
                .phone("6989531423")
                .discountPercentage(10)
                .userName("juanete")
                .password("juanitopuntocom")
                .adress("Calle Particular nº12")
                .build();
        clienteParticularService.save(clienteParticular);

        List<Empleado> empleados =List.of(
                Empleado.builder().name("Pepe").surname("Garcia").department("Recursos Humanos").salary(1200).build(),
                Empleado.builder().name("Hugo").surname("Ubago").department("Relaciones Púbicas").salary(1900).build(),
                Empleado.builder().name("Alex").surname("Pimienta").department("Mantenimiento").salary(1100).build()


                );
        empleadoService.saveAll(empleados);

        


    }
}
