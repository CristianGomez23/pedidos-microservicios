package com.uptc.grpcmsg.pedidos_service;

import com.uptc.grpcmsg.pedidosservice.grpc.ClienteGrpcGrpc.ClienteGrpcBlockingStub;
import com.uptc.grpcmsg.pedidosservice.grpc.ClienteRequest;
import org.springframework.stereotype.Component;

@Component
public class VerificadorCliente {

    private final ClienteGrpcBlockingStub stub;

    VerificadorCliente(ClienteGrpcBlockingStub stub) {
        this.stub = stub;
    }

    public boolean existe(long clienteId) {
        var request = ClienteRequest.newBuilder().setId(clienteId).build();
        return stub.existeCliente(request).getExiste();
    }

}
