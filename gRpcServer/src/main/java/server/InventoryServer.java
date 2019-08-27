package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class InventoryServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(9000)
                .addService(new InventoryServiceImpl()).build();

        server.start();
        server.awaitTermination();
    }
}
