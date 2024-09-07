# java-quarkus-challenge
This is a project of an Election System built with Java and Quarkus as main technologies as part of DIO's Bootcamp

### Terminal Shots

1. curl -s "https://get.sdkman.io" | bash
2. source "/home/kalinux/.sdkman/bin/sdkman-init.sh"
3. sdk --version
4. sdk help install
5. sdk install java 17.0.6-tem
6. sdk use java 17.0.6-tem
7. echo $JAVA_HOME
8. sdk install quarkus 2.16.4.Final
9. quarkus --version
10. java --version
11. javac --version
12. quarkus create app me.dio:election-management \
--extension='resteasy-reactive,logging-gelf,opentelemetry,smallrye-context-propagation,smallrye-health' \
--no-code
13. quarkus create app me.dio:voting-app \
--extension='resteasy-reactive,logging-gelf,opentelemetry,smallrye-context-propagation,smallrye-health' \
--no-code
14. quarkus create app me.dio:result-app \
--extension='resteasy-reactive,logging-gelf,opentelemetry,smallrye-context-propagation,smallrye-health' \
--no-code
15. docker-compose up -d reverse-proxy
16. docker-compose up -d jaeger
17. docker-compose up -d mongodb opensearch
18. docker-compose up -d graylog
19. curl -H "Content-Type: application/json" \
-H "Authorization: Basic YWRtaW46YWRtaW4=" \
-H "X-Requested-By: curl" \
-X POST -v -d '{"title":"udp
input","configuration":{"recv_buffer_size":262144,"bind_address":"0.0.0.0","port":12201,"de
compress_size_limit":8388608},"type":"org.graylog2.inputs.gelf.udp.GELFUDPInput","global":t
rue}' http://logging.private.dio.localhost/api/system/inputs
17. (...)