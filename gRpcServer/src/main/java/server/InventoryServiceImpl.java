package server;


import com.google.protobuf.StringValue;
import com.grpc.Inventory;
import com.grpc.InventoryServiceGrpc;
import io.grpc.stub.StreamObserver;

public class InventoryServiceImpl extends InventoryServiceGrpc.InventoryServiceImplBase {
    @Override
    public void getItemByName(StringValue request, StreamObserver<Inventory.Items> responseObserver) {
        Inventory.Items items = Inventory.Items.newBuilder().build();
        responseObserver.onNext(items);
        responseObserver.onCompleted();
    }

    // Response observer is a callback that we have to invoke when we want to send something to the client.
    // Obeserver in return is callback listener which run when messages come into the server. (in case of streams.)

    @Override
    public void getItemByID(StringValue request, StreamObserver<Inventory.Item> responseObserver) {
        responseObserver.onNext(Inventory.Item.newBuilder()
                .setId(request.getValue())
                .setName("Item 1")
                .setDescription("Item 1 from server.")
                .build());
        responseObserver.onCompleted();
    }
}
