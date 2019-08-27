package consumer;

import com.google.protobuf.StringValue;
import com.grpc.Inventory;
import com.grpc.InventoryServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class InventoryConsumer {
    public static void main(String[] args) {
        // Use useTransportSecurity in place of usePlaintext() for production systems.
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 9000)
                .usePlaintext().build();
        // Creating synchronous stub
        InventoryServiceGrpc.InventoryServiceBlockingStub stub = InventoryServiceGrpc.newBlockingStub(channel);
        Inventory.Item item = stub.getItemByID(StringValue.newBuilder().setValue("123").build());
        System.out.println("Response : " + item.getDescription());
    }
}
