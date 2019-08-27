# gRPCSample
gRPC is a high-performance, lightweight communication framework designed for making traditional RPC calls, and developed by Google. The framework uses HTTP/2, the latest network transport protocol, primarily designed for low latency and multiplexing requests over a single TCP connection using streams. This makes gRPC amazingly fast and flexible compared to REST over HTTP/1.1.

RESTful services are often useful for external-facing services, which are directly exposed to consumers. As they are based on conventional text-based messaging (JSON, XML, CVS over HTTP, etc.), which are optimized for humans, these are not ideal choices for internal service-to-service communication.

Rather, using a text-based messaging protocol, we can leverage a binary protocol that is optimized for inter-service communication. The Cloud Native Computing Foundation’s gRPC (gRPC Remote Procedure Call) is an ideal choice for inter-service communication since it uses protocol buffers as the binary data interchange format for inter-service communication.

When we build multiple microservices with different technologies and programming languages, it is important to have a standard way to define service interfaces and underlying message interchange formats. gRPC offers a clean and powerful way to specify <b>service contracts<b> using protocol buffers. Therefore, gRPC is probably the most viable solution for building communication between internal microservices.
  
  In this project we have created a simple gRpcServer & gRpcConsumer to explain the communication between services.
